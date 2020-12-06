(require '[clojure.string :as str])

(def line (str/split (read-line) #" "))
(def x (Double/parseDouble (get line 0)))
(def y (Double/parseDouble (get line 1)))

(cond
    (and (== x 0) (== y 0)) 
        (println "Origem")
    
    (== x 0) 
        (println "Eixo Y")
    
    (== y 0) 
        (println "Eixo X")
    
    (and (> y 0) (> x 0)) 
        (println "Q1")

    (and (> y 0) (< x 0)) 
        (println "Q2")

    (and (< y 0) (< x 0)) 
        (println "Q3")

    (and (< y 0) (> x 0)) 
        (println "Q4")
)