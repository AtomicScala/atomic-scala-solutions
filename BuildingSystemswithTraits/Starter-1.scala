// Starter Code for Exercise 1
// From "Building Systems with Traits" atom
import com.atomicscala.AtomicTest._

val single = new Coffee(Single,
Caf,
  Here, Skim, Choc)
single is
  "Coffee(Single,Caf,Here,Skim,Choc)"

val usual = new Coffee(Double, Caf,
  Here, NoMilk, NoFlavor)
usual is
  "Coffee(Double,Caf,Here,NoMilk,NoFlavor)"
val mocha = new Coffee(Double, HalfCaf,
  ToGo, Skim, Choc)
mocha is
  "Coffee(Double,HalfCaf,ToGo,Skim,Choc)"
