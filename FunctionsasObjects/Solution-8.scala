// Solution-8.scala
// Solution to Exercise 8 in "Functions as Objects"
import com.atomicscala.AtomicTest._

val pluralize = (x:String) => (x + "s")
pluralize("cat") is "cats"
pluralize("dog") is "dogs"
pluralize("silly") is "sillys"

/* OUTPUT_SHOULD_BE
cats
dogs
sillys
*/
