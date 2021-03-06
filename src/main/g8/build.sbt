lazy val commonSettings = Seq(
  organization := "net.hiogawa",
  version := "0.0.1",
  scalaVersion := "2.11.4"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "my_package",
    scalacOptions in Test ++= Seq("-Yrangepos"),
    publishArtifact := false,
    libraryDependencies ++= Seq(
      "org.specs2" %% "specs2" % "2.4" % "test"
    ),
    resolvers ++= Seq(
      "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
      "Sonatype OSS Releases" at "https://oss.sonatype.org/content/repositories/releases"
    ),
    initialCommands := "import net.hiogawa.package"
  )
