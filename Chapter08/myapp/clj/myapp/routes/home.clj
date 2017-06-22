(ns myapp.routes.home
  (:require [myapp.layout :as layout]
            [myapp.routes.pretty-msg :as prettymsg]
            [compojure.core :refer [defroutes GET POST]]
            [ring.util.http-response :as response]
            [clojure.java.io :as io]))

(defn home-page []
  (layout/render
    "home.html" {:docs (-> "docs/docs.md" io/resource slurp)}))

(defn about-page []
  (layout/render "about.html"))

(defn monad-test-page [msg]
  (layout/render
    "monadtest.html" {:prettymsg (prettymsg/pretty-msg msg 10) :msg msg }))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/about" [] (about-page))
  (GET "/monadtest" [] (monad-test-page nil))
  (POST "/monadtest" [msg] (monad-test-page msg))
  )
