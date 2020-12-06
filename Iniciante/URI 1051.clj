(require '[clojure.string :as str])

(def salario (read-string (read-line)))

(cond
    (and (>= salario 0.0) (<= salario 2000.0)) 
        (printf "Isento\n")
    
    (and (> salario 2000.0) (<= salario 3000.0)) 
        (printf "R$ %.2f\n" (* 0.08 (- salario 2000.0)))

    (and (> salario 3000.0) (<= salario 4500.0))
        (printf "R$ %.2f\n" (+ 80 (* 0.18 (- salario 3000.0))))

    :else 
        (printf "R$ %.2f\n" (+ 350 (* 0.28 (- salario 4500.0))))
)