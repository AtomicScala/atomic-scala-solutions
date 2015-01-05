// Solution-4.scala
// Solution to Exercise 4 in "Handling Non-Values with Option"
import com.atomicscala.AtomicTest._

def alphanumeric(a:Any):Option[Any] =
  a match {
    case c:Char if(c >= 'a' && c <= 'z') => Some(c)
    case c:Char if(c >= 'A' && c <= 'Z') => Some(c)
    case i:Int => Some(i)
    case _ => None
  }

alphanumeric(0) is Some(0)
alphanumeric('a') is Some('a')
alphanumeric('m') is Some('m')
alphanumeric('$') is None
alphanumeric('Z') is Some('Z')

/* OUTPUT_SHOULD_BE
Some(0)
Some(a)
Some(m)
None
Some(Z)
*/
