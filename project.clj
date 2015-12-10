(defproject gorillalabs/log4j-riemann-appender "0.1.0-SNAPSHOT"
  :description "A log4j appender implementation to write to a Riemann server."
  :url "https://github.com/gorillalabs/log4j-riemann-appender/"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[com.aphyr/riemann-java-client "0.4.1"]]
  :java-source-paths ["src"]
  :java-test-paths ["test"]
  :profiles {:provided {:dependencies [[log4j/log4j "1.2.17"]]}
              :dev      {:dependencies [[org.mockito/mockito-all "1.10.19"]
                                        [junit/junit "4.12"]]}}
  :lein-release {:deploy-via :clojars})
