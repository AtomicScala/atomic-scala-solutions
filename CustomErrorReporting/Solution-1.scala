// Solution-1.scala
// Solution to Exercise 1 in "Custom Error Reporting"
import com.atomicscala.AtomicTest._
import util.{Success, Failure}
import com.atomicscala.reporterr.Fail
import codelisting._
import codelistingtester._
import java.io.FileNotFoundException

object CodeListingEither {
  def apply(name:String) =
    try {
      Success(new CodeListing(name))
    } catch {
      case _:FileNotFoundException =>
        Fail(s"File Not Found: $name")
      case _:NullPointerException =>
        Fail("Error: Null file name")
      case e:ExtensionException =>
        Fail(e.getMessage)
    }
}

def listing(name:String) = {
  CodeListingEither(name) match {
    case Success(lines) => lines
    case Failure(error) => Vector(error)
  }
}

new CodeListingTester(listing)

/* OUTPUT_SHOULD_BE

*/
