// Solution-1.scala
// Solution to Exercise 1 in "Tuples"
import com.atomicscala.AtomicTest._

val tuple1 = (65, "Sunny", "Stars")
val (temp1, sky1, view1) = tuple1

temp1 is 65
sky1 is "Sunny"
view1 is "Stars"

val tuple2 = (78, "Cloudy", "Satellites")
val (temp2, ski2, view2) = tuple2

temp2 is 78
ski2 is "Cloudy"
view2 is "Satellites"

val tuple3 = (51, "Blue", "Night")
val (temp3, ski3, view3) = tuple3

temp3 is 51
ski3 is "Blue"
view3 is "Night"

/* OUTPUT_SHOULD_BE
65
Sunny
Stars
78
Cloudy
Satellites
51
Blue
Night
*/
