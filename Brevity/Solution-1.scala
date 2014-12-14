// Solution-1.scala
// Solution to Exercise 1 in "Brevity"
import com.atomicscala.AtomicTest._

def assignResult(arg:Boolean):Int = { 
  if(arg) 42 else 47 
}

assignResult(true) is 42
assignResult(false) is 47

/* OUTPUT_SHOULD_BE
42
47
*/
