package org.example

fun main() {
    fun timeOnClock(number: Int): Any {
    return if (number in 1..9) {
        "0$number"
    } else {
        number.toString()
    }
}
    val secondsInSpace = 6489
    val minutesInSpace = secondsInSpace/60
    val hoursInSpace = minutesInSpace/60
    val secondsReminder = secondsInSpace % 60
    val minutesReminder = minutesInSpace % 60

    println("${timeOnClock(hoursInSpace)}:${timeOnClock(minutesReminder)}:${timeOnClock(secondsReminder)}")

}
