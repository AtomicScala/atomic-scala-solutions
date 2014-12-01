// Starter Code for Exercise 2
// From "Class Arguments" atom
import com.atomicscala.AtomicTest._

val family3 = new FlexibleFamily("Mom", "Dad", "Sally", "Dick")
family3.familySize() is 4
val family4 = new FlexibleFamily("Dad", "Mom", "Harry")
family4.familySize() is 3
