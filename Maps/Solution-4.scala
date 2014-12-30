// Solution-4.scala
// Solution to Exercise 4 in "Maps"
import com.atomicscala.AtomicTest._

val map1 = Map("English" -> "", "French" -> "", "Spanish" -> "", "German" -> "", "Chinese" -> "")
map1.size is 5
val map2 = map1 + ("Turkish" -> "")
map2.size is 6
map2.contains("English") is true
map2.contains("Turkish") is true

/* OUTPUT_SHOULD_BE
5
6
true
true
*/
