// Solution-4.scala
// Solution to Exercise 4 in "Class Arguments"

// This produces an error:

class Family3(parents:String*, kids:String*) {
  def familySize():Int = {
    var count = 2
    for(i<-kids) {
      count = count + 1
    }
    count
  }
}

/* OUTPUT_SHOULD_CONTAIN
error: *-parameter must come last
class Family3(parents:String*, kids:String*) {
              ^
one error found
*/
