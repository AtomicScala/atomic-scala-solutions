// Solution-7.scala
// Solution to Exercise 7 in "Class Arguments"
import com.atomicscala.AtomicTest._

class Cup3(var percentFull:Int) {
  val max = 100
  def increase(amount:Int*):Int = {
    for (i<-amount) {
      percentFull += i
      if(percentFull > max) percentFull = max
    }
    percentFull // Return this value
  }
}

val cup3 = new Cup3(0)
cup3.percentFull=100
println(cup3.percentFull)
