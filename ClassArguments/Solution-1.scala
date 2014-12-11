// Solution-1.scala
// Solution to Exercise 1 in "Class Arguments"
import com.atomicscala.AtomicTest._

class Family(names:String*) {
  def familySize():Int = {
    var count = 0
    for(i <- names) {
      count = count + 1
    }
    count
  }
}

val family1 = new Family("Mom", "Dad", "Sally", "Dick")
family1.familySize is 4

val family2 = new Family("Dad", "Mom", "Harry")
family2.familySize is 3

/* OUTPUT_SHOULD_BE
4
3
*/
