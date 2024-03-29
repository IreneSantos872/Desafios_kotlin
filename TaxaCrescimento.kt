data class Pais(var habitantes: Double, val taxaCrescimento: Double) {
    fun crescerPopulacaoAnual() { 
      habitantes = habitantes + (habitantes * (taxaCrescimento/100))
    }
}

fun main() {
   val habitantesPaisA = 50000.0;
   val habitantesPaisB = 80000.0;
   val paisA = Pais(habitantesPaisA, taxaCrescimento = 3.0)
   val paisB = Pais(habitantesPaisB, taxaCrescimento = 1.5)
   
   var quantidadeAnos = 0
   while (paisA.habitantes < paisB.habitantes) {
    paisA.crescerPopulacaoAnual()
    paisB.crescerPopulacaoAnual()
    quantidadeAnos ++
   }
   
   println("$quantidadeAnos anos")
}
