package com.svilen.exercises.beginner

import com.svilen.traits.Exercise
import com.svilen.util.InputHandler

object Task6_TheIfString extends Exercise{

  override def implementTask(): Unit = {
    val stringInput: String = InputHandler.getStringInput
    if (stringInput startsWith "if") println(stringInput) else println(s"if$stringInput")
  }

}
