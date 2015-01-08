// Solution-1.scala
// Solution to Exercise 1 in "Design by Contract"
import com.atomicscala.AtomicTest._

/* Note: foldLeft is more elegant and succinct and doesn't require
   a var. However, you could also have said:
    var sum = 0
    digits.foreach(sum += _.asDigit)
    sum
*/

def f1(digits:String) = {
  require(digits.length >= 4, "Need 4 or more digits")
  require(digits.length <= 10, "No more than 10 digits allowed")
  require(digits.forall(_.isDigit), "Only digits are allowed")
  digits.foldLeft(0)(_ + _.asDigit)
  // By inspection, the preconditions guarantee
  // the postconditions.
}

def f2(digits:String) = {
  // Note that in this example, without the preconditions
  // the postconditions cannot be insured:
  var result = digits.foldLeft(0)(_ + _.asDigit)
  assume(result >= 0, "Result should not be negative")
  assume(result <= 90, "Result cannot be greater than 90")
  result
}

def f3(digits:String) = {
  require(digits.length >= 4, "Need 4 or more digits")
  require(digits.length <= 10, "No more than 10 digits allowed")
  require(digits.forall(_.isDigit), "Only digits are allowed")
  var result = digits.foldLeft(0)(_ + _.asDigit)
  assume(result >= 0, "Result should not be negative")
  assume(result <= 90, "Result cannot be greater than 90")
  result
}

def test(funs: String => Int*) = {
  def tst(fun: String => Int, digits:String, expected:Int) =
    try {
      fun(digits) is expected
    } catch {
      case e:Throwable => println(e.getMessage)
    }
  for(fun <- funs) {
    tst(fun, "0000", 0)
    tst(fun, "9999999999", 90)
    tst(fun, "000", 0)
    tst(fun, "99999999999", 90)
    tst(fun, "9a999999", 73)
    println("------------------")
  }
}

test(f1, f2, f3)

/* OUTPUT_SHOULD_BE
0
90
requirement failed: Need 4 or more digits
requirement failed: No more than 10 digits allowed
requirement failed: Only digits are allowed
------------------
0
90
0
assumption failed: Result cannot be greater than 90
73
------------------
0
90
requirement failed: Need 4 or more digits
requirement failed: No more than 10 digits allowed
requirement failed: Only digits are allowed
------------------
*/
