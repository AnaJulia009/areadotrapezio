import java.util.Scanner;

//instrução1 Perguntar a Base Maior
//instrução2 Guardar o valor da Base Maior
//instrução3 Perguntar a Base Menor
//instrução4 Guardar o valor da Base Menor
//instrução5 Perguntar a Altura
//instrução6 Guardar a Altura
//instrução7 Calcular a Àrea do Triângulo
//instrução8 Somar Base Maior + Base Menor
//instrução9 Dividir a Soma das Bases por 2 
//instrução10 Multiplica o valor da Divisão pela Altura
//instrução11 Printar para o usuário o resultado
//...

class Area{
  
	public static void main(String args[]){  
   
    		Scanner teclado = new Scanner(System.in);
    
    		Double BaseMaior;
			Double BaseMenor;
			Double Altura;
			Double Soma;
			Double Divisao;
			Double Resultado;


            System.out.printf("Digite o valor da BaseMaior"); 
            BaseMaior = teclado.nextDouble();
    
	
    		System.out.printf("Digite o valor da BaseMenor");
			BaseMenor = teclado.nextDouble();
    
	
            System.out.printf("Digite o valor da Altura"); 
			Altura = teclado.nextDouble();
			
			
			Soma = BaseMaior + BaseMenor;
			
			
			Divisao = Soma / 2 ;
			
			
			Resultado = Divisao * Altura;
			
			
			System.out.printf("O Resultado da area  do tarpezio com a Divisao e:%f\n",Resultado); 
    
	
	
    		System.exit(0);
		
	}

}
