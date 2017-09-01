import sbt._

object Version {
  val scalaVer     = "2.11.8"
  val scalaParsers = "1.0.4"
  val scalaTest    = "3.0.0"
  val playJson     = "2.5.10"
}

object Library {
  val scalaParsers = "org.scala-lang.modules" %% "scala-parser-combinators" % Version.scalaParsers
  val scalaTest    = "org.scalatest"          %% "scalatest"                % Version.scalaTest
  val playJson     = "com.typesafe.play"      %% "play-json"                % Version.playJson
}

object Dependencies {

  import Library._

  val dependencies = List(
    scalaParsers,
    playJson,
    scalaTest % "test",
    playJson
  )
}
