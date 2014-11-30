// Solution-3.scala
// Solution to Exercise 3 in "Error Handling with Exceptions"
import com.atomicscala.AtomicTest._

val v = Vector(1, 7, 22, 11, 17)
println(v(4))

// Generates IndexOutOfBoundsException:
// v(5)

def t(i:Int) = try {
  v(i)
} catch {
  case e:IndexOutOfBoundsException => "IndexOutOfBoundsException"
}

t(5) is "IndexOutOfBoundsException"
t(-1) is "IndexOutOfBoundsException"