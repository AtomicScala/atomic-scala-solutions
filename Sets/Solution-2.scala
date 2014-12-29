// Solution-2.scala
// Solution to Exercise 2 in "Sets"
import com.atomicscala.AtomicTest._

val fruits = Set("apple", "orange", "banana", "kiwi")
val vegetables = Set("beans", "peas",
  "carrots", "sweet potatoes",
  "asparagus", "spinach")
val meats = Set("beef", "chicken")
val vegetarian = Set("kidney beans", "black beans", "tofu")
val proteins = Set(meats, vegetarian)

def percentMeat(contents:Set[String]) =
  100.0 * (contents intersect meats).size / contents.size

def percentVegetarian(contents:Set[String]) =
  100.0 * (contents intersect vegetarian).size / contents.size

def percentProtein(contents:Set[String]) =
  100.0 * ((contents intersect meats).size + (contents intersect vegetarian).size) / contents.size

val groceryCart2 = Set("apple",
  "pretzels", "bread", "orange", "beef",
  "beans", "asparagus", "sweet potatoes",
  "kidney beans", "black beans")
percentMeat(groceryCart2) is 10.0
percentVegetarian(groceryCart2) is 20.0
percentProtein(groceryCart2) is 30.0

/* OUTPUT_SHOULD_BE
10.0
20.0
30.0
*/
