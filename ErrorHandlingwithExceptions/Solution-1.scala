// Solution-1.scala
// Solution to Exercise 1 in "Error Handling with Exceptions"
/* Create a method that throws an object of class Exception inside a try
block. Pass a String argument to the Exception constructor. Catch the
exception inside a catch clause and print the String argument. */
import com.atomicscala.AtomicTest._

def solution1 =
  try {
    throw new Exception("solution1")
  } catch {
    case err:Exception => err.getMessage
  }

solution1 is "solution1"