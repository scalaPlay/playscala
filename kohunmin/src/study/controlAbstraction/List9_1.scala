package study.controlAbstraction

object List9_1 {
  private def filesHere = (new java.io.File(".")).listFiles
  
  private def filesMatching(matcher: String => Boolean) = 
    for (file <- filesHere; if matcher(file.getName))
      yield file
    def fileEnding(query: String) =
      filesMatching(_.endsWith(query))
    def filesContaining(query: String) =
      filesMatching(_.contains(query))
    def filesRegex(query: String) = 
      filesMatching(_.matches(query))
      
  def main(args: Array[String]): Unit = {
    List9_1.fileEnding("Exercise")
  }
}