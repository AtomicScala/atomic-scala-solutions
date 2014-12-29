// Solution-3.scala
// Solution to Exercise 3 in "Building Systems with Traits"
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
  val Skim, Lowfat = Value
}

trait Flavor

object Syrup extends Enumeration {
  case class _Val() extends Val
    with Flavor
  type Syrup = _Val
  val NoFlavor, Vanilla, Hazelnut,
    Raspberry, Choc = _Val()
}

import Syrup._

trait Amount {
  val quantity:Int
}

trait Taste[F <: Flavor] extends Amount {
  val flavor:F
}

import Shots._
import Caffeine._
import Cup._
import Milk._
import Syrup._

class Coffee(shots:Shots, caffeine:Caffeine, cup:Cup) {
  override def toString = s"Coffee($shots,$caffeine,$cup)"
}

class Latte(shots:Shots, caffeine:Caffeine, cup:Cup, val milk:Milk)
extends Coffee(shots, caffeine, cup) {
  override def toString = s"Latte($shots,$caffeine,$cup,$milk)"
}

class Mocha(shots:Shots, caffeine:Caffeine, cup:Cup, milk:Milk)
extends Latte(shots, caffeine, cup, milk) {
  val flavor = Choc
  override def toString = s"Mocha($shots,$caffeine,$cup,$milk,$flavor)"
}

val mocha = new Mocha(Double,Caf,ToGo,Skim)
mocha is "Mocha(Double,Caf,ToGo,Skim,Choc)"

/* OUTPUT_SHOULD_BE
Mocha(Double,Caf,ToGo,Skim,Choc)
*/
