// Solution-2.scala
// Solution to Exercise 2 in "Composition" (1st Edition)
import com.atomicscala.AtomicTest._

trait Kitchen {
  def serveFood:Boolean
  def prepFood:Boolean
}

class ServingKitchen extends Kitchen {
  def serveFood:Boolean = true
  def prepFood:Boolean = false
}

class WorkKitchen extends Kitchen {
  def serveFood:Boolean = false
  def prepFood:Boolean = true
}

class SimpleKitchen extends Kitchen {
  def serveFood:Boolean = true
  def prepFood:Boolean = true
}

val serving = new ServingKitchen
serving.serveFood is true
serving.prepFood is false

val work = new WorkKitchen
work.prepFood is true
work.serveFood is false

val simple = new SimpleKitchen
simple.serveFood is true
simple.prepFood is true

/* OUTPUT_SHOULD_BE
true
false
true
false
true
true
*/
