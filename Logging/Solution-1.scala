// Solution-1.scala
// Solution to Exercise 1 in "Logging"
import com.atomicscala.AtomicTest._
import java.util.logging._

trait Logging {
  val log = Logger.getLogger(".")
  log.setUseParentHandlers(false)
  log.addHandler(new FileHandler("AtomicLog.txt"))
  // Additional handler:
  log.addHandler(new FileHandler("AtomicLogDuplicate.txt"))
  log.addHandler(new ConsoleHandler)
  // Additional handler:
  log.addHandler(new ConsoleHandler)
  log.setLevel(Level.ALL)
  log.getHandlers.foreach(_.setLevel(Level.ALL))
  def error(msg:String) = log.severe(msg)
  def warn(msg:String) = log.warning(msg)
  def info(msg:String) = log.info(msg)
  def debug(msg:String) = log.fine(msg)
  def trace(msg:String) = log.finer(msg)
}

class LoggingTest extends Logging {
  info("Constructing a LoggingTest")
  def f = {
    trace("entering f")
    // ...
    trace("leaving f")
  }
  def g(i:Int) = {
    debug(s"inside g with i: $i")
    if(i < 0)
      error("i less than 0")
    if(i > 100)
      warn(s"i getting high: $i")
  }
}

val lt = new LoggingTest
lt.f
lt.g(0)
lt.g(-1)
lt.g(101)

// VERIFY_BY_INSPECTION
