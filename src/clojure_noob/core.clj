(ns clojure-noob.core
  (:gen-class))

;; Answer to Question 53
(defn a_53[coll]
  (loop [longest_coll [] temp_coll [(first coll)] rest_coll (rest coll)]
    (if (empty? (seq rest_coll))
      (if (and (< (count longest_coll) (count temp_coll)) (< 1 (count temp_coll)))
        temp_coll
        longest_coll)
      (if (= (inc (last temp_coll)) (first rest_coll))
        (recur longest_coll (conj temp_coll (first rest_coll)) (rest rest_coll))
        (if (and (< (count longest_coll) (count temp_coll)) (< 1 (count temp_coll)))
          (recur temp_coll [(first rest_coll)] (rest rest_coll))
          (recur longest_coll [(first rest_coll)] (rest rest_coll)))))))

;; Answer to Question 54
(defn a_54[group_size coll]
  (loop [new_coll [] rest_coll coll]
    (if (empty? rest_coll)
      (filter #(= (count %) group_size) new_coll)
      (recur (conj new_coll (take group_size rest_coll)) (drop group_size rest_coll)))))

;; Answer to Question 55
(defn a_55[coll]
  (let [new_map (group-by identity coll)]
    (zipmap (map first (vals new_map)) (map count (vals new_map)))))
