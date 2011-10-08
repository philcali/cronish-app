name := "cronish-app"

version := "0.1.0"

organization := "com.github.philcali"

scalaVersion := "2.9.1"

scalacOptions := Seq("-deprecation")

libraryDependencies <++= (organization) (org => Seq (
  org %% "cronish" % "0.1.0",
  "org.scala-tools.sbt" %% "launcher-interface" % "0.11.0" % "provided"
))

publishTo := Some("Scala Tools Nexus" at 
                  "http://nexus.scala-tools.org/content/repositories/releases/")

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
