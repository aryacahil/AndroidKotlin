package com.example.androidkotlin

import java.util.*

fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun CatfishFood (day : String) : String {
    return when (day) {
        "Monday" -> "maggot"
        "Wednesday" -> "worms"
        "Thursday" -> "pellets"
        "Friday" -> "snail"
        "Sunday" -> "fish"
        else -> "nothing"
    }
}

fun feedTheCatfish() {
    val day = randomDay()
    val food = CatfishFood(day)
    println ("Today is $day and the Catfish eat $food")
}

fun main(args: Array<String>) {
    feedTheCatfish()
}
fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) || isDirty(dirty) || isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temperature: Int): Boolean {
    // Implement your logic to check if the temperature is too hot
    return temperature > 30
}

fun isDirty(dirty: Int): Boolean {
    // Implement your logic to check if the water is dirty
    return dirty > 25
}

fun isSunday(day: String): Boolean {
    // Implement your logic to check if it's Sunday
    return day.equals("Sunday", ignoreCase = true)
}
