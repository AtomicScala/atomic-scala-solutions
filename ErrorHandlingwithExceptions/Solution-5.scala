// Solution-5.scala
// Solution to Exercise 5 in "Error Handling with Exceptions"
import com.atomicscala.AtomicTest._

class ex1 extends Exception
class ex2 extends Exception
class ex3 extends Exception

def throwall(n:Int) = n match {
  case 1 => throw new ex1
  case 2 => throw new ex2
  case 3 => throw new ex3
  case _ => "no throw"
}

def catchall(n:Int) =
  try {
    throwall(n)
  } catch {
    case e:ex1 => "ex1"
    case e:ex2 => "ex2"
    case e:ex3 => "ex3"
  }

catchall(0) is "no throw"
catchall(1) is "ex1"
catchall(2) is "ex2"
catchall(3) is "ex3"

/* OUTPUT_SHOULD_BE
no throw
ex1
ex2
ex3
*/
