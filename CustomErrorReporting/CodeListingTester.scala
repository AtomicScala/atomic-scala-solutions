// CodeListingTester.scala
package codelistingtester
import com.atomicscala.AtomicTest._

class CodeListingTester(makeList: String => IndexedSeq[java.io.Serializable]) {

  makeList("CodeListingTester.scala")(4) is
  "class CodeListingTester(makeList: String => IndexedSeq[java.io.Serializable]) {"

  makeList("NotAFile.scala")(0) is
  "File Not Found: NotAFile.scala"

  makeList("NotAScalaFile.txt")(0) is
  "NotAScalaFile.txt " +
  "doesn't end with '.scala'"

  makeList(null)(0) is
  "Error: Null file name"

}
