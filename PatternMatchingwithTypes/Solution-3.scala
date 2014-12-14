// Solution-3.scala
// Solution to Exercise 3 in "Pattern Matching with Types"
import com.atomicscala.AtomicTest._

case class Person(name:String)

def convertToSize2(x:Any):Int = {
  x match {
    case s:String => s.length
    case n:Int => n
    case f:Float => scala.math.round(f)
    case p:Person => 1
    case _ => 0
  }
}

convertToSize2(45) is 45
convertToSize2("car") is 3
convertToSize2("truck") is 5
convertToSize2(Person("Joanna")) is 1
convertToSize2(45.6F) is 46
convertToSize2(Vector(1, 2, 3)) is 0

/* OUTPUT_SHOULD_BE
45
3
5
1
46
0
*/
