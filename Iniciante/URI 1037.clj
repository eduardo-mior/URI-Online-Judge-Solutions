(require '[clojure.string :as str])

(def valor (read-string (read-line)))

(cond
    (and (>= valor 0.0) (<= valor 25)) 
        (println "Intervalo [0,25]")
    
    (and (> valor 25) (<= valor 50)) 
        (println "Intervalo (25,50]")

    (and (> valor 50) (<= valor 75))
        (println "Intervalo (50,75]")

    (and (> valor 75) (<= valor 100))
        (println "Intervalo (75,100]")

    :else 
        (println "Fora de intervalo")
)