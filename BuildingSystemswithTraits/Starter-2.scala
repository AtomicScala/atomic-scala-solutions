// Starter Code for Exercise 2
// From "Building Systems with Traits" atom
import com.atomicscala.AtomicTest._

val latte = new Latte(Single, Caf, Here, Skim)
latte is "Latte(Single,Caf,Here,Skim)"
val usual = new Coffee(Double, Caf, Here)
usual is "Coffee(Double,Caf,Here)"
