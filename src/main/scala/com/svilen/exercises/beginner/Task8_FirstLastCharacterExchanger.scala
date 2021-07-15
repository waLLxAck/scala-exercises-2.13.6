package com.svilen.exercises.beginner

import com.svilen.traits.Exercise
import com.svilen.util.InputHandler

object Task8_FirstLastCharacterExchanger extends Exercise {
  override def implementTask(): Unit = {
    val stringInput = InputHandler.getStringInput
    val firstCharacter: Char = stringInput.head
    println(stringInput
      .replaceFirst(firstCharacter.toString, stringInput.last.toString)
      .dropRight(1)
      .concat(firstCharacter.toString))
  }
}
