// Solution-1.scala
// Solution to Exercise 1 in "Constructors & Exceptions"
import com.atomicscala.AtomicTest._
import codelisting._

class CodeListingTester1(makeList:String => IndexedSeq[String]) {
  val l = makeList("CodeListingTester.scala")
  for(i <- l)
    println(i)
}

new CodeListingTester1(CodeListing.apply)
