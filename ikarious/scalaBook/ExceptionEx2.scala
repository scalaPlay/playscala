import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

println("Exception Examples Section 7.5")
    var file: FileReader = null
try {
    file = new FileReader("input.txt")
    //User and close file
    } catch {
        case ex: FileNotFoundException => //Handle missing file
        case ex: IOException => //Handle other I/O error
    } finally {
        file.close() // Be sure to close the file
    }
