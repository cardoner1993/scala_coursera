

package wikipedia

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._

import org.apache.spark.rdd.RDD

object Main extends App {
  val rddwiki: RDD[WikipediaArticle] = WikipediaRanking.wikiRdd
  val times_hasscala: Int = WikipediaRanking.occurrencesOfLang("Scala", rddwiki)
  println(times_hasscala) /* times having scala */
  val rank_lang: List[(String, Int)] = WikipediaRanking.rankLangs(List("Scala", "Python"), rddwiki)
  println(rank_lang)
}

