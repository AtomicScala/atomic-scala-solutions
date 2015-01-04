// Solution-6.scala
// Solution to Exercise 6 in "Error Handling with Exceptions"
import com.atomicscala.AtomicTest._

class Ex1 extends Exception
class Ex2 extends Exception

class Solution6 {
  def f = try {
    g
  } catch {
    case e:Ex1 => throw new Ex2
  }
  def g = throw new Ex1
}

def t1 = try {
  (new Solution6).g
} catch {
  case e:Ex1 => "Ex1"
}

def t2 = try {
  (new Solution6).f
} catch {
  case e:Ex2 => "Ex2"
}

t1 is "Ex1"
t2 is "Ex2"

/* OUTPUT_SHOULD_BE
Ex1
Ex2
*/
