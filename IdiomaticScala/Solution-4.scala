// Solution-4.scala
// Solution to Exercise 4 in "Idiomatic Scala"
import com.atomicscala.AtomicTest._

def addMultiply(x:Int, y:Double, s:String) = {
  println(s)
  (x + y) * 2.1
}

val r2:Double = addMultiply(7, 9, "Inside addMultiply")
r2 is 33.6

/* OUTPUT_SHOULD_BE
Inside addMultiply
33.6
*/
