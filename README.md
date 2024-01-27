# Desafios_kotlin
Desafios na linguagem Kotlin

1 - Explorando Mapas, Loops e Regras com Kotlin
  . Numeral Romano

    Desafio
    Os algarismos romanos são representados por sete símbolos diferentes: I, V, X, L, C, D e M. Cada um com seu respectivo valor: 
    
    I : 1 
    V : 5 
    X : 10 
    L : 50 
    C : 100 
    D : 500 
    M : 1000 
    
    Eles são geralmente escritos do maior para o menor. Porém, para escrevermos “4” não usamos “IIII”, mas sim “IV” porque 5 - 1 = 4.
    
    Entrada
      Você receberá uma entrada em numeral romano.
    
    Saída
      Você deverá imprimir o numeral romano convertido para um número inteiro. 
    

2 - MEDIA FINAL DO ALUNO

      Desafio
      Faça um programa que receba a média de um aluno e imprima o seguinte:
      
      Caso a média seja < 5 imprima "REP";
      Caso a média seja >= 5 e < 7 imprima "REC";
      Caso a média seja >7 imprima "APR".

3 - CALCULO SALARIAL 

      Desafio
      Faça um programa que calcule e imprima o salário a ser transferido para um funcionário. Para realizar o calculo, primeiro receba 
      o valor do salário bruto (valorSalario) e adicional dos benefícios (valorBeneficios). Por fim, o salário a ser transferido é 
      calculado da seguinte maneira: 
      
      (valorSalario - valorImpostos) + valorBeneficios
      
      Para calcular o valorImpostos, seguem as aliquotas (baseadas no valor do salário bruto):
      
          De R$ 0.00 a R$ 1100.00 = 5.00%
          De R$ 1100.01 a R$ 2500.00 = 10.00%
          Maior que R$ 2500.00 = 15.00%
      
      . Entrada
      A entrada consiste em vários arquivos de teste, que conterá o valor do salário bruto (valorSalario) e adicional dos benefícios 
      (valorBeneficios). Conforme mostrado no exemplo de entrada a seguir.
      
      . Saída
      Para cada conjunto de Entradas (valorSalario e valorBeneficios), deverá ser calculada uma Saída. Para isso, basta imprimir uma 
      linha com o resultado da seguinte fórmula:
      
      saida = (valorSalario - valorImpostos) + valorBeneficios
