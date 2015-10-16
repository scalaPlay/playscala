
import java.util.Scanner

val answer = ( Math.random() * 100 ) + 1
println("Answer : " + answer)

val count = 0

do {

    count = count+1
    
    println("1과 100사이의 값을 입력하세요")
    val input = new java.util.Scanner(System.in)
    

    if(answer > input){
        println("UP")
    }else if(answer < input){
        println("Down")
    }else{
        println("Good")
    }



}while (true)

