// Solution-8b.scala
// Solution to Exercise 8 in "Base Class Initialization"
import com.atomicscala.AtomicTest._

case class Teacher(name:String)

// You cannot inherit a case class from a case class:
case class StudentTeacher(name:String) extends Teacher(name)

val st = new StudentTeacher("Fran")
st is "Teacher(Fran)"

/* OUTPUT_SHOULD_CONTAIN
error: case class StudentTeacher has case ancestor Main.$anon.Teacher, but case-to-case inheritance is prohibited. To overcome this limitation, use extractors to pattern match on non-leaf nodes.
case class StudentTeacher(name:String) extends Teacher(name)
           ^
one error found
*/
