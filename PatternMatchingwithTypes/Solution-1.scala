// Solution-1.scala
// Solution to Exercise 1 in "Pattern Matching with Types"
import com.atomicscala.AtomicTest._

case class Person(name:String) {
	override def toString:String = { name }
}

def plus1(x: Any) : Any = {
  x match {
    case s:String => s + "s"
    case i:Int => i + 1
    case p:Person => s"Person(" + p + ") + guest"
    case _=>"Unknown"
  }
}

plus1("car") is "cars"
plus1(67) is 68
plus1(Person("Joanna")) is "Person(Joanna) + guest"


