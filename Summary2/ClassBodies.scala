package com.atomicscala.Bodies

class NoBody {
  def who():String = {
    "Nobody's home"
  }
}

class SomeBody {
  def name():String = {
    "Janet Doe"
  }
  println(name + " is SomeBody")
}

class EveryBody {
  val all = Vector(new SomeBody, new SomeBody, new SomeBody)
}
