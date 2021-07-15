package com.svilen.util

object InputHandler {
  def getStringInput: String = {
    print("Enter a string: ")
    scala.io.StdIn.readLine()
  }

  def getIntegerInput: Int = {
    print("Enter a number: ")
    scala.io.StdIn.readInt()
  }

}
