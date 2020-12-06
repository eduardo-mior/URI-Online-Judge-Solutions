(require '[clojure.string :as str])

(def line (str/split (read-line) #" "))
(def A (Integer/parseInt (get line 0)))
(def B (Integer/parseInt (get line 1)))
(def C (Integer/parseInt (get line 2)))
(def D (Integer/parseInt (get line 3)))

(cond
    (and (> B C) (> D A) (> (+ C D) (+ A B)) (> C 0) (> D 0) (== 0 (mod A 2))) 
        (println "Valores aceitos")

    :else 
        (println "Valores nao aceitos")   
)