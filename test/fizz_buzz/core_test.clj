(ns fizz-buzz.core-test
  (:require [clojure.test :refer :all]
            [fizz-buzz.core :refer :all]))

;; - [x] 数を文字列に変換する
;;  - [x] 1を渡すと文字列1を返す
;;  - [x] 2を渡すと文字列2を返す
;; - [x] 3の倍数のときは「Fizz」に変換する
;;  - [x] 3を渡すと「Fizz」を返す
;; - [ ] 5の倍数のときは「Buzz」に変換する
;; - [ ] 3と5両方の倍数のときは「FizzBuzz」に変換する

(deftest fizzbuzz-test-number
  (testing "数を文字列に変換する"
    (testing "1を渡すと文字列1を返す"
      (is (= "1" (convert 1))))
    (testing "2を渡すと文字列2を返す"
      (is (= "2" (convert 2))))
    )
  (testing "3の倍数のときは「Fizz」に変換する"
    (testing "3を渡すと「Fizz」を返す"
      (is (= "Fizz" (convert 3))))
    )
  )
