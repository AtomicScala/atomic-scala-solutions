// Solution-3.scala
// Solution to Exercise 3 in "Using Traits"
import com.atomicscala.AtomicTest._

trait WIFI {
  def reportStatus = "working"
  val address:String
}

class Camera {
  def showImage = "Showing video"
  def takeStillPhoto = "Took a picture"
}

class WIFICamera extends Camera with WIFI {
  val address = "192.168.0.200"
}

trait Connections {
  val maxConnections = 5
  var connected = 0

  def connect(connection:Boolean) = {
    connection match {
      case true =>
        if(connected < maxConnections) {
        connected = connected + 1
        true
      }
      else false
      case false =>
      if(connected > 0) {
        connected = connected - 1
        true
      }
      else false
    }
  }
}


val c2 = new WIFICamera with Connections
c2.maxConnections is 5
c2.connect(true) is true
c2.connected is 1
c2.connect(false) is true
c2.connected is 0
c2.connect(false) is false

/* OUTPUT_SHOULD_BE
5
true
1
true
0
false
*/
