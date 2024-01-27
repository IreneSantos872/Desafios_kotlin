object ReceitaFederal {
  fun calcularImposto(salario: Double): Double {
  	val aliquota = when {
      (salario >= 0 && salario <= 1100) -> 0.05
      (salario >= 1100.01 && salario <= 2500) -> 0.10
      else -> 0.15
    }
  	return aliquota * salario
  }
}

fun main() {
  val valorSalario = 2000.00;
  val valorBeneficios = 250.00;
  
  val valorImposto = ReceitaFederal.calcularImposto(valorSalario);
  val saida = valorSalario - valorImposto + valorBeneficios;
  
  println(String.format("%.2f", saida));
}
