// Solution-2.scala
// Solution to Exercise 2 in "Using Traits"
import com.atomicscala.AtomicTest._

trait Connections {
  val maxConnections = 5
  var connected = 0

  def connect(connection:Boolean) = {
    connection match {
      case true =>
        if(connected < maxConnections) {
          connected = connected + 1
          true
        } else false
      case false =>
        if(connected > 0) {
          connected = connected - 1
          true
        } else false
    }
  }
}

val c = new Object with Connections
c.maxConnections is 5
c.connect(true) is true
c.connected is 1
for(i <- 0 to 3)
  c.connect(true) is true
c.connect(true) is false
c.connect(false) is true
c.connected is 4
for(i <- 0 to 3)
  c.connect(false) is true
c.connected is 0
c.connect(false) is false

/* OUTPUT_SHOULD_BE
5
true
1
true
true
true
true
false
true
4
true
true
true
true
0
false
*/
