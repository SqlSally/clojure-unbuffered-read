(defproject clojure-template "1.0.0-SNAPSHOT"
  :description "A generic template for clojure"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0" 
  :mirrors {#"clojars"
            {:name "Clojar Mirror"
             :url "https://mirrors.tuna.tsinghua.edu.cn/clojars"
             :repo-manager true}}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 ;nrepl
                 [nrepl/lein-nrepl "0.3.2"]
                 [io.aviso/logging "1.0"]
                 [integrant "0.8.0"]
                 [jline "0.9.94"]
                 [environ "1.2.0"]]
  :plugins [[lein-bikeshed "0.5.2"]
            [lein-environ "1.2.0"]
            [lein-pprint "1.3.2"]
            [lein-cloverage "1.2.2"]
            [com.jakemccrary/lein-test-refresh "0.25.0"]]
  :main ^:skip-aot ga.rugal.clojure.main
  :test-refresh {:quiet true}
  :bikeshed {:var-redefs           false
             :trailing-blank-lines false
             :max-line-length      100
             :name-collisions      false}
  :cloverage {:junit?         true
              :fail-threshold 90}
  :uberjar-name "clojure-standalone.jar"
  :profiles {:default     {:env {}}
             :uberjar     {:aot :all}
             :production  {}})
