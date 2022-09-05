(ns fizz-buzz.core-test
  (:require [clojure.test :refer :all]
            [fizz-buzz.core :refer :all]))

;; - [x] 数を文字列に変換する
;;  - [x] 1を渡すと文字列1を返す
;;  - [x] 2を渡すと文字列2を返す
;; - [x] 3の倍数のときは「Fizz」に変換する
;;  - [x] 3を渡すと「Fizz」を返す
;; - [x] 5の倍数のときは「Buzz」に変換する
;;  - [x] 5を渡すと「Buzz」を返す
;; - [x] 3と5両方の倍数のときは「FizzBuzz」に変換する
;;  - [x] 15を渡すと「FizzBuzz」を返す

(deftest fizzbuzz-test-convert
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
  (testing "5の倍数のときは「Buzz」に変換する"
    (testing "5を渡すと「Buzz」を返す"
      (is (= "Buzz" (convert 5))))
    )
  (testing "3と5両方の倍数のときは「FizzBuzz」に変換する"
    (testing "15を渡すと「FizzBuzz」を返す"
      (is (= "Fizzbuzz" (convert 15))))
    )
  )

;; - [x] 1〜nまでのFizzBuzzの列を返す
;;  - [x] 1〜15までの列を返す

(deftest fizzbuzz-test-list
  (testing "1〜nまでのFizzBuzzの列を返す"
    (testing "1〜15までの列を返す"
      (is (= ["1" "2" "Fizz" "4" "Buzz" "Fizz" "7" "8" "Fizz" "Buzz" "11" "Fizz" "13" "14" "Fizzbuzz"]
             (fizzbuzzlist 15))))
    )
  )
