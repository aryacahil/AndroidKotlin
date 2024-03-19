package com.example.androidkotlin
fun main(){
    buildAquariumInMain()
}

fun buildAquariumInMain() {
    val myAquarium = Aquariumm()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
}