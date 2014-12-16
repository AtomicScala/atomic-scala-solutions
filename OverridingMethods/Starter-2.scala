// Starter Code for Exercise 2
// From "Overriding Methods" atom
import com.atomicscala.AtomicTest._

val roaringApe = new GreatApe2(112, 9, "Male")
roaringApe.myWords is Vector("Roar")
val chattyBonobo = new Bonobo2(150, 14, "Female")
chattyBonobo.myWords is Vector("Roar", "Hello")
