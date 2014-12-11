// Solution-8.scala
// Solution to Exercise 8 in "Vectors"
import com.atomicscala.AtomicTest._

val v6 = Vector("the", "dog", "visited", "the", "firehouse")

// String doesn't have a sum operation
//println("The string Vector sum is " + v6.sum)
// max and min are defined by alphabetical order
v6.max is "visited"
v6.min is "dog"

/* OUTPUT_SHOULD_BE
visited
dog
*/
