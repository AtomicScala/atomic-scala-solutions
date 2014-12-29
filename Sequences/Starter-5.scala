// Starter Code for Exercise 5
// From "Sequences" atom
import com.atomicscala.AtomicTest._

val friends2 = Vector(
  new Friend("Zach", "Smith", "zach@smith.com"),
  new Friend("Mary", "Add", "mary@add.com"),
  new Friend("Sally","Taylor","sally@taylor.com"),
  new Friend("Mary", "Smith", "mary@smith.com")
)

val s1 = // call first sort here
val s2 = // sort s1 here
s2 is "Vector(Mary Add, Mary Smith, Zach Smith, Sally Taylor)"
