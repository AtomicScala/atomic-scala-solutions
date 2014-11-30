// Solution-3.scala
// Solution to Exercise 3 in "Converting Exceptions with Try"
import com.atomicscala.AtomicTest._

/*{oldDescription}
 Modify ShowListingTry.scala to include line numbers. Were you able to use your CodeListingTester from ConstructorsAndExceptions?
{oldDescription}*/

// ShowListingTry.scala
import util.Try
import java.io.FileNotFoundException
import codelisting._

class CodeListingTester2(
    makeList: String => IndexedSeq[String]) {

    val l = makeList("CodeListingTester.scala")
    var index = 1
    for (i <- l) {
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
