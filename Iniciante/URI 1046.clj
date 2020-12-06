(require '[clojure.string :as str])

(def line (str/split (read-line) #" "))
(def hInicial (Integer/parseInt (get line 0)))
(def hFinal (Integer/parseInt (get line 1)))

(cond
    (> hInicial hFinal) 
        (printf "O JOGO DUROU %d HORA(S)\n" (- 24 (- hInicial hFinal)))
    
    (> hFinal hInicial) 
        (printf "O JOGO DUROU %d HORA(S)\n" (- hFinal hInicial))
    
    :else 
        (printf "O JOGO DUROU 24 HORA(S)\n")   
)