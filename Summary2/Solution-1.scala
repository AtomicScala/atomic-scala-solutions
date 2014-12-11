// Solution-1.scala
// Solution to Exercise 1 in "Summary 2"
import com.atomicscala.AtomicTest._

val cVec = Vector('f', 'z', 'g', 'a', 'p')
cVec.sorted is Vector('a', 'f', 'g', 'p', 'z')
cVec.min is 'a'
cVec.max is 'z'
var cVecString = ""
for(i <- cVec.sorted) {
  cVecString += i + " "
}
cVecString is "a f g p z "

val iVec = Vector(1, 455, 23, -8, 4, 9, 12, 2)
iVec.sorted is Vector(-8, 1, 2, 4, 9, 12, 23, 455)
iVec.min is -8
iVec.max is 455
var iVecString = ""
for(i <- iVec.sorted) {
  iVecString += i + " "
}
iVecString is "-8 1 2 4 9 12 23 455 "

val sVec = Vector("My", "dog", "ate", "my", "homework")
sVec.sorted is Vector("My", "ate", "dog", "homework", "my")
sVec.min is "My"
sVec.max is "my"
var sVecString = ""
for(i <- sVec.sorted) {
  sVecString += i + " "
}
sVecString is "My ate dog homework my "

/* OUTPUT_SHOULD_BE
Vector(a, f, g, p, z)
a
z
a f g p z
Vector(-8, 1, 2, 4, 9, 12, 23, 455)
-8
455
-8 1 2 4 9 12 23 455
Vector(My, ate, dog, homework, my)
My
my
My ate dog homework my
*/
