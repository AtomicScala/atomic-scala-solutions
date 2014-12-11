// Solution-5.scala
// Solution to Exercise 5 in "Class Arguments"

// This produces an error:

class Family4(kids:String*, mom:String, dad:String) {
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
class Family4(kids:String*, mom:String, dad:String) {
              ^
one error found
*/
