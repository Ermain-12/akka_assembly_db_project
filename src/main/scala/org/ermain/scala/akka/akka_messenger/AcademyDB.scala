package org.ermain.scala.akka.akka_messenger

import akka.actor.Actor
import akka.event.Logging
import AkkaMessages._

import scala.collection.mutable

class AcademyDB extends Actor {

  val map = new mutable.HashMap[String, Object]
  val log = Logging(context.system, this)

  override def receive: Receive = {
    case SetRequest(key, value)   =>   {
      log.info(s"Received SetRequest -- key: $key value: $value")
      map.put(key, value)
    }

    case o    =>    log.info(s"Received unknown message: $o")
  }
}
