// Solution-3.scala
// Solution to Exercise 3 in "References & Mutability"
import com.atomicscala.AtomicTest._

var a = Array(1,2,3)
var lst = List(1,2,3)

def testSeq(s:Seq[Int]) = {
  val x = s :+ 11
  println(x)
  val y = s ++ s
  println(y)
  val z = s ++: s
  println(z)
  s :+= 99
}

testSeq(a)
testSeq(lst)

/* OUTPUT_SHOULD_BE

*/
