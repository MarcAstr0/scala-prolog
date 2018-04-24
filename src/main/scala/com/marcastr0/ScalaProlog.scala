package com.marcastr0

import org.jpl7._

object ScalaProlog {

  def initEngine(file: String): Boolean = {
    val q = new Query("consult", Array[Term](new Atom(file)))
    q.hasSolution
  }

  def main(args: Array[String]): Unit = {
    val engine = initEngine(args(0))

    if (engine) {
      val goal = new Compound("child_of", Array[Term](new Variable("X"), new Atom("Joe")))
      val q = new Query(goal)

      val solutions = q.allSolutions().map(s => s.get("X").toString)
      println(solutions.mkString(","))
    }
  }

}
