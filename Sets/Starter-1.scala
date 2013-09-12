// Starter Code for Exercise 1
// From "Sets" atom
import com.atomicscala.AtomicTest._

val fruits =
Set("apple", "orange",
Â  "banana", "kiwi")
val vegetables = Set("beans", "peas",
Â  "carrots", "sweet potatoes",
Â  "asparagus", "spinach")
val meats = Set("beef", "chicken")
val groceryCart = Set("apple",
Â Â "pretzels", "bread", "orange", "beef",
Â  "beans", "asparagus", "sweet potatoes",
Â  "spinach", "carrots")
percentMeat(groceryCart) is 10.0
percentFruit(groceryCart) is 20.0
percentVeggies(groceryCart) is 50.0
percentOther(groceryCart) is 20.0
