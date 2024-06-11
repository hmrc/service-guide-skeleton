resolvers += "HMRC-open-artefacts-maven" at "https://open.artefacts.tax.service.gov.uk/maven2"
resolvers += Resolver.url("HMRC-open-artefacts-ivy", url("https://open.artefacts.tax.service.gov.uk/ivy2"))(Resolver.ivyStylePatterns)

addSbtPlugin("uk.gov.hmrc"        % "sbt-auto-build"        % "3.22.0")
addSbtPlugin("uk.gov.hmrc"        % "sbt-distributables"    % "2.5.0")
addSbtPlugin("org.playframework"  % "sbt-plugin"            % "3.0.3")
addSbtPlugin("org.scalastyle"    %% "scalastyle-sbt-plugin" % "1.0.0")
addSbtPlugin("org.scalameta"      % "sbt-scalafmt"          % "2.5.2")
addSbtPlugin("ch.epfl.scala"      % "sbt-scalafix"          % "0.11.1")

ThisBuild / libraryDependencySchemes += "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always
