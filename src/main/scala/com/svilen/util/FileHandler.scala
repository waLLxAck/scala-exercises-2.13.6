package com.svilen.util

import java.io.File
import scala.io.Source

object FileHandler {
  def getLinesFromTasks: List[String] = {
    val source = scala.io.Source.fromFile("src/main/resources/Tasks.txt")
    val list = source.getLines().toList
    source.close()
    list
  }

  def getLineFromTask(task: Int): String = {
    getLinesFromTasks.filter(_.startsWith(task.toString)).map(_.split(" Go to the editor").head).head
  }

}
