(ns myapp.routes.pretty-msg)

(use 'clojure.algo.monads)
 
(defn pretty-msg [msg asterisk-amount]
  (domonad maybe-m 
           [a asterisk-amount
            b (clojure.string/join (repeat asterisk-amount "*"))
            c (str b msg)
            :when (> (count msg) 0)]
           (str c b)))