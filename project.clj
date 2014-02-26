(defproject intro "0.1.0-SNAPSHOT"
  :description "Intro to Clojure based on http://learnxinyminutes.com/docs/clojure/"
  :url "https://github.com/walkermatt/clojure-intro"
  :license {:name "Attribution-ShareAlike 3.0 Unported (CC BY-SA 3.0)"
            :url "http://creativecommons.org/licenses/by-sa/3.0/deed.en_US"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :main ^:skip-aot intro.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
