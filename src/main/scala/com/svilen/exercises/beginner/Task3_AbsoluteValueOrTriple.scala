package com.svilen.exercises.beginner

import com.svilen.traits.Exercise
import com.svilen.util.InputHandler

/**
 * 3. Write a Scala program to get the absolute difference between n and 51.
 * If n is greater than 51 return triple the absolute difference.
 */

object Task3_AbsoluteValueOrTriple extends Exercise{
  def getAbsoluteValueOrTriple(n: Int): Int = {
    if (n > 51) Math.abs(n - 51) * 3 else Math.abs(n - 51)
  }

  override def implementTask(): Unit = {
    val num1 = InputHandler.getIntegerInput
    println(getAbsoluteValueOrTriple(num1))
  }
}
