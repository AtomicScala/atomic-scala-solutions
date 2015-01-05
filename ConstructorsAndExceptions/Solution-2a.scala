// Solution-2a.scala
// Solution to Exercise 2 in "Constructors & Exceptions"
import com.atomicscala.AtomicTest._
import codelisting._

class CodeListingTester2(makeList:String => IndexedSeq[String]) {
  val l = makeList("CodeListingTester.scala")
  var index = 1
  for(i <- l) {
    println (s"$index $i")
    index = index + 1
  }
}

new CodeListingTester2(CodeListing.apply)

/* OUTPUT_SHOULD_BE
1 // CodeListingTester.scala
2 package codelistingtester
3 import com.atomicscala.AtomicTest._
4
5 class CodeListingTester(makeList:String => IndexedSeq[String]) {
6   makeList("CodeListingTester.scala")(4) is
7     "class CodeListingTester("
8
9   makeList("NotAFile.scala")(0) is
10     "File Not Found: NotAFile.scala"
11
12   makeList("NotAScalaFile.txt")(0) is
13     "NotAScalaFile.txt doesn't end with '.scala'"
14
15   makeList(null)(0) is "Error: Null file name"
16 }
*/
