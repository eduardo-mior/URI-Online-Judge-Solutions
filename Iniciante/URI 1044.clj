(require '[clojure.string :as str])

(def line (str/split (read-line) #" "))
(def A (Integer/parseInt (get line 0)))
(def B (Integer/parseInt (get line 1)))

(cond
    (or (== 0 (mod A B)) (== 0 (mod B A)))
        (println "Sao Multiplos")

    :else 
        (println "Nao sao Multiplos")   
)