(ns exploring-monads.core-test
  (:require [clojure.test :refer :all]
            [exploring-monads.core :refer :all]))

(deftest test-sane-parameters
  (testing "pretty-msg with with sane parameters"
    (is (= (pretty-msg "test" 3) "***test***"))))

(deftest test-nil-amount
  (testing "pretty-msg with with amount=nil"
  (is (= (pretty-msg "JVM" nil) nil))))