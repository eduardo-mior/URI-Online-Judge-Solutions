(require '[clojure.string :as str])

(def line (str/split (read-line) #" "))
(def e (Integer/parseInt (get line 0)))
(def d (Integer/parseInt (get line 1)))

(cond
    (> e d) 
        (println "Eu odeio a professora!")
    
    (>= (- d e) 3) 
        (println "Muito bem! Apresenta antes do Natal!")
    
    (< (+ e 2) 24) 
        (println "Parece o trabalho do meu filho!\nTCC Apresentado!")
    
    :else 
        (println "Parece o trabalho do meu filho!\nFail! Entao eh nataaaaal!")   
)