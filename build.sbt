ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := "2.12.6"
ThisBuild / version      := "0.1.0-SNAPSHOT"

lazy val root = (project in file(".")).
  settings(
    name := "akka-jdk11",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-testkit" % "2.5.13"
    )
  )
