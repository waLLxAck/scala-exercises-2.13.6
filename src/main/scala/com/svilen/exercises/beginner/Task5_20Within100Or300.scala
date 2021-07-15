package com.svilen.exercises.beginner

import com.svilen.traits.Exercise
import com.svilen.util.InputHandler

object Task5_20Within100Or300 extends Exercise{
  override def implementTask(): Unit = {
    val num1 = InputHandler.getIntegerInput
    if (((100 - num1) < 20) || ((300 - num1) < 20)) println(true) else println(false)
  }
}
