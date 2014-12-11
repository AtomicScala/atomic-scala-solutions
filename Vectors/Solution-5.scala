// Solution-5.scala
// Solution to Exercise 5 in "Vectors"
import com.atomicscala.AtomicTest._

val v5 = Vector("The", "dog", "visited", "the", "firehouse")

for(word <- v5) {
  println(word.reverse)
}

/* OUTPUT_SHOULD_BE
ehT
god
detisiv
eht
esuoherif
*/
