// Solution-6.scala
// Solution to Exercise 6 in "Maps"
import com.atomicscala.AtomicTest._

val map1 = Map("English" -> "", "French" -> "", "Spanish" -> "", "German" -> "", "Chinese" -> "")
map1.size is 5
map1.contains("Spanish") is true

val map2 = map1 - "Spanish"
map2.size is 4
map2.contains("Spanish") is false

case class Name(firstName:String, lastName:String)

val map3 = Map("sally@taylor.com" -> Name("Sally","Taylor"),
               "mary@smith.com" -> Name("Mary", "Smith"),
               "jiminy@cricket.com" -> Name("Jiminy", "Cricket"))
map3.size is 3
map3.contains("jiminy@cricket.com") is true

val map4 = map3 - "jiminy@cricket.com"
map4.size is 2
map4.contains("jiminy@cricket.com") is false

/* OUTPUT_SHOULD_BE
5
true
4
false
3
true
2
false
*/
