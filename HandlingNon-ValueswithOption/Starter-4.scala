// Starter Code for Exercise 4
// From "Handling Non-Values with Option" atom
import com.atomicscala.AtomicTest._

alphanumeric(0) is Some(0)
alphanumeric('a') is Some('a')
alphanumeric('m') is Some('m')
alphanumeric('$') is None
alphanumeric('Z') is Some('Z')
