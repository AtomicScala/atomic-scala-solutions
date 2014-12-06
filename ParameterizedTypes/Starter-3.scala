// Starter Code for Exercise 3
// From "Parameterized Types" atom
import com.atomicscala.AtomicTest._

explicitSet(Vector(10.0, 20.0, 10.0)) is Set(10.0, 20.0)
explicitSet(Vector(1, 2, 3, 2, 3, 4)) is Set(1.0, 2.0, 3.0, 4.0)
