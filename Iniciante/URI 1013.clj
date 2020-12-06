(require '[clojure.string :as str])

(def line (str/split (read-line) #" "))
(def valor1 (Integer/parseInt (get line 0)))
(def valor2 (Integer/parseInt (get line 1)))
(def valor3 (Integer/parseInt (get line 2)))

(cond
    (and (> valor1 valor2) (> valor1 valor3)) 
        (printf "%d eh o maior\n" valor1)

    (> valor2 valor3) 
        (printf "%d eh o maior\n" valor2)

    :else 
        (printf "%d eh o maior\n" valor3)
)