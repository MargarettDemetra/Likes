fun main(){
   // val likes = 21
   // val lastNumber = likes%10
    //val twoLastNumber = likes%100
    //val one = "человеку"
    //val count = "людям"

    //val result = if( twoLastNumber == 11) count else if(lastNumber == 1) one else count
    //println("Понравилось $likes $result")


    val second = 2531
    val minute = second/60
    val hour = minute/60

    val lustMinute = minute%10

    val minuteOne = "минуту"
    val minutes = "минут"
    val otherMinute = "минуты"

    val hourOne = "час"
    val hours = "часа"
    val otherHour = "часов"

    val totalX = when(lustMinute){
        1 -> minuteOne
        2 -> otherMinute
        else ->minutes
    }

    val totalMinute = when(minute){
        1 -> minuteOne
        in 2 .. 4 -> otherMinute
        in 5 .. 20 -> minutes
        else -> totalX
    }

    val totalHour = when(hour){
        1 -> hourOne
        in 2 .. 4 -> hours
        in 5 .. 20 -> otherHour
        21 -> hourOne
        else -> hours
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