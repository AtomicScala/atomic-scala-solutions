// Solution-1.scala
// Solution to Exercise 1 in "Handling Non-Values with Option"
import com.atomicscala.AtomicTest._

def f(i:Int) =
  if(i == 0)
    None
  else
    Some(24/i)

f(4) is Some(6)
f(5) is Some(4)
f(6) is Some(4)
f(0) is None
f(24) is Some(1)
f(25) is Some(0)

/* OUTPUT_SHOULD_BE
Some(6)
Some(4)
Some(4)
None
Some(1)
Some(0)
*/
