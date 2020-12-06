(def nome (String/valueOf (read-line)))
(cond
    (> (count nome) 80) 
        (println "NO")

    :else 
        (println "YES")
)