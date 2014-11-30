// Solution-5.scala
// Solution to Exercise 5 in "Named & Default Arguments"
import com.atomicscala.AtomicTest._

class Family3(val mom: String, val dad: String, val kids: String* ) {

  def familySize(): Int = {
    var count = 2    // NOTE: This changed
    for (i<-kids) {
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

// BONUS: Positions should not matter but bug in 2.10 and below makes it so
// val family4a = new Family3(dad="Dad", mom="Mommy", kids="Sally", "Dick")
// family4a.familySize is 4
// family4a.mom is "Mommy"
// family4a.dad is "Dad"
