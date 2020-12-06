(def nome (read-string (read-line)))
(def salarioFixo (read-string (read-line)))
(def vendas (read-string (read-line)))
(def total (+ (/ (* vendas 15.0) 100.0) salarioFixo))

(printf "TOTAL = R$ %.2f\n" total)