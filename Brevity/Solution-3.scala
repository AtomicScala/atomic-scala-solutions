// Solution-3.scala
// Solution to Exercise 3 in "Brevity"
import com.atomicscala.AtomicTest._

def assignResult3(arg:Boolean) = 
  if(arg) 42 else 47

assignResult3(true) is 42
assignResult3(false) is 47

/* OUTPUT_SHOULD_BE
42
47
*/
