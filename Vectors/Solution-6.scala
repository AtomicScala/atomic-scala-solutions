// Solution-6.scala
// Solution to Exercise 6 in "Vectors"
import com.atomicscala.AtomicTest._

val v5 = Vector("The", "dog", "visited", "the", "firehouse")

for(word <- v5.reverse) {
  println(word)
}

/* OUTPUT_SHOULD_BE
firehouse
the
visited
dog
The
*/
