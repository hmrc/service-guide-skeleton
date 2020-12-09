/*
 * Copyright 2020 HM Revenue & Customs
 *
 */

package test

import org.scalatest.{Matchers, WordSpec}
import sys.process._

class BuildSpec extends WordSpec with Matchers {
  "Building the content" should {
    "produce static files" in {
      val result = "bundle install" #&& Process("bundle exec middleman build --build-dir=public/ --clean", None, "BASE_PATH" -> "/guides/telephony-service-guide/") !

      result shouldBe 0
    }
  }
}
