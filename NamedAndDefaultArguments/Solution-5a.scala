// Solution-5a.scala
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

val family4 = new Family3(mom="Mom", dad="Dad")
family4.familySize is 2
family4.mom is "Mom"
family4.dad is "Dad"
family4.kids is Nil

/* OUTPUT_SHOULD_BE
2
Mom
Dad
WrappedArray()
*/
