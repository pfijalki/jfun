val testDependencies = Seq(
  "com.novocode" % "junit-interface" % "0.11"
).map(_ % Test)

lazy val root = (project in file("."))
  .settings(
    name := "jfun",
    version := "1.0",
    libraryDependencies ++= testDependencies,
    testOptions += Tests.Argument(TestFrameworks.JUnit, "-q", "-v"),
    scalacOptions += "-target:jvm-1.8"
  )
