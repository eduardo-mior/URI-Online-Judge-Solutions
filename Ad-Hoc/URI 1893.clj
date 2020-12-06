(require '[clojure.string :as str])

(def line (str/split (read-line) #" "))
(def inicio (Integer/parseInt (get line 0)))
(def final (Integer/parseInt (get line 1)))

(cond
    (and (>= inicio 0) (<= final 2)) 
        (println "nova")
    
    (and (> final inicio) (<= final 96)) 
        (println "crescente")
    
    (and (>= inicio final) (<= final 96)) 
        (println "minguante")
    
    :else 
        (println "cheia")   
)