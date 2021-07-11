package com.svilen.exercises.beginner

import com.svilen.traits.Exercise

/**
 * 1. Write a Scala program to print "Hello, world" and version of the Scala language.
 */

object HelloWorld extends Exercise {
  override def run(): Unit = {
    println("Hello World!")
  }
}