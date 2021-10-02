package com.example.practica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Ejercicio1("Laura", 20.0, 8, 4)
        Ejercicio2(2 , 10)

        var empleado = Empleado()
        empleado.sueldo = 200
        empleado.nombre = "Rodrigo"
        empleado.tiempo = 18
        empleado.cargo = "Gerente"
        empleado.area = "Administracion"
        empleado.Resultados()

        println("Dado con valor asignado:")
        var dado = Dado()
        dado.valor = 3
        dado.LanzarDado()

        println("Dado aleatorio:")
        var dadorandom = Dado()
        dadorandom.LanzarDado()
    }

    fun Ejercicio1(nombre:String, pagohora:Double, horas:Int, horaex: Int){
        println("El Nombre del Operario es: $nombre")
        var pagohoras = (pagohora*horas)
        var pagohoraex = ((pagohora*2)*horaex)
        var pagototal = pagohoras + pagohoraex
        println("El Pago Total seria: $pagototal, $pagohoras por $horas horas normales y $pagohoraex por $horaex horas extras")
    }

    fun Ejercicio2(Tabla:Int, Limite:Int? = null){
        var Final = 10
    if (Limite != null) {
        Final = Limite
        }
        for (num in 1..Final) {
            var resultado = num*Tabla
            println("$Tabla X $num = $resultado")
    }
    }
}