package com.sksamuel.exts.concurrent

import java.util.concurrent.Callable

import scala.language.implicitConversions

object ThreadImplicits {

  implicit def toRunnable(thunk: => Any): Runnable = new Runnable {
    override def run(): Unit = thunk
  }

  implicit def toCallable[T](thunk: => T): Callable[T] = new Callable[T] {
    override def call(): T = thunk
  }

}
