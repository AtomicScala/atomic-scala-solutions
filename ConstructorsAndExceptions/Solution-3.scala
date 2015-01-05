// Solution-3.scala
// Solution to Exercise 3 in "Constructors & Exceptions"
import com.atomicscala.AtomicTest._
import codelisting._

class CodeListingTester3(makeList:String => IndexedSeq[String]) {
  val l = makeList("NoSuchFile.scala")
  var index = 1
  for(i <- l) {
    println (s"$index $i")
    index = index + 1
  }
}

new CodeListingTester3(CodeListing.apply)

/* OUTPUT_SHOULD_BE
1 File Not Found: NoSuchFile.scala
*/
