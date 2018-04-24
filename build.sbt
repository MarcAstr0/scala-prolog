name := "scala-prolog"

version := "0.1"

scalaVersion := "2.12.5"

libraryDependencies ++= Seq(
  "jpl" % "jpl" % "7.0.1",
  "org.scalactic" %% "scalactic" % "3.0.4",
  "org.scalatest" %% "scalatest" % "3.0.4" % "test"
)

mainClass := Some("com.marcastr0.ScalaProlog")