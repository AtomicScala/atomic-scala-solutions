// Solution-7.scala
// Solution to Exercise 7 in "Error Handling with Exceptions"
/* Demonstrate that a derived-class constructor cannot catch exceptions
thrown by its base-class constructor. */
import com.atomicscala.AtomicTest._

class Ex extends Exception

class Base1 {
  println("Base1 constructor")
  throw new Ex
}

class Derived1 extends Base1 {
  println("Where do you put the try block?")
}

def t1 = try {
  new Derived1
} catch {
  case e:Ex => "Ex"
}

t1 is "Ex"

// Auxiliary constructors -- this part is incomplete!


class Base2 {
  def this(n:Int, i:Int) = {
    this()
    println("Base2 constructor")
    throw new Ex
  }
}

class Derived2 extends Base2 {
  def this(n:Int) = {
    super.this(n, 1)
    this()
  }
}

/*def t2 = try {
  new Derived2
} catch {
  case e:Ex => "Ex"
}

t1 is "Ex"*/