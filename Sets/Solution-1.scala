// Solution-1.scala
// Solution to Exercise 1 in "Sets"
import com.atomicscala.AtomicTest._

val fruits = Set("apple", "orange", "banana", "kiwi")

val vegetables = Set("beans", "peas",
  "carrots", "sweet potatoes",
  "asparagus", "spinach")

val meats = Set("beef", "chicken")

val groceryCart = Set("apple",
  "pretzels", "bread", "orange", "beef",
  "beans", "asparagus", "sweet potatoes",
  "spinach", "carrots")

def percentMeat(contents:Set[String]) =
  100.0 * (contents intersect meats).size / contents.size

def percentFruit(contents:Set[String]) =
  100.0 * (contents intersect fruits).size / contents.size

def percentVeggies(contents:Set[String]) =
  100.0 * (contents intersect vegetables).size / contents.size

def percentOther(contents:Set[String]) =
  100.0 * (contents -- (fruits | vegetables | meats)).size / contents.size

percentMeat(groceryCart) is 10.0
percentFruit(groceryCart) is 20.0
percentVeggies(groceryCart) is 50.0
percentOther(groceryCart) is 20.0

/* OUTPUT_SHOULD_BE
10.0
20.0
50.0
20.0
*/
