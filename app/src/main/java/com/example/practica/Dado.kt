package com.example.practica

class Dado {

    var valor:Int? = null
        get() = field
        set(value) {
            if (value != null) {
                if(value <= 0 || value >= 7){
                    field = 1
                }else{
                    field = value
                }
            }
        }

    fun LanzarDado(){
        if(valor == null){
            var valoraleatorio = (1..6).random()
            println("El valor del dado es $valoraleatorio")
        }else{
            println("El valor del dado es $valor")
        }
    }
}