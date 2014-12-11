// Solution-4.scala
// Solution to Exercise 4 in "Methods"

def getMe(str:String):String = {
  str.toLowerCase
}

val g1 = getMe("abraCaDabra")
println(g1)
assert("abracadabra" == g1, "Expected abracadabra, Got " + g1)
val g2 = getMe("zyxwVUT")
println(g2)
assert("zyxwvut"== g2, "Expected zyxwvut, Got " + g2)

/* OUTPUT_SHOULD_BE
abracadabra
zyxwvut
*/
