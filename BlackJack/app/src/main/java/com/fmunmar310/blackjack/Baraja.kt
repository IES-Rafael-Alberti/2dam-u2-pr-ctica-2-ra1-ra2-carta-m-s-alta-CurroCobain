package com.fmunmar310.blackjack

class Baraja {
    companion object{
        val listaCartas : ArrayList<Carta> = arrayListOf()
        var tamaño = 0
        init {
            creaBaraja()
            barajar()
        }

        fun creaBaraja(){
            listaCartas.clear()
            for(i in Palos.values()){
                for(x in Naipes.values()){
                    val micarta = Carta(x,i,0,0,0)
                    listaCartas.add(micarta)
                }
            }
            tamaño = listaCartas.size
        }
        fun barajar(){
            listaCartas.shuffle()
        }
        fun cogerCarta():Carta?{
            if (listaCartas.size>0) {
                val cartaTemp = listaCartas.last()
                listaCartas.remove(cartaTemp)
                tamaño = listaCartas.size
                return cartaTemp
            }
            return null
        }
    }
}