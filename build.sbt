name := "cronish-app"

version := "0.0.3"

organization := "com.github.philcali"

scalaVersion := "2.9.0"

scalacOptions := Seq("-deprecation")

libraryDependencies <++= (organization) (org => Seq (
  org %% "cronish" % "0.0.2"
))

publishTo := Some("Scala Tools Nexus" at 
                  "http://nexus.scala-tools.org/content/repositories/releases/")

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
