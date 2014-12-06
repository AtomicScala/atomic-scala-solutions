// Solution-4.scala
// Solution to Exercise 4 in "Error Reporting with Either"
import com.atomicscala.AtomicTest._

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
