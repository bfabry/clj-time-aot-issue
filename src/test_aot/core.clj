(ns test-aot.core
  (:require [clj-time.coerce :as c]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
