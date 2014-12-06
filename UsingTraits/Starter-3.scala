// Starter Code for Exercise 3
// From "Using Traits" atom
import com.atomicscala.AtomicTest._

val c2 = new WIFICamera with Connections
c2.maxConnections is 5
c2.connect(true) is true
c2.connected is 1
c2.connect(false) is true
c2.connected is 0
c2.connect(false) is false
