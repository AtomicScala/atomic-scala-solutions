// Solution-2.scala
// Solution to Exercise 2 in "Constructors & Exceptions"
import com.atomicscala.AtomicTest._

import codelisting._

class CodeListingTester2(
	makeList: String => IndexedSeq[String]) {
	val l = makeList("CodeListingTester.scala")
	var index = 1
	for (i <- l) {
		println (s"$index $i")
		index = index + 1
	}
}

new CodeListingTester2(CodeListing.apply)

// BONUS -- uses formatted strings
/* class CodeListingTester2(
	makeList: String => IndexedSeq[String]) {

	val l = makeList("CodeListingTester.scala")
	var index = 1
	for (i <- l) {
		println (f"$index%2d $i")
		index = index + 1
	}
}
*/
