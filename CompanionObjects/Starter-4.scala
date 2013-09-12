// Starter Code for Exercise 4
// From "Companion Objects" atom
import com.atomicscala.AtomicTest._

def MET(mph: Double) = mph match
{
  case x:Double if(x < 1.7) => 2.3
  case x:Double if(x < 2.5) => 2.9
  case x:Double if(x < 3) => 3.3
  case x:Double if(x >= 3) => 3.3
  case _ => 2.3
}
val suzie = new WalkActivity4
suzie.calories(150, 30) is 117
val john = new WalkActivity4
john.calories(150, 30, 1.5) is 82
