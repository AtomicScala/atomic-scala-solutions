// Solution-1.scala
// Solution to Exercise 1 in "Overloading"
import com.atomicscala.AtomicTest._

println("this won't work -- redefining functions")

// Note: this won't work -- redefining functions

/*def f(n:Int):Int = { 77 }
def f(n:Int):Int = { n + 1 }

f() is 77
f(11) is 12

class MethodOverloading1 {
  def f(n:identical):Int = { 88 }
  def f(n:Int):Int = { n + 2 }
}

class MethodOverloading2 {
  def f(n:Int):Int = { 99 }
  def f(n:Int):Int = { n + 3 }
}

val mo1 = new MethodOverloading1
val mo2 = new MethodOverloading2
mo1.f() is 88
mo1.f(11) is 13
mo2.f() is 99
mo2.f(11) is 14
*/
