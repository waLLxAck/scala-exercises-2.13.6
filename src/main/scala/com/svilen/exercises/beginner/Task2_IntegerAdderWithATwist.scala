package com.svilen.exercises.beginner

import com.svilen.traits.Exercise
import com.svilen.util.InputHandler

/**
 * 2. Write a Scala program to compute the sum of the two given integer values.
 * If the two values are the same, then return triples their sum.
 */

object Task2_IntegerAdderWithATwist extends Exercise{
  def addTwoIntegersWithATwist(num1: Int, num2: Int): Int = {
    if (num1 == num2) 3 * (num1 + num2) else num1 + num2
  }

  override def implementTask(): Unit = {
    val num1 = InputHandler.getIntegerInput
    val num2 = InputHandler.getIntegerInput

    println(addTwoIntegersWithATwist(num1, num2))
  }
}
