package com.example.practica

class Empleado()
{
    var sueldo = 0
        get() = field
        set(value) {
            if(value<0){
                println("El Sueldo no puede ser Negativo")
            }else{
                field = value
            }
        }

    var nombre:String?=null
        get() = field
        set(value) {
            if(value == null){
                println("El nombre no puede ser nulo")
            }
            else if(value!!.isEmpty()) {
                println("El nombre debe de tener texto")
            }else{
                field = value
            }
        }
    var area:String?=null
        get() = field
        set(value) {
            if(value == null){
                println("El area no puede ser nula")
            }
            else if(value!!.isEmpty()) {
                println("El area debe de tener texto")
            }else{
                field = value
            }
        }

    var cargo:String?=null
        get() = field
        set(value) {
            if(value == null){
                println("El cargo no puede ser nulo")
            }
            else if(value!!.isEmpty()) {
                println("El cargo debe de tener texto")
            }else{
                field = value
            }
        }

    var tiempo:Int = 0
        get() = field
        set(value) {

                field = value
        }

    public fun verificacion(): Int {
        return (tiempo.div(5))
    }

    public fun Resultados(){
        if( nombre == null ||  cargo == null ||  area == null){
            println("Faltan campos por completar")
        }else{
            var sueldoextra = 25 * verificacion()
            var sueldototal = sueldo + sueldoextra
            println("Empleado: $nombre, area de trabajo: $area, cargo que ocupa: $cargo, sueldo base: $sueldo, tiempo trabajado: $tiempo, remuneracion por tiempo: $sueldoextra, sueldo final: $sueldototal")
        }
    }

}