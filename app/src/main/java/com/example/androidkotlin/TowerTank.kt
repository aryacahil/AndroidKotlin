package com.example.androidkotlin

import kotlin.math.PI

open class Aquarium(open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {
    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open val shape = "persegi panjang"

    open var water: Double = 0.0
        get() = volume * 0.9

    fun printSize() {
        println(shape)
        println("Lebar: $width cm " +
                "Panjang: $length cm " +
                "Tinggi: $height cm ")
        println("Volume: $volume liter Air: $water liter (${water / volume * 100.0}% terisi)")
    }
}

class TowerTank(override var height: Int, var diameter: Int) : Aquarium(height = height, width = diameter, length = diameter) {
    override var volume: Int
        get() = ((width / 2) * (length / 2) * height * PI / 1000).toInt()
        set(value) {
            height = ((value * 1000) / (PI * (width / 2) * (length / 2))).toInt()
        }

    override var water: Double = volume * 0.8

    override val shape = "silinder"
}

fun buildAquarium() {
    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun main() {
    buildAquarium()
}
