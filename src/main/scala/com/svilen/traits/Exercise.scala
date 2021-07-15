package com.svilen.traits

import com.svilen.util.FileHandler

trait Exercise extends App{

  def run(taskNumber: Int): Unit = {
    printTaskDescription(FileHandler.getLineFromTask(taskNumber))
    implementTask()

  }

  def printTaskDescription(taskDescription: String): Unit = println(taskDescription)

  def implementTask(): Unit
}
