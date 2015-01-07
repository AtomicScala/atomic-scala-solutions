// Starter Code for Exercise 3
// From "Custom Error Reporting"
import com.atomicscala.AtomicTest._
import util.{Success, Failure}
import com.atomicscala.reporterr.Fail

def f(s:String, i:Int, d:Double) = {
  val results = testArgs(
    (s.length > 0, "s must be non-zero length"),
    (s.length <= 10, "length of s must be <= 10"),
    (i >= 0, "i must be positive"),
    (d > 0.1, "d must be > 0.1"),
    (d < 0.9, "d must be < 0.9")
  )
  // Perform filtering here
}

f("foo", 11, 0.5) is ""
f("foobarbazbingo", 11, 0.5) is "Failure(length of s must be <= 10)"
f("", 11, 0.5) is "Failure(s must be non-zero length)"
f("foo", -11, 0.5) is "Failure(i must be positive)"
f("foo", 11, 0.1) is "Failure(d must be > 0.1)"
f("foo", 11, 0.9) is "Failure(d must be < 0.9)"
