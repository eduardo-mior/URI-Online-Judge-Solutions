(def a (read-string (read-line)))
(def b (read-string (read-line)))
(def c (read-string (read-line)))
(def media (/ (+ (* a 2) (* b 3) (* c 5)) 10))

(printf "MEDIA = %.1f\n" media)