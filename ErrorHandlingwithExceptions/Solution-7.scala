// Solution-7.scala
// Solution to Exercise 7 in "Error Handling with Exceptions"
import com.atomicscala.AtomicTest._

class Ex extends Exception

class Base1 {
  println("Base1 constructor")
  throw new Ex
}

class Derived1 extends Base1 {
  // Base1 constructor is called first, so the following never runs
  // -- no opportunity to catch the base-constructor exception.
  try {
    println("Where do you put the try block?")
  } catch {
    case e:Ex => println("Caught Ex")
  }
}

def t1 = try {
  new Derived1
} catch {
  case e:Ex => "Ex caught in t1"
}

t1 is "Ex caught in t1"

/* OUTPUT_SHOULD_BE
Base1 constructor
Ex caught in t1
*/
