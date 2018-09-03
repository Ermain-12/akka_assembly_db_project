package org.ermain.scala.akka.akka_messenger

import akka.actor.ActorSystem
import akka.testkit.TestActorRef
import akka.util.Timeout
import org.ermain.scala.akka.akka_messenger.AkkaMessages.SetRequest
import scala.concurrent.duration._
import org.scalatest.{FunSpecLike, Matchers}

class AcademyDBSpec extends FunSpecLike with Matchers {

  implicit val system = ActorSystem()
  implicit val timeout = Timeout(5 seconds)

  describe("academydb"){
    describe("given SetRequest"){
      it("Should place key/value pair inside a map"){
        val actorRef = TestActorRef(new AcademyDB)
          actorRef ! SetRequest("key", "value")

        val akkademyDB = actorRef.underlyingActor
        akkademyDB.map.get("key") should equal(Some("value"))
      }
    }
  }
}
