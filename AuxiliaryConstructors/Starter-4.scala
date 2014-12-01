// Starter Code for Exercise 4
// From "Auxiliary Constructors" atom
import com.atomicscala.AtomicTest._

val washer = new ClothesWasher3("LG 100", 3.6)
washer.wash(2, 1) is "Wash used 2 bleach and 1 fabric softener"
washer.wash() is "Simple wash"
