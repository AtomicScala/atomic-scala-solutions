// Solution-8a.scala
// Solution to Exercise 8 in "Base Class Initialization"
import com.atomicscala.AtomicTest._

case class Teacher(name:String)

// You can inherit an ordinary class from a case class:
class StudentTeacher(name:String) extends Teacher(name)

val st = new StudentTeacher("Fran")
st is "Teacher(Fran)"

/* OUTPUT_SHOULD_BE
Teacher(Fran)
*/
