// Starter Code for Exercise 4
// From "Companion Objects" atom
import com.atomicscala.AtomicTest._

def MET(mph:Double) = mph match {
  case x if(x < 1.7) => 2.3
  case x if(x < 2.5) => 2.9
  case x if(x < 3) => 3.3
  case x if(x >= 3) => 3.3
  case _ => 2.3
}

WalkActivity4.MET(1.0) is 2.3
WalkActivity4.MET(2.7) is 3.3

val suzie = new WalkActivity4
suzie.calories(150, 30) is 117
val john = new WalkActivity4
john.calories(150, 30, 1.5) is 82
