class modeloAuto{
    companion object {
        val tipoAuto: ArrayList<String> = ArrayList()
        fun recuperarIndice(indice:Int): String? {
            for (indiceArreglo in tipoAuto.indices){
                if (indiceArreglo==indice){
                    return tipoAuto[indiceArreglo]
                }
            }
            return null
        }
    }
}
