package org.example

fun main() {
    val ordersCount = 75
    val gratitudeText = "Спасибо за покупку! Без вас мы не добились бы успеха!"

    println("Ваш заказ №$ordersCount")
    println(gratitudeText)

    var employeesCount = 2000
    //println("Количество работников: $employeesCount")

    employeesCount = employeesCount-1
    println("Количество работников: $employeesCount")
}