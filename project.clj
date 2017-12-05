(defproject log4j-riemann-appender "0.1.1"
  :description "A log4j appender implementation to write to a Riemann server."
  :url "https://github.com/Atsman/log4j-riemann-appender"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[io.riemann/riemann-java-client "0.4.5"]]
  :java-source-paths ["src"]
  :java-test-paths ["test"]
  :profiles {:provided {:dependencies [[log4j/log4j "1.2.17"]]}}
  :lein-release {:deploy-via :clojars})
