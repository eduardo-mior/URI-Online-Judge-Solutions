(def L (read-string (read-line)))
(def C (read-string (read-line)))

(def lajes1 (+ (* L C) (* (- L 1) (- C 1))))
(def lajes2 (+ (* (- L 1) 2) (* (- C 1) 2)))

(println lajes1)
(println lajes2)