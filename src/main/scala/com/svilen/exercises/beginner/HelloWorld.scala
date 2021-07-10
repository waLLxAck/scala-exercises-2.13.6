package com.svilen.exercises.beginner

import com.svilen.traits.Exercise

object HelloWorld extends Exercise {
  override def run(): Unit = {
    println("Hello World!")
  }
}