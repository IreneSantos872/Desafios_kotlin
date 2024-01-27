fun main() {
    val media = 6.5;
    
    when {
        media < 5 -> println("Reprovado");
        media >= 5 && media < 7 -> println("Recuperação")
        media > 7 -> println("Aprovado")
   }
}
