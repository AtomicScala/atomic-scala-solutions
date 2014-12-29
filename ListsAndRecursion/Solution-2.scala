// Solution-2.scala
// Solution to Exercise 2 in "Lists & Recursion"
import com.atomicscala.AtomicTest._

def sumIt(toSum:List[Int], sum:Int=0):Int =
  if(toSum.isEmpty)
    sum
  else {
    println(s"recursing with sum=$sum, list=$toSum.tail")
    sumIt(toSum.tail, sum + toSum.head)
  }

sumIt(List(10, 20, 30, 40, 50)) is 150

/* OUTPUT_SHOULD_BE
recursing with sum=0, list=List(10, 20, 30, 40, 50).tail
recursing with sum=10, list=List(20, 30, 40, 50).tail
recursing with sum=30, list=List(30, 40, 50).tail
recursing with sum=60, list=List(40, 50).tail
recursing with sum=100, list=List(50).tail
150
*/
