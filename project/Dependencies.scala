import sbt._

object Dependencies {

  object V {
    val akka = "2.3.7"
  }

  object Libraries {
    val akka = "com.typesafe.akka"           %% "akka-actor"		% V.akka
  }

  import Libraries._ 

  val akkaPipeline = Seq(akka)
}
