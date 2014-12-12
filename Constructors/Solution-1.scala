// Solution-1.scala
// Solution to Exercise 1 in "Constructors"
import com.atomicscala.AtomicTest._

class Coffee(val shots:Int = 2,
             val decaf:Int = 0,
             val milk:Boolean = false,
             val toGo:Boolean = false,
             val syrup:String = "") {
  var result = ""
  println(caf, decaf, milk, toGo, syrup)
  def getCup():Unit = {
    if(toGo) {
      result += "ToGoCup "
    } else {
      result += "HereCup "
    }
  }
  def caf():Int = {
    shots - decaf
  }
  def pourShots():Unit = {
    for(s <- 0 until shots) {
      if(decaf > 0) {
        result += "decaf shot "
      } else {
        result += "shot "
      }
    }
  }
  def addMilk():Unit = {
    if(milk) {
      result += "milk "
    }
  }
  def addSyrup():Unit = {
    result += syrup
  }
  getCup()
  pourShots()
  addMilk()
  addSyrup()
}

val doubleHalfCaf = new Coffee(shots=2, decaf=1)
val tripleHalfCaf = new Coffee(shots=3, decaf=2)
doubleHalfCaf.decaf is 1
doubleHalfCaf.caf() is 1
doubleHalfCaf.shots is 2
tripleHalfCaf.decaf is 2
tripleHalfCaf.caf() is 1
tripleHalfCaf.shots is 3

/* OUTPUT_SHOULD_BE
(1,1,false,false,)
(1,2,false,false,)
1
1
2
2
1
3
*/
