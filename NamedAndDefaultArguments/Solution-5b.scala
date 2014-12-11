// Solution-5b.scala
// Solution to Exercise 5 in "Named & Default Arguments"
import com.atomicscala.AtomicTest._

class Family3(val mom:String, val dad:String, val kids:String*) {
  def familySize():Int = {
    var count = 2    // NOTE: This changed
    for(i <- kids) {
      count = count + 1
    }
    count
  }
}

// BONUS: Positions should not matter but bug in 2.11 and below makes it so
val family4a = new Family3(dad="Dad", mom="Mommy", kids="Sally", "Dick")
family4a.familySize is 4
family4a.mom is "Mommy"
family4a.dad is "Dad"

/* OUTPUT_SHOULD_CONTAIN
error: positional after named argument.
val family4a = new Family3(dad="Dad", mom="Mommy", kids="Sally", "Dick")
                                                                 ^
one error found
*/
