// Solution-3b.scala
// Solution to Exercise 3 in "References & Mutability"
import com.atomicscala.AtomicTest._
import collection.mutable.MutableList

// Unlike Map and Set, importing MutableList
// does NOT make the default List mutable:

val notMutable = List('a', 'b', 'c')
notMutable.getClass is "class scala.collection.immutable.$colon$colon"

// For a mutable List you must explitly ask for one:

val yesItsMutable = MutableList('a', 'b', 'c')
yesItsMutable.getClass is "class scala.collection.mutable.MutableList"

// You can't do the colon trick with a MutableList:
// val colors = "red" :: "green" :: "yellow" :: MutableList()

var lst = MutableList(1,2,3)
val original = lst

lst :+= 99
lst is "MutableList(1, 2, 3, 99)"
lst == original is false // Original is still not modified!
val original2 = lst
lst +:= -1
lst is "MutableList(-1, 1, 2, 3, 99)"
lst == original2 is false

lst(4) is 99
lst(4) = 111 // You can modify elements
lst is "MutableList(-1, 1, 2, 3, 111)"

/* OUTPUT_SHOULD_BE
class scala.collection.immutable.$colon$colon
class scala.collection.mutable.MutableList
MutableList(1, 2, 3, 99)
false
MutableList(-1, 1, 2, 3, 99)
false
99
MutableList(-1, 1, 2, 3, 111)
*/
