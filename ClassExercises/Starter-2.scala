// Starter Code for Exercise 2
// From "Class Exercises" atom
import com.atomicscala.AtomicTest._

val info = new Info("stuff", "Something")
info.name is "stuff"
info.description is "Something"
info.description = "Something else"
info.description is "Something else"
