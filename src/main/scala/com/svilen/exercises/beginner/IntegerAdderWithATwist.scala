package com.svilen.exercises.beginner

import com.svilen.traits.Exercise

/**
 * 2. Write a Scala program to compute the sum of the two given integer values.
 * If the two values are the same, then return triples their sum.
 */

object IntegerAdderWithATwist extends Exercise{

  def addTwoIntegersWithATwist(num1: Int, num2: Int): Int = {
    if (num1 == num2) 3 * (num1 + num2) else num1 + num2
  }

  override def run(): Unit = {
    println(addTwoIntegersWithATwist(2, 3))
    println(addTwoIntegersWithATwist(5, 5))
  }
}
