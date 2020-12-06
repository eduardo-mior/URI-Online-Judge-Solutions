(def pi 3.14159)
(def raio (read-string (read-line)))
(def volume  (* (* (/ 4.0 3.0) pi) (Math/pow raio 3.0)))
(printf "VOLUME = %.3f\n" volume)