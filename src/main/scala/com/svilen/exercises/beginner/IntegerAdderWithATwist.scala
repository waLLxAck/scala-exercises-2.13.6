package com.svilen.exercises.beginner

import com.svilen.traits.Exercise

object IntegerAdderWithATwist extends Exercise{

  def addTwoIntegersWithATwist(num1: Int, num2: Int): Int = {
    if (num1 == num2) 3 * (num1 + num2) else num1 + num2
  }

  override def run(): Unit = {
    println(addTwoIntegersWithATwist(2, 3))
    println(addTwoIntegersWithATwist(5, 5))
  }
}
