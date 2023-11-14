package com.fmunmar310.blackjack

/**
 * Clase baraja
 * @property listaCartas lista de cartas de la baraja
 * @property tamaño indica la cantidad de cartas de la baraja
 * @see Carta
 */
class Baraja {
    companion object{
        val listaCartas : ArrayList<Carta> = arrayListOf()
        var tamaño = 0
        init {
            creaBaraja()
            barajar()
        }

        /**
         * Crea la baraja de cartas desde las clases Naipes y Palos
         * @see Naipes
         * @see Palos
         */
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

        /**
         * Baraja las cartas
         */
        fun barajar(){
            listaCartas.shuffle()
        }
        /**
         * Saca una carta de la baraja
         * @return devuleve una carta de la baraja
         */
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