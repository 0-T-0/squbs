import de.johoop.jacoco4sbt._
import JacocoPlugin._
import org.scalastyle.sbt.ScalastylePlugin._
import de.johoop.findbugs4sbt.FindBugs._

name := "unicomplex"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.1.0" % "test",
  "com.typesafe.akka" %% "akka-actor" % "2.2.3",
  "com.typesafe.akka" %% "akka-agent" % "2.2.3",
  "com.typesafe.akka" %% "akka-testkit" % "2.2.3" % "test",
  "io.spray" % "spray-can" % "1.2.0",
  "io.spray" % "spray-http" % "1.2.0",
  "io.spray" % "spray-routing" % "1.2.0",
  "io.spray" % "spray-testkit" % "1.2.0" % "test",
  "org.zeromq" % "jeromq" % "0.3.3"
)

jacoco.settings

findbugsSettings

org.scalastyle.sbt.ScalastylePlugin.Settings

parallelExecution in Test := false

ScoverageSbtPlugin.instrumentSettings

parallelExecution in ScoverageSbtPlugin.scoverageTest := false
