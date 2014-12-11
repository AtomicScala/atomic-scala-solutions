// Solution-3.scala
// Solution to Exercise 3 in "Pattern Matching"
import com.atomicscala.AtomicTest._

// Simple solution
def checkTruth(exp1:Boolean, exp2:Boolean):String = {
  exp1 match {
    case true=>
      if(exp2) "Both are true"
      else "First: true, second: false"
    case false=>
      if(exp2) "First: false, second: true"
      else "Both are false"
  }
}

checkTruth(true || false, true) is "Both are true"
checkTruth(1 > 0 && -1 < 0, 1 == 2) is "First: true, second: false"
checkTruth(1 >= 2, 1 >= 1) is "First: false, second: true"
checkTruth(true && false, false && true) is "Both are false"

// BONUS Solution:
def checkTruth2(exp1:Boolean, exp2:Boolean):String = {
  (exp1, exp2) match {
    case (true, true) => "Both are true"
    case (true, false) => "First: true, second: false"
    case (false, true) => "First: false, second: true"
    case (false, false) => "Both are false"
  }
}

checkTruth2(true || false, true) is "Both are true"
checkTruth2(1 > 0 && -1 < 0, 1 == 2) is "First: true, second: false"
checkTruth2(1 >= 2, 1 >= 1) is "First: false, second: true"
checkTruth2(true && false, false && true) is "Both are false"

/* OUTPUT_SHOULD_BE
Both are true
First: true, second: false
First: false, second: true
Both are false
Both are true
First: true, second: false
First: false, second: true
Both are false
*/
