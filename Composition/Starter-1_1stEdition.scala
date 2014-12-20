// Starter Code for Exercise 1
// From "Composition" atom (1st Edition)
import com.atomicscala.AtomicTest._

val serving = new ServingKitchen
serving.serveFood is true
val prep = new PrepKitchen
prep.prepFood is true
