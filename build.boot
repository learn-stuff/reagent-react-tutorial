(set-env!
 :source-paths #{"src/cljs"}
 :resource-paths #{"html"}

 :dependencies '[[org.clojure/clojure "1.8.0"]        ;; add CLJ
                [org.clojure/clojurescript "1.7.228"] ;; add CLJS
                [adzerk/boot-cljs "1.7.170-3"]
                [adzerk/boot-cljs-repl "0.3.0"]       ;; add bREPL
                [com.cemerick/piggieback "0.2.1"]     ;; needed by bREPL
                [weasel "0.7.0"]                      ;; needed by bREPL
                [org.clojure/tools.nrepl "0.2.12"]    ;; needed by bREPL
                [org.clojars.magomimmo/domina "2.0.0-SNAPSHOT"]
                [reagent "0.6.0-alpha"]
                [cljsjs/marked "0.3.5-0"]])

(require '[adzerk.boot-cljs :refer [cljs]]
         '[adzerk.boot-cljs-repl :refer [cljs-repl start-repl]])

(deftask dev []
  (comp (watch)
        (cljs-repl) ; order is important!!
        (cljs)))
