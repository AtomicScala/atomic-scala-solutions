// Solution-7.scala
// Solution to Exercise 7 in "Idiomatic Scala"
import com.atomicscala.AtomicTest._

// ClassArg.scala
class ClassArg(a:Int) {
  println(f)
  def f = { a * 10 }
}

val ca = new ClassArg(19)
ca.f is 190
// ca.a // error

// VariableClassArgs.scala

class Sum(args:Int*) {
  def result:Int = {
    var total = 0
    for(n <- args)
      total += n
    total
  }
}

/* OUTPUT_SHOULD_BE

*/
