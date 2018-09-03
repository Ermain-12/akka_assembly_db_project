package org.ermain.scala.akka.akka_messenger

object AkkaMessages {

  // This object defines the various message types which the actor is capable of handling
  case class SetRequest(key: String, value: Object)
  case class GetRequest(key: String)

  case class KeyNotFoundException(key: String) extends Exception
}
