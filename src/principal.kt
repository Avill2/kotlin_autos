
fun main(args: Array<String>){
    modeloAuto.tipoAuto.add("sail")
    modeloAuto.tipoAuto.add("cruz")
    modeloAuto.tipoAuto.add("aveo")
    modeloAuto.tipoAuto.add("Luv")

    println("FINANCIAMIENTO DE UN AUTO")

    fun ivaDocePorciento(): Int {
        val numero=12
        val iva=numero/100;
        return iva
    }
     var financiamiento="fideicomiso"


    when (financiamiento){

        "fideicomiso" -> {
            println("Usted a escogido el plan fideicomiso")
            println("ingrese el valor del auto")
            var valorInicial =5000
            //println("ingrese el interes")
            var interes = 0.1608
            //println("ingrese el plazo en meses")
            var plazo = 48
            //val interesTotal=interes/100
            val total=((valorInicial*(interes))+(valorInicial*ivaDocePorciento())+valorInicial)
            println("el valor a pagar de su auto es $total")
            val cuotaMensual= total/plazo
            println("el valor mensual a pagar es $cuotaMensual")
            println("Su auto de marca "+modeloAuto.recuperarIndice(indice = 1 ) + ": La cuota ChevyPlan es $cuotaMensual y al final del plazo pagara $total" )
        }

        else ->{
            println("El plan que ha escogido es CHEVYPLAN")
            //println("ingrese el valor del auto")
            var valorInicial = 5000
            //println("ingrese el plazo en meses")
            var plazo = 48
            val totalChevi=(valorInicial*ivaDocePorciento()+valorInicial)
            println("el valor a pagar de su auto es $totalChevi")
            val cuotaChevy=totalChevi/plazo
            println("Su auto de marca "+modeloAuto.recuperarIndice(indice = 2 ) + ": La cuota ChevyPlan es $cuotaChevy y al final del plazo pagara $totalChevi" )

        }
    }
}
