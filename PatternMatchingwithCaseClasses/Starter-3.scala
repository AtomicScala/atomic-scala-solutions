// Starter Code for Exercise 3
// From "Pattern Matching with Case Classes" atom
import com.atomicscala.AtomicTest._

case class Kitten(name:String)

travel2(Kitten("Kitty")) is "Kitten(Kitty) is in limbo!"
