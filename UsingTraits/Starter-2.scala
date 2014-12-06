// Starter Code for Exercise 2
// From "Using Traits" atom
import com.atomicscala.AtomicTest._

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
