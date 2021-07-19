(defproject org.clojars.lverns/demo-lib "0.1.0"
  :description "A demo library"
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :repl-options {:init-ns demo-lib.core}
  :deploy-repositories [["releases" {:url "https://repo.clojars.org"
                                     :sign-releases false}]
                        ["snapshots" :clojars]])
