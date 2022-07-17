name := "bda2022-lab10"

version := "0.1"

scalaVersion := "2.13.8"

resolvers += Resolver.sonatypeRepo("releases")

libraryDependencies ++= Seq(
  "com.danielasfregola" %% "twitter4s" % "8.0",
  "com.azure" % "azure-messaging-eventhubs" % "5.12.1",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
  "ch.qos.logback" % "logback-classic" % "1.2.11"
)
