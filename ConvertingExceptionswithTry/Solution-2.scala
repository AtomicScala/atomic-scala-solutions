// Solution-2.scala
// Solution to Exercise 2 in "Converting Exceptions with Try"
import com.atomicscala.AtomicTest._

def f2(n:Int) = Try(toss(n)).transform(
  i => Success(s"$i Bob"), // Success
  e => e match { // Failure
    case Except1(why) => Success(why)
    case Except2(n) => Success(n)
    case Except3(msg, d) => Success(d)
  }
)

f2(0) is Success("OK Bob")
f2(1) is Success("Reason")
f2(2) is Success(11)
f2(3) is Success(1.618)

/* OUTPUT_SHOULD_BE

*/
