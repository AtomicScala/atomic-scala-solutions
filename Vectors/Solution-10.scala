// Solution-10.scala
// Solution to Exercise 10 in "Vectors"
import com.atomicscala.AtomicTest._

val l = List("sometimes", "a", "list", "of", "words", "is", "nonsense")
println("Min is " + l.min)
println("Max is " + l.max)
println("Sum is (not defined)")
println("Reverse is " + l.reverse)

// REPL Session:
/* scala> val l = List("sometimes", "a", "list", "of", "words", "is", "nonsense")
l: List[java.lang.String] = List(sometimes, a, list, of, words, is, nonsense)

scala> l.min
res20: java.lang.String = a

scala> l.max
res21: java.lang.String = words

scala> l.sum
<console>:9: error: could not find implicit value for parameter num: Numeric[java.lang.String]
              l.sum
                ^

scala> l.reverse
res23: List[java.lang.String] = List(nonsense, is, words, of, list, a, sometimes)

scala> for(word <- l)
     | println(word)
sometimes
a
list
of
words
is
nonsense
*/

val intList = List(1, 3, 5, 7, 9, 5, 9)
println("Min is " + intList.min)
println("Max is " + intList.max)
println("Sum is (defined) " + intList.sum)
println("Reverse is " + intList.reverse)


// REPL Session:
/*
scala> val intList = List(1, 3, 5, 7, 9, 5, 9)
intList: List[Int] = List(1, 3, 5, 7, 9, 5, 9)

scala> intList.min
res26: Int = 1

scala> intList.max
res27: Int = 9

scala> intList.sum
res28: Int = 39

scala> for(i <- intList)
     | println(i)
1
3
5
7
9
5
9
*/

val s = Set(1, 3, 5, 6, 9, 5, 9)
println("Min is " + s.min)
println("Max is " + s.max)
println("Sum is (defined) " + s.sum)
println("Reverse is not defined")


// REPL Session:
/* scala> val s = Set(1, 3, 5, 6, 9, 5, 9)
s: scala.collection.immutable.Set[Int] = Set(5, 1, 6, 9, 3)

scala> s.min
res33: Int = 1

scala> s.max
res34: Int = 9

scala> s.sum
res35: Int = 24

*/

/* Solution: All of the same operations exist on List as on Vector,
including being able to access each element of the list. Set differs
from Vector and List in that it only allows one of each value and
it doesn't display in insertion order */

/* OUTPUT_SHOULD_BE
Min is a
Max is words
Sum is (not defined)
Reverse is List(nonsense, is, words, of, list, a, sometimes)
Min is 1
Max is 9
Sum is (defined) 39
Reverse is List(9, 5, 9, 7, 5, 3, 1)
Min is 1
Max is 9
Sum is (defined) 24
Reverse is not defined
*/
