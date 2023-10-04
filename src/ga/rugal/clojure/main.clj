(ns ga.rugal.clojure.main
  "Main entrance."
  (:import (jline ConsoleReader))
  (:require [clojure.java.io :as io]
            [integrant.core :as ig])
  (:gen-class))

(def config
  (-> (io/resource "config.edn")
      slurp
      ig/read-string))

(defmethod ig/init-key :application/main [_ {:keys [router]}]
  (println "please input:")
  (let [r (ConsoleReader.) c (.readVirtualKey r) output (str "[" c "]")] (println output)))

(defn -main "Main function" []
  (ig/init config))
