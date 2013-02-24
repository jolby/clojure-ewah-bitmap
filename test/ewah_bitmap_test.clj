(ns ewah-bitmap-test
  (:use clojure.test
        ewah-bitmap))

(deftest create-ewah-bitmap
  (testing "Simple creation of ewah bitmap"
    (is (not (nil? (ewah-bitmap))))
    (is (not (nil? (ewah-bitmap (long-array [1 4 7])))))
    ;; (println (.toDebugString (ewah-bitmap (long-array [1 4 7]))))
    ;; (println (ewah-bitmap (long-array [1 4 7])))
    ;; (println (vec (.toArray (ewah-bitmap (long-array [1 4 7]))))
    )
  (testing "Convert Bitmap to seq"
    (is (not (nil? (bitseq (ewah-bitmap (long-array [1 4 7]))))))
    (is (= (vec (bitseq (ewah-bitmap (long-array [1 4 7])))) [1 4 7]))
    ;;(println (bitseq (ewah-bitmap (long-array [1 4 7]))))
    ))

