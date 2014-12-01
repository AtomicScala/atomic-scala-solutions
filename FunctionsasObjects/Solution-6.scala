// Solution-6.scala
// Solution to Exercise 6 in "Functions as Objects"
import com.atomicscala.AtomicTest._

val between = (t:Int, l:Int, h:Int) => if (t >= l && t <= h) true else false
between(70, 80, 90) is false
between(70, 60, 90) is true
