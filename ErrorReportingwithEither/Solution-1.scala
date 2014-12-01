// Solution-1.scala
// Solution to Exercise 1 in "Error Reporting with Either"
import com.atomicscala.AtomicTest._

/*{oldDescription}
 Add explicit return type information to DivZeroEither.scala.
{oldDescription}*/

// DivZeroEither.scala

def f(i:Int):Either[String, Int] =
  if(i == 0)
    Left("Divide by zero")
  else
    Right(24/i)

def test(n:Int):Any =
  f(n) match {
    case Left(why) => s"Failed: $why"
    case Right(result) => result
  }

test(4) is 6
test(5) is 4
test(6) is 4
test(0) is "Failed: Divide by zero"
test(24) is 1
test(25) is 0
