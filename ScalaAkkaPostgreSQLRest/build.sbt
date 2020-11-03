//lazy val akkaHttpVersion = "10.2.1"
//lazy val akkaVersion    = "2.6.10"
//
//lazy val root = (project in file(".")).
//  settings(
//    inThisBuild(List(
//      organization    := "com.postgres_rest",
//      scalaVersion    := "2.13.3"
//    )),
//    name := "ScalaAkkaPostgreSQLRest",
//    libraryDependencies ++= Seq(
//      "com.typesafe.akka" %% "akka-http"                % akkaHttpVersion,
//      "com.typesafe.akka" %% "akka-http-spray-json"     % akkaHttpVersion,
//      "com.typesafe.akka" %% "akka-actor-typed"         % akkaVersion,
//      "com.typesafe.akka" %% "akka-stream"              % akkaVersion,
//      "ch.qos.logback"    % "logback-classic"           % "1.2.3",
//
//      "com.typesafe.akka" %% "akka-http-testkit"        % akkaHttpVersion % Test,
//      "com.typesafe.akka" %% "akka-actor-testkit-typed" % akkaVersion     % Test,
//      "org.scalatest"     %% "scalatest"                % "3.0.8"         % Test
//    )
//  )



/* Commented the default contents of the builds.sbt and getting the structure, dependencies and their versions as per the application requirements */

/**
 *  Below is my version of build.sbt with some modifications in the default version
 *  Here, Circe is used as JSON library replacement for Spray-Json
 */
lazy val akkaHttpVersion = "10.2.1"
lazy val akkaVersion    = "2.6.10"
lazy val scalaTestVersion = "3.0.8"
lazy val circeVersion = "0.12.3"
lazy val slickVersion = "3.3.3"
lazy val postgreSqlVersion = "42.2.18"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization    := "com.postgres_rest",
      scalaVersion    := "2.13.3"
    )),
    name := "ScalaAkkaPostgreSQLRest",
    version := "1.0.0",
    libraryDependencies ++= Seq(
          "com.typesafe.akka" %% "akka-actor-typed"         % akkaVersion,
          "com.typesafe.akka" %% "akka-actor-testkit-typed" % akkaVersion              % Test,
          "org.scalatest"     %% "scalatest"                % scalaTestVersion         % Test,

          "com.typesafe.akka" %% "akka-http"                % akkaHttpVersion,
          "com.typesafe.akka" %% "akka-http-core"           % akkaHttpVersion,
          "com.typesafe.akka" %% "akka-http-spray-json"     % akkaHttpVersion,
          "de.heikoseeberger" %% "akka-http-circe"          % "1.31.0",
          "com.typesafe.akka" %% "akka-http-testkit"        % akkaHttpVersion          % Test,

          "com.typesafe.akka" %% "akka-stream"              % akkaVersion,

          "com.typesafe.slick" %% "slick"                   % slickVersion,
          "org.slf4j"         % "slf4j-nop"                 % "1.6.4",
          "com.typesafe.slick" %% "slick-hikaricp"          % slickVersion,
          "com.zaxxer"        % "HikariCP"                  % "3.4.5",

          "org.postgresql"    % "postgresql"                % postgreSqlVersion,
          "org.flywaydb"      % "flyway-core"               % "7.0.4",

//          "ch.qos.logback"    %  "logback-classic"          % "1.2.3",

          "io.circe"          %% "circe-core"               % circeVersion,
          "io.circe"          %% "circe-generic"            % circeVersion,
          "io.circe"          %% "circe-parser"             % circeVersion
    )
  )