// Solution-5.scala
// Solution to Exercise 5 in "Maps"
import com.atomicscala.AtomicTest._

val map1 = Map("English" -> "", "French" -> "", "Spanish" -> "", "German" -> "", "Chinese" -> "")
map1.size is 5
val map2 = map1 + ("French" -> "")
map2.size is 5
map2.contains("English") is true
map2.contains("French") is true

/* OUTPUT_SHOULD_BE
5
5
true
true
*/
