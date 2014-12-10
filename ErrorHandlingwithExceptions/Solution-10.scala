// Solution-10.scala
// Solution to Exercise 10 in "Error Handling with Exceptions"
import com.atomicscala.AtomicTest._

def thrower(throwing:Boolean) = if(throwing) throw new Exception

def withCatch(throwing:Boolean) = {
  println("+++++++++++++")
  println("throwing: " + throwing)
  try {
    thrower(throwing)
  } catch {
    case e:Exception => println("caught Exception")
  } finally {
    println("Inside withCatch finally")
  }
}

withCatch(false)
withCatch(true)

def withoutCatch(throwing:Boolean) = {
  println("-----------")
  println("throwing: " + throwing)
  try {
    thrower(throwing)
  } finally {
    println("Inside withoutCatch finally")
  }
}

withoutCatch(false)
try {
  withoutCatch(true)
} catch {
  case e:Exception => println("withoutCatch exception caught")
}
// needs solution testing
