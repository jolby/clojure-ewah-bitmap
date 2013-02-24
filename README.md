# clojure-ewah-bitmap

Clojure wrapper for the javaewah compressed bitmap project.
http://code.google.com/p/javaewah/

## Usage

(println (.toDebugString (ewah-bitmap (long-array [1 4 7]))))
==>
 EWAHCompressedBitmap, size in bits = 8 size in words = 2
0 0x00
1 dirties
	146

(println (vec (.toArray (ewah-bitmap (long-array [1 4 7])))))
==>
[1 4 7]

## License

Copyright © 2013 Joel Boehland

Distributed under the Eclipse Public License, the same as Clojure.
