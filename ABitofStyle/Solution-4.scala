// Solution-4.scala
// Solution to Exercise 4 in "A Bit of Style"
import com.atomicscala.AtomicTest._

class Exclaim4(val s:String) {
  var count = 0
  def exclaim() = {
    count = count + 1
    s + "!"
  }
}

val e4 = new Exclaim4("counting")

e4.exclaim() is "counting!"
e4.exclaim() is "counting!"
e4.count is 2
 
/* OUTPUT_SHOULD_BE
counting!
counting!
2
*/
