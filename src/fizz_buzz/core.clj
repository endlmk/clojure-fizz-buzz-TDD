(ns fizz-buzz.core
  (:gen-class))

(defn convert [n]
  (cond
    (and (= (rem n 3) 0) (= (rem n 5) 0)) "Fizzbuzz"
    (= (rem n 3) 0) "Fizz"
    (= (rem n 5) 0) "Buzz"
    :else (str n)))
  
(defn fizzbuzzlist [n]
  (map convert (range 1 (+ n 1))))

(defn -main
  "fizzbuzz 100"
  [& args]
  (doseq [item (fizzbuzzlist 100)] 
    (println item)))
    