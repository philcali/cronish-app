package com.github.philcali.cronish.dsl

import com.github.philcali.scalendar._

object Main {
  // Visual tests
  def main(args: Array[String]) {
    val tests = List(
      "every second",
      "every minute",
      "every hour at 0:00",
      "every midnight",
      "every midnight on Sunday",
      "every midnight on the 1st day in every month",
      "every midnight on the 1st day in January",
      "every midnight on Friday",
      "every midnight on every other Friday",
      "every midnight on the 3rd Friday in every month",
      "every day at 3:30 on Monday to Friday",
      "every midnight on the last day in every month",
      "every month at 2pm, 4pm, and 8pm on the 14th and 22nd days",
      "every midnight on the last Friday in every month",
      "every 30 minutes at midnight on the 4th day in July"
    ).map(_.cron).zipWithIndex.foreach { t =>
      val (test, run) = t

      val current = Scalendar.now
      val millis = test.nextFrom(current)
      println("%d: %s" format(run, current))
      println("%d: %s" format(run, Scalendar(current.time + millis)))
    }
  }
}