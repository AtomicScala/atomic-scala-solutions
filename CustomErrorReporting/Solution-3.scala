// Solution-3.scala
// Solution to Exercise 3 in "Custom Error Reporting"
import com.atomicscala.AtomicTest._
import util.{Success, Failure}
import com.atomicscala.reporterr.Fail

def testArgs(tests:(Boolean, String)*) = {
  // A simpler approach is acceptable; this cleverness comes from:
  // http://stackoverflow.com/questions/1987820/how-to-apply-a-function-to-a-tuple
  def argtest(test:Boolean, msg:String) =
    if(!test)
      Fail(msg)
    else
      Success
  tests.map((argtest _).tupled)
}

def f(s:String, i:Int, d:Double) = {
  val results = testArgs(
    (s.length > 0, "s must be non-zero length"),
    (s.length <= 10, "length of s must be <= 10"),
    (i >= 0, "i must be positive"),
    (d > 0.1, "d must be > 0.1"),
    (d < 0.9, "d must be < 0.9")
  )
  results.filter(_.isInstanceOf[Failure[_]]).mkString(", ")
}

f("foo", 11, 0.5) is ""
f("foobarbazbingo", 11, 0.5) is "Failure(length of s must be <= 10)"
f("", 11, 0.5) is "Failure(s must be non-zero length)"
f("foo", -11, 0.5) is "Failure(i must be positive)"
f("foo", 11, 0.1) is "Failure(d must be > 0.1)"
f("foo", 11, 0.9) is "Failure(d must be < 0.9)"

/* OUTPUT_SHOULD_BE
Failure(length of s must be <= 10)
Failure(s must be non-zero length)
Failure(i must be positive)
Failure(d must be > 0.1)
Failure(d must be < 0.9)
*/
