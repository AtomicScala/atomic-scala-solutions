// Solution-2.scala
// Solution to Exercise 2 in "Pattern Matching with Types"
import com.atomicscala.AtomicTest._

case class Person(name:String)

def convertToSize(x:Any):Any = {
  x match {
    case s:String => s.length
    case n:Int => n
    case f:Float => f
    case p:Person => 1
    case _ => 0
  }
}

convertToSize(45) is 45
convertToSize("car") is 3
convertToSize("truck") is 5
convertToSize(Person("Joanna")) is 1
convertToSize(45.6F) is 45.6F
convertToSize(Vector(1, 2, 3)) is 0

/* OUTPUT_SHOULD_BE
45
3
5
1
45.6
0
*/
