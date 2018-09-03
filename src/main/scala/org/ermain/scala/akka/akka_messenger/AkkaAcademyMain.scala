package org.ermain.scala.akka.akka_messenger

import akka.actor.{ActorSystem, Props}

object AkkaAcademyMain {

  def main(args: Array[String]): Unit = {
    println("Greetings Akka AcademyDB.....")

    val system  = ActorSystem("akka-db")

    val dbActor = system.actorOf(Props[AcademyDB], name = "akkaDB")
    
  }
}
