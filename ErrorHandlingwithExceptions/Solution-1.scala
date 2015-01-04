// Solution-1.scala
// Solution to Exercise 1 in "Error Handling with Exceptions"
import com.atomicscala.AtomicTest._

def solution1 =
  try {
    throw new Exception("solution1")
  } catch {
    case err:Exception => err.getMessage
  }

solution1 is "solution1"

/* OUTPUT_SHOULD_BE
solution1
*/
