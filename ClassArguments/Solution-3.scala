// Solution-3.scala
// Solution to Exercise 3 in "Class Arguments"
import com.atomicscala.AtomicTest._

class FlexibleFamily(mom: String,
  dad: String, kids: String* ) {

  def familySize(): Int = {
    var count = 2    // see change!
    for (i<-kids) {
      count = count + 1
    }
    count
  }
}

val familyNoKids =
  new FlexibleFamily("Mom", "Dad")
familyNoKids.familySize is 2

