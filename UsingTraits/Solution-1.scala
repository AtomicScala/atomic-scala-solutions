// Solution-1.scala
// Solution to Exercise 1 in "Using Traits"
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

val webcam = new WIFICamera
webcam.showImage is "Showing video"
webcam.address is "192.168.0.200"
webcam.reportStatus is "working"

/* OUTPUT_SHOULD_BE
Showing video
192.168.0.200
working
*/
