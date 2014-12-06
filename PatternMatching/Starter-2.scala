// Starter Code for Exercise 2
// From "Pattern Matching" atom
import com.atomicscala.AtomicTest._

val v = Vector(1)
val v2 = Vector(3, 4)
oneOrTheOther(v == v.reverse) is "True!"
oneOrTheOther(v2 == v2.reverse) is "It's false"
