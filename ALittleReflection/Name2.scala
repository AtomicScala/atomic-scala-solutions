// Name2.scala
package com.atomicscala
import reflect.runtime.currentMirror

object Name2 {
  def className(o:Any) =
    currentMirror.reflect(o).symbol.
    toString
}

trait Name2 {
  override def toString = Name2.className(this)
}
