import sbt._
import sbt.Keys._
import scala.Some

object MyBuild extends Build {

  // prompt shows current project
  override lazy val settings = super.settings :+ {
    shellPrompt := { s => Project.extract(s).currentProject.id + " > " }
  }

  lazy val buildSettings = Defaults.coreDefaultSettings ++ Seq( // must include Defaults.defaultSettings somewhere (early) in the chain
    organization := "com.typesafe.akka",
    scalaVersion := "2.11.4",
    crossScalaVersions := Seq("2.10.4", "2.11.4"),
    version := "1.1"
  )

  lazy val defaultSettings = buildSettings ++ Seq(
    scalacOptions in Compile ++= Seq("-encoding", "UTF-8", "-target:jvm-1.7", "-deprecation", "-feature", "-unchecked", "-Xlog-reflective-calls"),
    testOptions in Test += Tests.Argument("-oDF")
  )

  lazy val akkaPipeline = Project(
    id = "akka-pipeline",
    base = file("."),
    settings = defaultSettings ++ Seq(
      publish := { },
      libraryDependencies ++= Dependencies.akkaPipeline
    )
  )

}
