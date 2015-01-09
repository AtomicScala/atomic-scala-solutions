// Solution-2.scala
// Solution to Exercise 2 in "Logging"
import com.atomicscala.AtomicTest._
import java.util.logging._

trait Logging {
  val log = Logger.getLogger(".")
  log.setUseParentHandlers(false)
  log.setLevel(Level.ALL)
  def addHandlers(levels:Level*) =
    for(level <- levels) {
      val fh = new FileHandler("AtomicLog-" + level.getName + ".txt")
      val ch = new ConsoleHandler
      fh.setLevel(level)
      ch.setLevel(level)
      log.addHandler(fh)
      log.addHandler(ch)
    }
  addHandlers(Level.ALL, Level.SEVERE, Level.WARNING,
    Level.INFO, Level.CONFIG, Level.FINE, Level.FINER)
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
