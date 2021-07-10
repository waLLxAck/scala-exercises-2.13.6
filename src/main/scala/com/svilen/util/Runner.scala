package com.svilen.util

import com.svilen.traits.Exercise
import org.clapper.classutil.ClassFinder

import java.io.File
import scala.collection.mutable.ListBuffer
import scala.io.Source
import scala.reflect.runtime.universe

object Runner extends App {
  val classes = this.getClassList.sorted

  for (className <- classes) {
    if (!(className equals "exercises.HelloWorld")) {
      val runtimeMirror = universe.runtimeMirror(getClass.getClassLoader)
      val module = runtimeMirror.staticModule(className)
      val obj = runtimeMirror.reflectModule(module)
      val exercise: Exercise = obj.instance.asInstanceOf[Exercise]
      println("Task: " + className.substring(30).replace("$", ""))
      println("----------------------------")
      exercise.run()
      println("----------------------------")
    }
  }

  def readFile(file: String): List[String] = {
    val source = Source.fromFile("resources/" + file + ".txt")
    val lines = source.getLines().toList
    source.close()
    return lines
  }

  def getClassList: List[String] = {
    var pluginList = ListBuffer[String]()
    val classPath = new File(com.svilen.exercises.beginner.HelloWorld.getClass.getProtectionDomain.getCodeSource.getLocation.getPath)
    val finder = ClassFinder(Seq(classPath))
    finder.getClasses().filter(_.isConcrete).filter(_.interfaces.exists(_.contains("com.svilen.traits.Exercise"))).map(_.toString()).toList
  }
}
