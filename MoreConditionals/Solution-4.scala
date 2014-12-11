// Solution-4.scala
// Solution to Exercise 4 in "More Conditionals"
import com.atomicscala.AtomicTest._

def isPalIgnoreSpecial(str:String):Boolean = {
  var createdStr = ""
  for(c <- str) {
    val theValue = c.toInt
    if(theValue > 64 && theValue < 123) {
      createdStr += c
    }
    else if(theValue > 47 && theValue < 58) {
      createdStr += c
    }
  }
  val s1 = createdStr.toUpperCase.reverse
  val s2 = createdStr.toUpperCase
  s1.equals(s2)
}

isPalIgnoreSpecial("Madam I'm adam") is true
isPalIgnoreSpecial("trees") is false

/* OUTPUT_SHOULD_BE
true
false
*/
