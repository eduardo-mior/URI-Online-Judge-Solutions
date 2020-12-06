(require '[clojure.string :as str])

(def line (str/split (read-line) #" "))
(def A (Double/parseDouble (get line 0)))
(def B (Double/parseDouble (get line 1)))

(def aumento (- (/ (* B 100.0) A) 100.0))

(printf "%.2f%%\n" aumento)