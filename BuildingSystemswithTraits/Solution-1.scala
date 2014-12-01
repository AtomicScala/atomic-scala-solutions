// Solution-1.scala
// Solution to Exercise 1 in "Building Systems with Traits"
import com.atomicscala.AtomicTest._

object Shots extends Enumeration {
  type Shots = Value
  val Single, Double, Triple = Value
}

object Cup extends Enumeration {
  type Cup = Value
  val ToGo, Here = Value
}

object Caffeine extends Enumeration {
  type Caffeine = Value
  val Caf, HalfCaf, Decaf = Value
}

object Milk extends Enumeration {
  type Milk = Value
  val NoMilk, Skim, Lowfat = Value
}

trait Flavor

object Syrup extends Enumeration {
  case class _Val() extends Val
    with Flavor
  type Syrup = _Val
  val NoFlavor, Vanilla, Hazelnut,
    Raspberry, Choc = _Val()
}
trait Amount {
  val pumps: Int
}

trait Taste[F <: Flavor] extends Amount {
  val flavor:F
}

import Shots._
import Caffeine._
import Cup._
import Milk._
import Syrup._

case class Coffee(shots:Shots,
  caffeine: Caffeine,
  cup: Cup, milk: Milk, syrup: Syrup)

val single = new Coffee(Single, Caf, Here, Skim, Choc)
single is "Coffee(Single,Caf,Here,Skim,Choc)"

val usual = new Coffee(Double, Caf, Here, NoMilk, NoFlavor)
usual is "Coffee(Double,Caf,Here,NoMilk,NoFlavor)"
val mocha = new Coffee(Double, HalfCaf, ToGo, Skim, Choc)
mocha is "Coffee(Double,HalfCaf,ToGo,Skim,Choc)"
