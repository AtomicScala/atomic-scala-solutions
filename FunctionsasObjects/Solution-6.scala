// Solution-6.scala
// Solution to Exercise 6 in "Functions as Objects"
import com.atomicscala.AtomicTest._

val between = (temperature:Int, low:Int, high:Int) =>
    if(temperature >= low && temperature <= high) true else false

between(70, 80, 90) is false
between(70, 60, 90) is true

/* OUTPUT_SHOULD_BE
false
true
*/
