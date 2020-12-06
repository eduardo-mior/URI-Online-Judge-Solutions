(require '[clojure.string :as str])

(def line (str/split (read-line) #" "))
(def T1 (Integer/parseInt (get line 0)))
(def T2 (Integer/parseInt (get line 1)))
(def T3 (Integer/parseInt (get line 2)))
(def T4 (Integer/parseInt (get line 3)))

(def totalTomadas(- (+ T1 T2 T3 T4) 3))

(println totalTomadas)