// Starter Code for Exercise 1
// From "Class Arguments" atom
import com.atomicscala.AtomicTest._

val family1 = new Family("Mom", "Dad", "Sally", "Dick")
family1.familySize() is 4
val family2 = new Family("Dad", "Mom", "Harry")
family2.familySize() is 3
