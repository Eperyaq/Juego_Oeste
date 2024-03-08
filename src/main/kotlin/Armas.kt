package org.example

abstract  class Armas(var arma: TipoArma, val tipomunicion:String, var cantidadMunicion:Int = 10 ) {
    fun disparar(jugador:Jugador){
        println("Disparas tu $arma e inflinges ")
        cantidadMunicion--
    }


    private fun dañoArmas(){
        var daño = 0
        if (arma == TipoArma.EscopetaLargaDistancia){
            daño = 4
        }else if (arma == TipoArma.Revolver){
            daño = 2
        }else if (arma == TipoArma.Escopeta){
            daño = 2
        }else if (arma == TipoArma.Cuchillo){
            daño = 1
        }
    }


}
