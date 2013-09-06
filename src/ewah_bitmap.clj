(ns ewah-bitmap
  (:import (com.googlecode.javaewah EWAHCompressedBitmap)))

(defn ewah-bitmap
  "Create a new bitmap"
  ([] (EWAHCompressedBitmap.))
  ([^longs set-bits]
     (let [bitmap (ewah-bitmap)]
       (doseq [b set-bits] (.set bitmap b))
       bitmap)))

(defn bit-iter-seq
  [itr]
  (if (not (.hasNext itr))
      nil
      (cons (.next itr) (lazy-seq (bit-iter-seq itr)))))

(defn bitseq
  "Return a seq of indexes of set bits for this bitmap"
  [^com.googlecode.javaewah.EWAHCompressedBitmap bm]
  (bit-iter-seq (.intIterator bm)))
