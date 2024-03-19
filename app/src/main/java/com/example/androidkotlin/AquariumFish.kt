package com.example.androidkotlin
// AquariumFish.kt
abstract class AquariumFish {
    abstract val color: String
}
class Plecostomus : AquariumFish() {
    override val color = "gold"
}
// AquariumFish.kt (lanjutan)
interface FishAction {
    fun eat()
}
class Shark : AquariumFish(), FishAction {
    override val color = "gray"
    override fun eat() {
        println("memburu dan memakan ikan")
    }
}