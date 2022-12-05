fun main(){
    val likes = 21
    val lastNumber = likes%10
    val twoLastNumber = likes%100
    val one = "человеку"
    val count = "людям"

    val result = if( twoLastNumber == 11) count else if(lastNumber == 1) one else count
    println("Понравилось $likes $result")
}