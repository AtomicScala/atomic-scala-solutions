// Solution-3.scala
// Solution to Exercise 3 in "Constructors"
import com.atomicscala.AtomicTest._

class Tea2(val decaf:Boolean = false,
           val milk:Boolean = false,
           val sugar:Boolean = false,
           val name:String = "Earl Grey") {
  def extras():String = {
    var text:String = ""
    if(decaf) text += " decaf"
    if(milk) text += " + milk"
    if(sugar) text += " + sugar"
    text
  }
  def calories():Int = {
    var total = 0
    if(milk) total = total + 100
    if(sugar) total = total + 16
    total
  }
  def describe():String = {
    name + extras
  }
}

val tea = new Tea2
tea.describe is "Earl Grey"
tea.calories is 0
tea.name is "Earl Grey"

val lemonZinger = new Tea2(decaf = true, name="Lemon Zinger")
lemonZinger.describe is "Lemon Zinger decaf"
lemonZinger.calories is 0
lemonZinger.decaf is true

val sweetGreen = new Tea2(name="Jasmine Green", sugar=true)
sweetGreen.describe is "Jasmine Green + sugar"
sweetGreen.calories is 16
sweetGreen.sugar is true

val teaLatte = new Tea2(sugar=true, milk=true)
teaLatte.describe is "Earl Grey + milk + sugar"
teaLatte.calories is 116
teaLatte.milk is true

/* OUTPUT_SHOULD_BE
Earl Grey
0
Earl Grey
Lemon Zinger decaf
0
true
Jasmine Green + sugar
16
true
Earl Grey + milk + sugar
116
true
*/
