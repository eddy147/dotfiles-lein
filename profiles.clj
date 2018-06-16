{:user {:dependencies [[org.clojure/tools.namespace "0.2.3"]
                       [org.clojure/tools.nrepl "0.2.13"]
                       [cljfmt "0.5.7"]
                       [spyscope "0.1.3"]
                       [criterium "0.4.1"]]
        :injections [(require '(clojure.tools.namespace repl find))
                     ; try/catch to workaround an issue where `lein repl` outside a project dir
                     ; will not load reader literal definitions correctly:
                     (try (require 'spyscope.core)
                       (catch RuntimeException e))]
        :plugins [[lein-pprint "1.1.1"]
                  [lein-beanstalk "0.2.6"]
                  [lein-cljfmt "0.5.7"]
                  [lein-clojars "0.9.1"]
                  [lein-create-template "0.1.1"]
                  [lein-marginalia "0.7.1"]
                  [lein-exec "0.3.1"]
                  [lein-midje "3.1.1"]
                  [lein-kibit "0.0.8"]]}}
