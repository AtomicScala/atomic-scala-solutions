// Solution-6.scala
// Solution to Exercise 6 in "Error Handling with Exceptions"
/* Create a class with two methods, f and g. In g, throw a new type of
exception that you define. In f, call g, catch its exception and, in the catch
clause, throw a different exception (of a second type that you define). Test
your code. */
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
