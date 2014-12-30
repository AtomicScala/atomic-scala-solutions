// Solution-7b.scala
// Solution to Exercise 7 in "Maps"
import com.atomicscala.AtomicTest._

class Person(name:String)

val m = Map(new Person("Bob") -> "CEO", new Person("Janice") -> "CFO")

// Uncomment this:
// m(new Person("Janice")) is "CFO"
// And your error message will contain this:
// java.util.NoSuchElementException: key not found: Main$$anon$1$Person

/* OUTPUT_SHOULD_BE

*/ // Dummy to make test pass
