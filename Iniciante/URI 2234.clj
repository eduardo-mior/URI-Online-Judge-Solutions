(require '[clojure.string :as str])

(def line (str/split (read-line) #" "))
(def H (Float/parseFloat (get line 0)))
(def P (Float/parseFloat (get line 1)))

(def media (/ H P))

(printf "%.2f\n" media)