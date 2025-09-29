/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade._05_rogerio_natalia;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Atividade_05_rogerio_natalia {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //1
//       Scanner entrada = new Scanner(System.in);
//       
//       int n,i;
//       i = 0;
//       
//       System.out.print("digite o valor de N");
//       n = entrada.nextInt();
//       
//       while (i <= n){
//       System.out.println(i);
//       ++i;
//       }
       //2
//       Scanner entrada = new Scanner(System.in);
//       
//       int n,i;
//       n = 0;
//       i = 0;
//       while (n != -1){
//      System.out.print("digite o valor de N");
//      n = entrada.nextInt();
//      i = i + n ;
//      System.out.println(i);
//      }
       
        //3
//        Scanner entrada = new Scanner(System.in);
//        
//        String senha = "";
//        
//        while (!senha.equals("senai123")){
//            System.out.println("digite a senha:");
//            senha = entrada.nextLine();
//        }
//        if (senha.equals("senha123")){
//            System.out.println("senha correta");
//        }
// 
              
        //4
//          Scanner entrada = new Scanner(System.in);
//          
//          double num1,num2, total;
//          int opcao;
//          opcao = -1;
//          
//          while (opcao != 0){
//          System.out.println("digite uma opçao de 1- somar  2- subtair  3- multiplicar  0- sair");
//          opcao = entrada.nextInt();
//          }
//          switch (opcao){
//              
//              case 1 -> {
//                  System.out.println("digite o num1");
//                  num1 = entrada.nextDouble();
//                  System.out.println("digite o num2");
//                  num2 = entrada.nextDouble();
//                  
//                  total = num1+ num2;
//                  System.out.println("a soma dos valores =" + total);
//            }
//              
//              
//              case 2 -> {
//                  System.out.println("digite o num1");
//                  num1 = entrada.nextDouble();
//                  System.out.println("digite o num2");
//                  num2 = entrada.nextDouble();
//                  
//                  total = num1 - num2;
//                  System.out.println("a subtracao =" + total);
//            }
//              
//              case 3 -> {
//                  System.out.println("digite o num1");
//                  num1 = entrada.nextDouble();
//                  System.out.println("digite o num2");
//                  num2 = entrada.nextDouble();
//                  
//                  total = num1+ num2;
//                  System.out.println("a multiplcacao =" + total);
//            }
//              
//              case 0 -> System.out.println("Saindo...");
//              
//              default -> System.out.println("opcao invalida. Tente novamente");
//          }
//          
             //5
             
//             Scanner entrada = new Scanner(System.in);
//             
//             int n, i;
//             long fatorial ;
//             
//             System.out.println("digite o valor de n");
//             n = entrada.nextInt();
//             
//             if (n < 0){
//                 System.out.println("numero invalido");
//                 
//             
//             }else{
//                 fatorial = 1;
//                 i = 1;
//             
//             while (i <= n){
//                 fatorial *= i;
//                 i++;
//                 
//             }
//             System.out.println("o valor fatorial de "+n+" = "+ fatorial);
//    
//    }
//    

                // 6 
//                int n, v1, v2, proximo;
//                
//                Scanner entrada = new Scanner(System.in);
//                
//                v1=0;
//                v2=1;
//                proximo = v1 + v2;
//                System.out.println("digite o valor de n");
//                n = entrada.nextInt();
//                
//                while (v1<=n){ 
//                    
//                    System.out.println(""+v1);
//                    v1 = v2;
//                    v2 = proximo;
//                    proximo = v1+v2;
//                }
//                
                

                //7

//        Scanner entrada = new Scanner(System.in);
//        int n, i;
//        boolean ehPrimo;
//        
//        entrada = new Scanner(System.in);
//        System.out.print("Digite um número inteiro n (n ≥ 2): ");
//        n = entrada.nextInt();
//
//        i = 2;
//        ehPrimo = true;
//
//        while (i <= Math.sqrt(n)) {
//            if (n % i == 0) {
//                ehPrimo = false;
//                break;
//            }
//            i++;
//        }
//
//        if (ehPrimo) {
//            System.out.println(n + " é primo.");
//        } else {
//            System.out.println(n + " não é primo.");
//        }



            //8
//            Scanner entrada = new Scanner(System.in);
//             int numero;
//        int soma;
//
//        entrada = new Scanner(System.in);
//        soma = 0;
//
//        System.out.println("Digite números inteiros (encerra com número negativo):");
//
//        numero = entrada.nextInt();
//
//        while (numero >= 0) {
//            soma += numero;
//            numero = entrada.nextInt();
//        }
//
//        System.out.println("Soma dos números digitados: " + soma);
//

//    

        //9
//        Scanner entrada = new Scanner(System.in);
//        int n, numero, digito;
//        int soma, contador, reverso;
//
//        entrada = new Scanner(System.in);
//        System.out.print("Digite um número inteiro (pode ser negativo): ");
//        n = entrada.nextInt();
//
//        numero = Math.abs(n);  // para lidar com negativos
//        soma = 0;
//        contador = 0;
//        reverso = 0;
//
//        if (numero == 0) {
//            contador = 1;
//        }
//
//        while (numero > 0) {
//            digito = numero % 10;
//            soma += digito;
//            reverso = reverso * 10 + digito;
//            numero /= 10;
//            contador++;
//        }
//
//        System.out.println("Número de dígitos: " + contador);
//        System.out.println("Soma dos dígitos: " + soma);
//        System.out.println("Número invertido: " + (n < 0 ? -reverso : reverso));

        // 10
        
//        Scanner entrada = new Scanner(System.in);
//         int n;
//
//        entrada = new Scanner(System.in);
//        System.out.print("Digite um número inteiro maior que 0: ");
//        n = entrada.nextInt();
//
//        if (n <= 0) {
//            System.out.println("Número inválido.");
//        } else {
//            System.out.println("Sequência de Collatz:");
//            while (n != 1) {
//                System.out.print(n + " -> ");
//                if (n % 2 == 0) {
//                    n = n / 2;
//                } else {
//                    n = 3 * n + 1;
//                }
//            }
//            System.out.println("1");
//        }
    }
}

                

