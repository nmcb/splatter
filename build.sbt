val ProjectName      = "splatter"
val OrganisationName = "splatter"
val SplatterVersion  = "0.0.1"

val AkkaVersion      = "2.4.0"
val ScalaVersion     = "2.11.8"
val JavaVersion      = "1.8.0_66"

def common: Seq[Setting[_]] = Seq(
  organization := OrganisationName,
  version      := SplatterVersion,
  scalaVersion := ScalaVersion
)

lazy val root = (project in file("."))
  .settings( common: _*)
  .settings(
    name := ProjectName,
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-cluster"  % AkkaVersion,
      "com.typesafe.akka" %% "akka-testkit"  % AkkaVersion   % "test",
      "org.scalatest"     %% "scalatest"     % "2.2.6"       % "test"
    )
  )


