// Solution-2.scala
// Solution to Exercise 2 in "Building Systems with Traits"
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

trait Amount {
  val pumps:Int
}

trait Taste[F <: Flavor] extends Amount {
  val flavor:F
}

import Shots._
import Caffeine._
import Cup._
import Milk._
import Syrup._

class Coffee(shots:Shots, caffeine:Caffeine, cup:Cup, syrup:Syrup=NoFlavor) {
  override def toString = s"Coffee($shots,$caffeine,$cup)"
}

class Latte(shots:Shots, caffeine:Caffeine, cup:Cup, val milk:Milk)
extends Coffee(shots, caffeine, cup) {
  override def toString = s"Latte($shots,$caffeine,$cup,$milk)"
}

val latte = new Latte(Single, Caf, Here, Skim)
latte is "Latte(Single,Caf,Here,Skim)"

val usual = new Coffee(Double, Caf, Here)
usual is "Coffee(Double,Caf,Here)"

/* OUTPUT_SHOULD_BE
Latte(Single,Caf,Here,Skim)
Coffee(Double,Caf,Here)
*/
