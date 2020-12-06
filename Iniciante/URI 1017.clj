(def tempo (read-string (read-line)))
(def velocidade (read-string (read-line)))
(def kilometros (* tempo velocidade))
(def media (/ kilometros 12))

(printf "%.3f\n" media)