(require '[clojure.string :as str])

(def line1 (str/split (read-line) #" "))
(def cod1 (Integer/parseInt (get line1 0)))
(def n1 (Integer/parseInt (get line1 1)))
(def valor1 (Float/parseFloat (get line1 2)))

(def line2 (str/split (read-line) #" "))
(def cod2 (Integer/parseInt (get line2 0)))
(def n2 (Integer/parseInt (get line2 1)))
(def valor2 (Float/parseFloat (get line2 2)))

(def total (+ (* n1 valor1) (* n2 valor2)))

(printf "VALOR A PAGAR: R$ %.2f\n" total)