(def funcionarios (read-string (read-line)))
(def horas (read-string (read-line)))
(def valorPorHora (read-string (read-line)))
(def salario (* horas valorPorHora))

(printf "NUMBER = %d\n" funcionarios)
(printf "SALARY = U$ %.2f\n" salario)