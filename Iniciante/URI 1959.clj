(require '[clojure.string :as str])

(def line (str/split (read-line) #" "))
(def N (Integer/parseInt (get line 0)))
(def L (Integer/parseInt (get line 1)))

(def P (* N L))

(printf "%.0f\n" P)