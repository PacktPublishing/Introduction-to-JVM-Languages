(ns com.example.main 
    (:gen-class :name com.example.Main))

(defn -main [] (println "hi!"))

(compile 'com.example.main)