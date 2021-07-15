package com.svilen.exercises.beginner

import com.svilen.traits.Exercise
import com.svilen.util.FileHandler

/**
 * 1. Write a Scala program to print "Hello, world" and version of the Scala language.
 */

object Task1_HelloWorld extends Exercise{
  super.run(1)
  override def implementTask(): Unit = {
    println("Hello World!")
    println("This is Scala " + util.Properties.versionString + ".")
  }
}