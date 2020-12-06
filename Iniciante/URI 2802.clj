(def N (read-string (read-line)))
(def resposta  (/ (+ (- (+ (- (Math/pow N 4.0) (* 6.0 (Math/pow N 3.0))) (* 23.0 (Math/pow N 2.0))) (* 18.0 N)) 24.0) 24.0))
(printf "%.0f\n" resposta)