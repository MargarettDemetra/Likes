fun main(){
   // val likes = 21
   // val lastNumber = likes%10
    //val twoLastNumber = likes%100
    //val one = "человеку"
    //val count = "людям"

    //val result = if( twoLastNumber == 11) count else if(lastNumber == 1) one else count
    //println("Понравилось $likes $result")


    val second = 43923
    val minute = second/60
    val hour = minute/60

    val lastMinute = minute%10

    val totalX = when(lastMinute){
        1 -> "минуту"
        2 -> "минуты"
        else -> "минут"
    }

    val totalMinute = when(minute){
        1 -> "минуту"
        in 2 .. 4 -> "минуты"
        in 5 .. 20 -> "минут"
        else -> totalX
    }

    val totalHour = when(hour){
        1 -> "час"
        in 2 .. 4 -> "часа"
        in 5 .. 20 -> "часов"
        21 -> "час"
        else -> "часа"
    }

    val agoToText = when(second) {
        in 0 .. 60-> println("Был только что")
        in 61 .. 60*60 -> println("Был в сети $minute $totalMinute назад")
        in 60*60 .. 24*60*60 -> println("Был в сети $hour $totalHour назад")
        in 86401 .. 172800 -> println("Был в сети вчера")
        in 172801 .. 259201 -> println("Был в сети позавчера")
        else -> println("Был в сети давно")
    }
}