// Solution-3.scala
// Solution to Exercise 3 in "Design by Contract"
import com.atomicscala.AtomicTest._

/* Write a class with a method that only has a postcondition that fails when you
give the method particular inputs. Elide the postcondition and show that the
failure then slips through. Add a precondition to prevent the failure.*/

def f(n:Int) = {
  assume(n % 2 != 0, "n is even: " + n)
}

def test(nums:Int*) =
  for(n <- nums)
    try {
      f(n)
    } catch {
      case e:Throwable => println(e.getMessage)
    }

test(1, 4, 5, 7, 11, 22, 23)
/* OUTPUT_SHOULD_BE

*/
