// Solution-3.scala
// Solution to Exercise 3 in "Custom Error Reporting"
// A simpler approach is acceptable; this cleverness comes from:
// http://stackoverflow.com/questions/1987820/how-to-apply-a-function-to-a-tuple
import com.atomicscala.AtomicTest._
import util.{Success, Failure}
import com.atomicscala.reporterr.Fail

def testArgs(tests:Vector[(Boolean, String)]) = {
  def argtest(test:Boolean, msg:String) = {
    if(!test)
      Fail(msg)
    else
      Success()
  }
  val argtest_ = argtest _
  val failures = for {
    test <- tests
    result = argtest_.tupled(test)
    if (result match {
      case _:Success[_] => false
      case _:Failure[_] => true
    })
  } yield result
  println(failures)
}

def testedArgs(s:String, i:Int, d:Double) = {
  testArgs(Vector(
    (s.length > 0, "s must be non-zero length"),
    (s.length <= 10, "length of s must be <= 10"),
    (i >= 0, "i must be positive"),
    (d > 0.1, "d must be > 0.1"),
    (d < 0.9, "d must be < 0.9")
  ))
}

testedArgs("foo", 11, 0.5)
testedArgs("", 11, 0.5)
testedArgs("foo", -11, 0.5)
testedArgs("foo", 11, 0.1)
testedArgs("foo", 11, 0.9)

/* OUTPUT_SHOULD_BE

*/

/*  argtest(s.length > 0, "s must be non-zero length")
  argtest(s.length <= 10, "length of s must be <= 10")
  argtest(i >= 0, "i must be positive")
  argtest(d > 0.1, "d must be > 0.1")
  argtest(d < 0.9, "d must be < 0.9")
*/
