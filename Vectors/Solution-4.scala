// Solution-4.scala
// Solution to Exercise 4 in "Vectors"
import com.atomicscala.AtomicTest._

var sentence = "The dog visited the firehouse "
val theString = sentence.toString().replace("firehouse ", "firehouse!")
theString is "The dog visited the firehouse!"
