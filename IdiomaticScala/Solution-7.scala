// Solution-7.scala
// Solution to Exercise 7 in "Idiomatic Scala"
import com.atomicscala.AtomicTest._

// ClassArg.scala
class ClassArg(a:Int) {
  println(f)
  def f = a * 10
}

val ca = new ClassArg(19)
ca.f is 190

// VariableClassArgs.scala

class Sum(args:Int*) {
  def result:Int = {
    var total = 0
    for(n <- args)
      total += n
    total
  }
}

val sum = new Sum(1, 3, 5, 7, 9, 11, 13)
sum.result is 49

/* OUTPUT_SHOULD_BE
190
190
49
*/
