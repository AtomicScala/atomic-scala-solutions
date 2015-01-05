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

/* OUTPUT_SHOULD_BE
// CodeListingTester.scala
package codelistingtester
import com.atomicscala.AtomicTest._

class CodeListingTester(makeList:String => IndexedSeq[String]) {
  makeList("CodeListingTester.scala")(4) is
    "class CodeListingTester("

  makeList("NotAFile.scala")(0) is
    "File Not Found: NotAFile.scala"

  makeList("NotAScalaFile.txt")(0) is
    "NotAScalaFile.txt doesn't end with '.scala'"

  makeList(null)(0) is "Error: Null file name"
}
*/
