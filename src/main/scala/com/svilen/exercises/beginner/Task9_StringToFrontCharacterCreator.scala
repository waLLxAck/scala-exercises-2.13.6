package com.svilen.exercises.beginner

import com.svilen.traits.Exercise
import com.svilen.util.InputHandler

object Task9_StringToFrontCharacterCreator extends Exercise{
  override def implementTask(): Unit = {
    val stringInput = InputHandler.getStringInput
    if (stringInput.length < 2) println(stringInput) else println(stringInput.substring(0, 2) * 4)
  }
}
