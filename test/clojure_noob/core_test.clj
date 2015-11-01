(ns clojure-noob.core-test
  (:require [clojure.test :refer :all]
            [clojure-noob.core :refer :all]))

(deftest four_clojure
  (testing "4Clojure"
    (testing "Question 52" (is (= 1 1)))
    (testing "Question 53"
      (is (= (a_53 [1 0 1 2 3 0 4 5]) [0 1 2 3]))
      (is (= (a_53 [5 6 1 3 2 7]) [5 6]))
      (is (= (a_53 [2 3 3 4 5]) [3 4 5]))
      (is (= (a_53 [7 6 5 4]) [])))
    (testing "Question 54"
      (is (= (a_54 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8))))
      (is (= (a_54 2 (range 8)) '((0 1) (2 3) (4 5) (6 7))))
      (is (= (a_54 3 (range 8)) '((0 1 2) (3 4 5)))))
    (testing "Question 55"
      (is (= (a_55 [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1}))
      (is (= (a_55 [:b :a :b :a :b]) {:a 2, :b 3}))
      (is (= (a_55 '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2})))))
