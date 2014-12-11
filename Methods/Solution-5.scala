// Solution-5.scala
// Solution to Exercise 5 in "Methods"

def addStrings(str1:String, str2:String):String = {
  str1 + str2
}

val s1 = addStrings("abc", "def")
println(s1)
assert("abcdef" == s1, "Expected abcdef, Got " + s1)
val s2 = addStrings("zyx", "abc")
println(s2)
assert("zyxabc" == s2, "Expected zyxabc, Got " + s2)

/* OUTPUT_SHOULD_BE
abcdef
zyxabc
*/
