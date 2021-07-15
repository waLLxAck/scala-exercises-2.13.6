package com.svilen.exercises.beginner

import com.svilen.traits.Exercise
import com.svilen.util.InputHandler

object Task7_CharacterRemover extends Exercise{
  override def implementTask(): Unit = {
    var counter = 0
    val stringInput: String = InputHandler.getStringInput
    val characterPosition = InputHandler.getIntegerInput
    println(stringInput.filter(char => {
      counter = counter + 1
      if (characterPosition != counter) true else false
    }))
  }
}
