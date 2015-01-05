// Solution-4.scala
// Solution to Exercise 4 in "Error Reporting with Either"
import com.atomicscala.AtomicTest._

def letters = 'a' to 'z' map {
  case 'a' => Left('a')
  case 'e' => Left('e')
  case 'i' => Left('i')
  case 'o' => Left('o')
  case 'u' => Left('u')
  case x => Right(x)
}

def testLetters(n:Int) = {
  letters(n) match {
    case Left(letter) => s"Vowel: $letter"
    case Right(letter) => s"Consonant: $letter"
    case _ => "Unknown"
  }
}

testLetters(0) is "Vowel: a"
testLetters(4) is "Vowel: e"
testLetters(13) is "Consonant: n"

/* OUTPUT_SHOULD_BE
Vowel: a
Vowel: e
Consonant: n
*/
