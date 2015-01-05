// Solution-2.scala
// Solution to Exercise 2 in "Handling Non-Values with Option"
import com.atomicscala.AtomicTest._

def f2(i:Int):Option[Int] =
  if(i == 0)
    None
  else
    Some(24/i)

f2(4) is Some(6)
f2(5) is Some(4)
f2(6) is Some(4)
f2(0) is None
f2(24) is Some(1)
f2(25) is Some(0)

/* OUTPUT_SHOULD_BE
Some(6)
Some(4)
Some(4)
None
Some(1)
Some(0)
*/
