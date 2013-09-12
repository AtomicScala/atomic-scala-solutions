// Starter Code for Exercise 2
// From "Pattern Matching with Types" atom
import com.atomicscala.AtomicTest._

convertToSize(45) is 45
convertToSize("car") is 3
convertToSize("truck") is 5
convertToSize(Person("Joanna")) is 1
convertToSize(45.6F) is 45.6F
convertToSize(Vector(1, 2, 3)) is 0
