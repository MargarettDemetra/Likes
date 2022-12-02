fun main(){
    val likes = 30
    val lastCharacter = likes%10
    val one = "человеку"
    val count = "людям"

    val result = if(lastCharacter == 1) one else count
    println(result)
}