// Solution-3a.scala
// Solution to Exercise 3 in "References & Mutability"
import com.atomicscala.AtomicTest._

// The default List is immutable

var lst = List(1,2,3)
val original = lst
// You can also create a list like this:
val colors = "red" :: "green" :: "yellow" :: List()
colors is "List(red, green, yellow)"

lst :+= 99 // Now lst is pointing at a different List
lst is "List(1, 2, 3, 99)"
lst == original is false // Original is not modified
val original2 = lst
lst +:= -1
lst is "List(-1, 1, 2, 3, 99)"
lst == original2 is false

lst(4) is 99
// lst(2) = 111 // Can't modify elements; it's immutable
lst is "List(-1, 1, 2, 3, 99)"

/* OUTPUT_SHOULD_BE
List(red, green, yellow)
List(1, 2, 3, 99)
false
List(-1, 1, 2, 3, 99)
false
99
List(-1, 1, 2, 3, 99)
*/
