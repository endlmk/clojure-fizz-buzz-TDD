(ns fizz-buzz.core-test
  (:require [clojure.test :refer :all]
            [fizz-buzz.core :refer :all]))

;; - [] 数を文字列に変換する
;; - [] 3の倍数のときは「Fizz」に変換する
;; - [] 5の倍数のときは「Buzz」に変換する
;; - [] 3と5両方の倍数のときは「FizzBuzz」に変換する

(deftest fizzbuzz-test
  (testing "1を渡すと文字列1を返す"
    (is (= "1" (convert 1)))))

