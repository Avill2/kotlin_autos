

fun main(args: Array<String>){
    println("FINANCIAMIENTO DE UN AUTO")

    fun ivaDocePorciento(){
        val numero=12
        val iva=numero/100;
    }
     var financiamiento="fideicomiso"

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

    modeloAuto.tipoAuto.add("Chevrolet SAIL")
    modeloAuto.tipoAuto.add("Chevrolet Luv")

    when (financiamiento){

        "fideicomiso" -> {
            println("Usted a escogido el plan fideicomiso")
            println("ingrese el valor del auto")
            var valorInicial = readLine()?.toInt()
            println("ingrese el interes")
            var interes = readLine()?.toInt()
            println("ingrese el plazo en meses")
            var plazo = readLine()?.toInt()
            val interesTotal=interes/100
            val total=((valorInicial*(interesTotal))+(valorInicial*ivaDocePorciento())+valorInicial)
            println("el valor a pagar de su auto es $total")
            val cuotaMensual= total/plazo
            println("el valor mensual a pagar es $cuotaMensual")
        }

        else ->{
            println("El plan que ha escogido es CHEVYPLAN")
            println("ingrese el valor del auto")
            var valorInicial = readLine()?.toInt()
            println("ingrese el plazo en meses")
            var plazo = readLine()?.toInt()
            val totalChevi=(valorInicial*ivaDocePorciento()+valorInicial)
            println("el valor a pagar de su auto es $totalChevi")
            val cuotaChevy=totalChevi/plazo
            println("La cuota ChevyPlan es $cuotaChevy y al final del pazo pagara $totalChevi" )


        }
    }
}
