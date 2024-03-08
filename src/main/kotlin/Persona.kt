package org.example

abstract class Persona(val nombre:String, var arma:TipoArma, var vidas:Int ) {


    fun insultar(){
        println("*!€#*")
    }


    fun seguir_camino(){
        println("Sigues tu camino")
    }


}
