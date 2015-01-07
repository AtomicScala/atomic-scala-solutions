// Solution-3.scala
// Solution to Exercise 3 in "Custom Error Reporting"
// A simpler approach is acceptable; this cleverness comes from:
// http://stackoverflow.com/questions/1987820/how-to-apply-a-function-to-a-tuple
import com.atomicscala.AtomicTest._
import util.{Success, Failure}
import com.atomicscala.reporterr.Fail

def testArgs(tests:(Boolean, String)*):Seq[Serializable] = {
  def argtest(test:Boolean, msg:String) = {
    if(!test)
      Fail(msg)
    else
      Success
  }
  tests.map((argtest _).tupled)
}

def filterFailures(testResults:Seq[Serializable]) =
  for {
    result <- testResults
    rslt <- result match {
      case Success => None
      case Failure(msg) => Some(msg)
    }
  } yield rslt
/*  (testResults map {
    case Success => false
    case Failure(msg) => msg
  }).filter(_)*/

def f(s:String, i:Int, d:Double) = {
  val results = testArgs(
    (s.length > 0, "s must be non-zero length"),
    (s.length <= 10, "length of s must be <= 10"),
    (i >= 0, "i must be positive"),
    (d > 0.1, "d must be > 0.1"),
    (d < 0.9, "d must be < 0.9")
  )
  //println(results.mkString(", "))
  println(filterFailures(results).mkString(", "))
}

f("foo", 11, 0.5)
f("foobarbazbingo", 11, 0.5)
f("", 11, 0.5)
f("foo", -11, 0.5)
f("foo", 11, 0.1)
f("foo", 11, 0.9)

/* OUTPUT_SHOULD_BE

*/
