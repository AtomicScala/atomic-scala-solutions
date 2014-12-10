// Solution-2.scala
// Solution to Exercise 2 in "map & reduce"
import com.atomicscala.AtomicTest._

val v = Vector(1, 2, 3, 4)
v.foreach(n=>((n*11) + 10))
//  is Vector(21, 32, 43, 54) // uncomment this line to see why this didn't work
// needs solution testing
