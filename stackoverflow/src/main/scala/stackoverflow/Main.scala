package stackoverflow

import stackoverflow.StackOverflow.{groupedPostings, rawPostings, sc, scoredPostings}

object Main extends App {
  val lines   = sc.textFile("src/main/resources/stackoverflow/stackoverflow.csv")
  val raw     = rawPostings(lines)
  val grouped = groupedPostings(raw)
  val scored  = scoredPostings(grouped)
  /* scored.take(num = 5).foreach(println) */
}
