package com.svilen.exercises.beginner

import com.svilen.traits.Exercise
import com.svilen.util.InputHandler

object Task4_Number30Checker extends Exercise{
  override def implementTask(): Unit = {
    val num1 = InputHandler.getIntegerInput
    val num2 = InputHandler.getIntegerInput
    if ((num1==30 || num2 == 30) || (num1 + num2 == 30)) println(true)
  }
}
