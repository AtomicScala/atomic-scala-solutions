// Solution-2.scala
// Solution to Exercise 2 in "More Conditionals"
import com.atomicscala.AtomicTest._

def isPalindrome(str:String):Boolean = {
  val s = str.reverse
  s.equals(str)
}

isPalindrome("mom") is true
isPalindrome("dad") is true
isPalindrome("street") is false

/* OUTPUT_SHOULD_BE
true
true
false
*/
