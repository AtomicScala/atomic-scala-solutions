// Starter Code for Exercise 2
// From "Composition" atom (1st Edition)
import com.atomicscala.AtomicTest._

val serving = new ServingKitchen
serving.serveFood is true
serving.prepFood is false
val prep = new PrepKitchen
prep.prepFood is true
prep.serveFood is false
val simple = new SimpleKitchen
simple.serveFood is true
simple.prepFood is true
