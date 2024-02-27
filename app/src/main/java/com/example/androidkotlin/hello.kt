package com.example.androidkotlin

data class Biodata(
    val nama: String,
    val jenisKelamin: String,
    val hobi: List<String>,
    val citaCita: String,
    val agama: String
)

fun main() {
    val adiWirawan = Biodata(
        nama = "Arya Dwipa Mukti",
        jenisKelamin = "Laki-laki",
        hobi = listOf("Membaca", "Belajar"),
        citaCita = "Menjadi Pengusaha Sukses",
        agama = "Islam"
    )

    println("Nama: ${adiWirawan.nama}")
    println("Jenis Kelamin: ${adiWirawan.jenisKelamin}")
    println("Hobi: ${adiWirawan.hobi.joinToString(", ")}")
    println("Cita-cita: ${adiWirawan.citaCita}")
    println("Agama: ${adiWirawan.agama}")
}