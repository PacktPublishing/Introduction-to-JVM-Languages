(def invoice-agent (agent (hash-map :name nil, :isProcessed false)))

(defn update-customer-name [state name] (assoc state :name name))
(defn update-processed [state flag] (assoc state :isProcessed flag))

(send invoice-agent update-customer-name "Your Name")

(Thread/sleep 3000)

@invoice-agent

(defn validator-invoice [state]
  (if 
   (and 
     (get state :isProcessed)
     (clojure.string/blank? (get state :name)))
   false
   true)  
)

(set-validator! invoice-agent validator-invoice)

(send invoice-agent update-processed true)

(Thread/sleep 3000)

@invoice-agent

(send invoice-agent update-customer-name nil)

(Thread/sleep 3000)

@invoice-agent

(agent-error invoice-agent)

(restart-agent 
  invoice-agent
  (hash-map :name nil, :isProcessed false)
  :clear-actions true)

(Thread/sleep 3000)

@invoice-agent

(shutdown-agents)