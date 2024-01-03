import play.sbt.PlayImport._
import sbt._

object AppDependencies {
  lazy val bootStrapPlayVersion = "7.19.0"

  lazy val compile: Seq[ModuleID] = Seq(
    ws,
    "uk.gov.hmrc" %% "bootstrap-frontend-play-28" % bootStrapPlayVersion
  )

  lazy val test: Seq[ModuleID] = Seq(
    "uk.gov.hmrc" %% "bootstrap-test-play-28"     % bootStrapPlayVersion,
    "org.pegdown" %  "pegdown"                    % "1.6.0"
  ).map(_ % Test)
}
