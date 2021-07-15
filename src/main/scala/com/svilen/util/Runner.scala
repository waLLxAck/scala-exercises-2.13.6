package com.svilen.util

import com.svilen.traits.Exercise
import org.clapper.classutil.ClassFinder

import java.io.File
import scala.collection.mutable.ListBuffer
import scala.io.Source
import scala.reflect.runtime.universe

object Runner extends App {

  val classes = this.getClassList.sorted.reverse
  var counter: Int = classes.size+1
  classes.foreach(println(_))

  for (className <- classes) {
    val runtimeMirror = universe.runtimeMirror(getClass.getClassLoader)
    val module = runtimeMirror.staticModule(className)
    val obj = runtimeMirror.reflectModule(module)
    val exercise: Exercise = obj.instance.asInstanceOf[Exercise]
    println("----------------------------")
    println("Task Name: " + className.substring(30).replace("$", ""))
    print("Task Description: ")
    counter = counter - 1
    println(counter)
    exercise.run(counter)
    println("----------------------------")
  }

  def readFile(file: String): List[String] = {
    val source = Source.fromFile("resources/" + file + ".txt")
    val lines = source.getLines().toList
    source.close()
    lines
  }

  def getClassList: List[String] = {
    var pluginList = ListBuffer[String]()
    val classPath = new File(getClass.getProtectionDomain.getCodeSource.getLocation.getPath)
    val finder = ClassFinder(Seq(classPath))
    finder.getClasses().filter(_.isConcrete).filter(_.interfaces.exists(_.contains("com.svilen.traits.Exercise"))).map(_.toString()).toList
  }
}
