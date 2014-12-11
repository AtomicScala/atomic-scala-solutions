// Solution-7.scala
// Solution to Exercise 7 in "Vectors"
import com.atomicscala.AtomicTest._

val intVector = Vector(10, 20, 30, 40, 50)
val doubleVector = Vector(10.1D, 20.2D, 30.3D, 40.4D, 50.5D)

intVector.sum is 150
intVector.min is 10
intVector.max is 50

doubleVector.sum is 151.5D
doubleVector.min is 10.1D
doubleVector.max is 50.5D

/* OUTPUT_SHOULD_BE
150
10
50
151.5
10.1
50.5
*/
