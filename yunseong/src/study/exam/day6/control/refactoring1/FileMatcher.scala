package study.exam.day6.control.refactoring1

/**
 * @author Yunseong
 */
object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles
  
  def filesEnding(query: String) {
    for (file <- filesHere; if file.getName.endsWith(query)) 
      yield file
  }
  
  def filesContaining(query: String) = {
    for (file <- filesHere; if file.getName.contains(query))
      yield file
  }
  
  def filesRegex(query: String) {
    for (file <- filesHere; if file.getName.matches(query))
      yield file
  }
  
  private def filesMatching(query: String, matcher: (String, String) => Boolean) = {
    for(file <- filesHere; if matcher(file.getName, query))
      yield file
  }
}