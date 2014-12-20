// Starter Code for Exercise 3
// From "Composition" atom (1st Edition)
import com.atomicscala.AtomicTest._

val serving = new ServingKitchen
serving.serveFood is true
serving.prepFood is false
serving.utensils is "Vector(ServeUtensils)"

val prep = new PrepKitchen
prep.prepFood is true
prep.serveFood is false
prep.utensils is "Vector(PrepUtensils)"

val simple = new SimpleKitchen
simple.serveFood is true
simple.prepFood is true
simple.utensils is "Vector(ServeUtensils, PrepUtensils)"
