
import java.util.Scanner


object JavaToScala_8_8 {

    def main(args: Array[String]) : Unit = {

        var answer: Int = ( Math.random() * 100 ).toInt + 1
        println("Answer : " + answer)

        var count = 0

        do {

            count = count+1
    
            println("1과 100사이의 값을 입력하세요")
            try{

                var scanner: Scanner = new java.util.Scanner(System.in)
                var input: Int = scanner.nextInt()

                 if(answer > input){
                    println("UP")
                }else if(answer < input){
                    println("Down")
                }else{
                    println("Good")
                }

            } catch {
            
                case ex: java.util.InputMismatchException => println("catch the inout mismatching")
            
            }

           }while (true)
    }
}
