// Starter Code for Exercise 5
// From "Sequences" atom
import com.atomicscala.AtomicTest._

val friends2 = Vector(
Â  new Friend(
Â Â Â  "Zach", "Smith", "zach@smith.com"),
Â  new Friend(
Â Â Â  "Mary", "Add", "mary@add.com"),
Â  new Friend(
Â Â Â  "Sally","Taylor","sally@taylor.com"),
Â  new Friend(
Â Â Â  "Mary", "Smith", "mary@smith.com"))
val s1 = // call first sort here
val s2 = // sort s1 here
s2 is "Vector(Mary Add, Mary Smith, " +
"Zach Smith, Sally Taylor)"
