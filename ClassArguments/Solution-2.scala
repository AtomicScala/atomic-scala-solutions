// Solution-2.scala
// Solution to Exercise 2 in "Class Arguments"
import com.atomicscala.AtomicTest._

class FlexibleFamily(mom:String, dad:String, kids:String*) {
  def familySize():Int = {
    var count = 2    // see change!
    for(i<-kids) {
      count = count + 1
    }
    count
  }
}

val family3 = new FlexibleFamily("Mom", "Dad", "Sally", "Dick")
family3.familySize is 4
val family4 = new FlexibleFamily("Dad", "Mom", "Harry")
family4.familySize is 3

/* OUTPUT_SHOULD_BE
4
3
*/
