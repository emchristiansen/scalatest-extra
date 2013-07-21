name := "scalatest-extra"

version := "0.1-SNAPSHOT"

scalaVersion := "2.10.2"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.0.M5b"

libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.10.1"

libraryDependencies += "junit" % "junit" % "4.11"

organization := "emchristiansen"

publishMavenStyle := false

publishTo := Some(Resolver.file("file", new File("./releases")))