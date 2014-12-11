// Solution-3.scala
// Solution to Exercise 3 in "Vectors"
import com.atomicscala.AtomicTest._

val v5 = Vector("The", "dog", "visited", "the", "firehouse")
var sentence: String = ""
for(word <- v5) {
  sentence = sentence + word + " "
}

sentence.toString() is "The dog visited the firehouse "

/* OUTPUT_SHOULD_BE
The dog visited the firehouse
*/
