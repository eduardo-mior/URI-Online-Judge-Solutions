(require '[clojure.string :as str])

(def line1 (str/split (read-line) #" "))
(def x1 (Double/parseDouble (get line1 0)))
(def y1 (Double/parseDouble (get line1 1)))

(def line2 (str/split (read-line) #" "))
(def x2 (Double/parseDouble (get line2 0)))
(def y2 (Double/parseDouble (get line2 1)))

(def distancia (Math/sqrt (+ (Math/pow (- x2 x1) 2.0) (Math/pow (- y2 y1) 2.0))))

(printf "%.4f\n" distancia)