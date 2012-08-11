import sbt._
import sbt.Keys._

object $name;format="Camel"$Build extends Build {

  lazy val $name;format="camel"$ = Project(
    id = "$name;format="norm"$",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "$name$",
      organization := "$organization$",
      version := "$version$",
      scalaVersion := "$scala_version$",
      libraryDependencies ++= Seq(
        // test
        "org.scalatest" %% "scalatest" % "1.8" % "test",
            
        //log
        "org.clapper" %% "grizzled-slf4j" % "0.6.9",
        "ch.qos.logback" % "logback-classic" % "1.0.1"
      )
      // add other settings here
    )
  )
}
