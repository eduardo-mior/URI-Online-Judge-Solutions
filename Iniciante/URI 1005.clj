(def a (read-string (read-line)))
(def b (read-string (read-line)))
(def media (/ (+ (* 3.5 a) (* 7.5 b)) 11.0))

(printf "MEDIA = %.5f\n" media)