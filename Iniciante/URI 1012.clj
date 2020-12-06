(require '[clojure.string :as str])

(def line (str/split (read-line) #" "))
(def a (Float/parseFloat (get line 0)))
(def b (Float/parseFloat (get line 1)))
(def c (Float/parseFloat (get line 2)))

(def triangulo (/ (* a c) 2.0))
(def circulo (* 3.14159 (* c c)))
(def trapezio (/ (* (+ a b) c) 2.0))
(def quadrado (* b b))
(def retangulo (* a b))

(printf "TRIANGULO: %.3f\n" triangulo)
(printf "CIRCULO: %.3f\n" circulo)
(printf "TRAPEZIO: %.3f\n" trapezio)
(printf "QUADRADO: %.3f\n" quadrado)
(printf "RETANGULO: %.3f\n" retangulo)