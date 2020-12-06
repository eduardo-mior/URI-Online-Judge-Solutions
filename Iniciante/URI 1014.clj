(require '[clojure.string :as str])

(def x (read-string (read-line)))
(def y (read-string (read-line)))

(def media (/ x y))

(printf "%.3f km/l\n" media)