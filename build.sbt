val ProjectName      = "splatter"
val OrganisationName = "splatter"
val ProjectVersion   = "0.0.1"

val ScalaVersion     = "2.11.7"
val JavaVersion      = "1.8.0_66"

def common: Seq[Setting[_]] = Seq(
  organization := OrganisationName,
  version      := ProjectVersion,
  scalaVersion := ScalaVersion
)

lazy val root = (project in file("."))
  .settings( common: _*)
  .settings(
    name := ProjectName,
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "2.2.6" % "test"
    )
  )


