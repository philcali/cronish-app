name := "cronish-app"

version := "0.0.2"

organization := "com.github.philcali"

scalaVersion := "2.9.0"

libraryDependencies <++= (organization) (org => Seq (
  org %% "cronish" % "0.0.1",
  org %% "monido-core" % "0.0.3",
  "org.scala-tools.sbt" % "launcher-interface" % "0.10.0"
))

publishTo := Some("Scala Tools Nexus" at 
                  "http://nexus.scala-tools.org/content/repositories/releases/")

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
