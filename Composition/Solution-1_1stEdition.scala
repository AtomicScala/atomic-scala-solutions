// Solution-1.scala
// Solution to Exercise 1 in "Composition" (1st Edition)
import com.atomicscala.AtomicTest._

trait Kitchen

class ServingKitchen extends Kitchen {
  def serveFood:Boolean = true
}

class PrepKitchen extends Kitchen {
  def prepFood:Boolean = true
}

val serving = new ServingKitchen
serving.serveFood is true

val prep = new PrepKitchen
prep.prepFood is true

/* OUTPUT_SHOULD_BE
true
true
*/
