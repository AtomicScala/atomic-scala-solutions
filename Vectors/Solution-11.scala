// Solution-11.scala
// Solution to Exercise 11 in "Vectors"
import com.atomicscala.AtomicTest._

val s = Set("this", "has", "words", "that", "match", "other", "words")
// s.sorted
println("sorted is not defined")
// s.reverse
println("reverse is not defined")

/* REPL session
scala> val s = Set("this", "has", "words", "that", "match", "other", "words")
s: scala.collection.immutable.Set[java.lang.String] = Set(this, has, that, match, words, other)

scala> s.sorted
<console>:9: error: value sorted is not a member of scala.collection.immutable.Set[java.lang.String]
              s.sorted
                ^

scala> s.reverse
<console>:9: error: value reverse is not a member of scala.collection.immutable.Set[java.lang.String]
              s.reverse
                ^

scala> val l = List("this", "has", "words", "that", "match", "other", "words")
l: List[java.lang.String] = List(this, has, words, that, match, other, words)

scala> l.sorted
res52: List[java.lang.String] = List(has, match, other, that, this, words, words)

scala> l.reverse
res53: List[java.lang.String] = List(words, other, match, that, words, has, this)
*/

/* OUTPUT_SHOULD_BE
sorted is not defined
reverse is not defined
*/
