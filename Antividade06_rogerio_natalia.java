/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package antividade06_rogerio_natalia;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Antividade06_rogerio_natalia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
        //1
        
//double nota;
//
//        do {
//            System.out.println("Digite a nota:");
//            nota = entrada.nextDouble();
//
//            if (nota < 0) {
//                System.out.println("Nota inválida ");
//            } else if (nota >= 10) {
//                System.out.println("Nota válida: " + nota);
//                break; 
//            }
//        } while (nota < 0 || nota >= 10); 


        //2
    
//        double media;
//        int num , soma = 0, contador = 0;
//        Scanner input = new Scanner(System.in);
//        
//        do{
//            System.out.print("digite u numero inteiro: ");
//            num = input.nextInt();
//            soma += num;
//            contador ++;
//        }while(num!=0);
//        
//        System.out.print("soma: "+soma);
//        System.out.print("quantidade: "+contador);
//        media = soma/contador;
//        System.out.print("media: "+media);
//        

        //3
         
//        int contador = 0;
//        int num;
//        boolean acertou = false;
//
//        
//        int numA = (int) (Math.random()*100);
//
//        System.out.println("Tente adivinhar um numero entre 0 e 100");
//
//        do {
//            System.out.print("Digite um numero: ");
//            num = entrada.nextInt();
//            contador++;
//
//            if (num > numA) {
//                System.out.println("Muito alto");
//            } else if (num < numA) {
//                System.out.println("Muito baixo");
//            } else {
//                System.out.println("Número correto!");
//                acertou = true;
//                break;
//            }
//        } while (contador < 3);
//
//        if (!acertou) {
//            System.out.println("Voce perdeu! O numero era: " + numA);
//        }
//        
        
       //4 
//               Scanner en = new Scanner(System.in);
//        int n;
//        String op;
//
//        do {
//            do {
//                System.out.print("Digite um numero inteiro positivo: ");
//                n = en.nextInt();
//                if (n <= 0) {
//                    System.out.println("Número invalido");
//                }
//            } while (n <= 0);
//
//            for (int i = 0; i < n; i++) {
//                System.out.println(n - i);
//            }
//
//            System.out.print("Digite 's' para repetir ou 'N' para sair: ");
//            op = en.nextLine();
//            en.nextLine();
//        } while (op.equalsIgnoreCase("s"));

        //5
            //final String SENHA_CORRETA = "senai123"; 
       
//
//        int tentativasRestantes = 3;
//        boolean acessoConcedido = false;
//        String senhaDigitada;
//
//        do {
//            System.out.print("Senha: ");
//            senhaDigitada = entrada.nextLine();
//
//            if (senhaDigitada.equals(SENHA_CORRETA)) {
//                acessoConcedido = true;
//                System.out.println("Acesso concedido.");
//            } else {
//                tentativasRestantes--;
//                if (tentativasRestantes > 0) {
//                    System.out.println("Incorreta. Tentativas restantes: " + tentativasRestantes);
//                }
//            }
//
//        } while (!acessoConcedido && tentativasRestantes > 0);
//
//        if (!acessoConcedido) {
//            System.out.println("Conta bloqueada.");
//        }
//
//        entrada.close();
//    }
//}
//    
        //6
//        int numero,resultado;
//        
//        System.out.println("digite o numero");
//        numero = entrada.nextInt();
//        for (int i=1; i <=10;i++){
//        resultado = numero * i;
//            System.out.println(numero +"x"+i+"="+resultado);
//        }
//    }
//}
        //7
//        int n;
//        
//        
//        System.out.println("digite um numero inteiro:");
//        n = entrada.nextInt();
//        
//        int somapar = 0;
//        int somaimpar = 0;
//        for(int i =1; i <= n;i++){
//            if (i % 2 == 0){
//                somapar = somapar + i;
//                
//            }
//            else{
//                somaimpar = somaimpar+i;
//            }
//        }
//            System.out.println("soam dos pares = "+somapar);
//            System.out.println("soma dos impares ="+somaimpar);
//       

//    int n;
//    boolean primo = true;
//        System.out.println("digite um numero inteiro:");
//        n = entrada.nextInt();
//        
//        for(int x = 2;x<=n;x++){
//            for (int i = 2;i<x;i++)
//           if (x % i ==0){
//                primo = false;
//                break;
//                
//            }
//        if (primo){
//            System.out.println(""+x);
//        }
//        
//        }
//        }
//}