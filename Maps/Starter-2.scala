// Starter Code for Exercise 2
// From "Maps" atom
import com.atomicscala.AtomicTest._

val m = Map("sally@taylor.com" -> Name("Sally","Taylor"))
m("sally@taylor.com") is Name("Sally", "Taylor")
