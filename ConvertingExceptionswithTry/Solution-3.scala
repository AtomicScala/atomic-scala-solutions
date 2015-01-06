// Solution-3.scala
// Solution to Exercise 3 in "Converting Exceptions with Try"
import com.atomicscala.AtomicTest._
import util.Try
import java.io.FileNotFoundException
import codelisting._

class CodeListingTester2(
  makeList:String => IndexedSeq[String]) {
  val l = makeList("NonExistentFile.scala")
  var index = 1
  for(i <- l) {
    println (f"$index%2d $i")
    index = index + 1
  }
}

def listing(name:String) =
  Try(new CodeListing(name)).recover{
    case _:FileNotFoundException =>
      Vector(s"File Not Found: $name")
    case _:NullPointerException =>
      Vector("Error: Null file name")
    case e:ExtensionException =>
      Vector(e.getMessage)
  }.get

new CodeListingTester2(listing)

// needs solution testing

/* OUTPUT_SHOULD_BE
1 File Not Found: NonExistentFile.scala
*/
