// Solution-4.scala
// Solution to Exercise 4 in "Combining Sequences with zip"
import com.atomicscala.AtomicTest._

def number(s:String) =
  s.zip(Range(0, s.length)).map {
    case (ch, n) => (n, ch)
  }

number("Howdy") is
Vector((0,'H'), (1,'o'), (2,'w'),
       (3,'d'), (4,'y'))

/* OUTPUT_SHOULD_BE
Vector((0,H), (1,o), (2,w), (3,d), (4,y))
*/
