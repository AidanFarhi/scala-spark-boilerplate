object App extends SparkSessionWrapper {
  def main(args: Array[String]): Unit = {
    val logFile = "/Users/aidanfarhi/Software/spark-3.3.2-bin-hadoop3/README.md"
    val logData = spark.read.textFile(logFile).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    println(s"Lines with a: $numAs")
    spark.stop()
  }
}