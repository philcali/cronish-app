name := "cronish-app"

version := "0.1.3"

organization := "com.github.philcali"

scalaVersion := "2.9.2"

scalacOptions := Seq("-deprecation")

libraryDependencies <++= (organization, sbtVersion) { (org, sv) => Seq (
  org %% "cronish" % "0.1.3",
  "org.scala-sbt" % "launcher-interface" % sv % "provided"
) }

publishTo <<= version { v =>
  val nexus = "https://oss.sonatype.org/"
  if (v.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { x => false }

pomExtra := (
  <url>https://github.com/philcali/cronish-app</url>
  <licenses>
    <license>
      <name>The MIT License</name>
      <url>http://www.opensource.org/licenses/mit-license.php</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:philcali/cronish-app.git</url>
    <connection>scm:git:git@github.com:philcali/cronish-app.git</connection>
  </scm>
  <developers>
    <developer>
      <id>philcali</id>
      <name>Philip Cali</name>
      <url>http://philcalicode.blogspot.com/</url>
    </developer>
  </developers>
)
