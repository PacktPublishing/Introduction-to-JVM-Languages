(defproject exploring-monads "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"],
                 [org.clojure/algo.monads "0.1.6"]]
  :main ^:skip-aot exploring-monads.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
