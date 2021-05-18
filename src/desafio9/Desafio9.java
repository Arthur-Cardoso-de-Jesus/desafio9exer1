/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio9;

import java.util.Scanner;

/**
 *
 * @author Arthur Cardoso de Jesus
 */
public class Desafio9 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int codAluno;
        double nota1, nota2, nota3, media;
        System.out.println("Insira o codigo do aluno!\n"
                + "Se o numero inserido for negativo o sistema fechará!");
        codAluno = ler.nextInt();
        while (codAluno > 0) {
            System.out.println("Insira a nota 1");
            nota1 = ler.nextDouble();
            System.out.println("Insira a nota 2");
            nota2 = ler.nextDouble();
            System.out.println("Insira a nota 3");
            nota3 = ler.nextDouble();

            if (nota1 > nota2 && nota1 > nota3) {
                media = (nota1 * 4 + nota2 * 3 + nota3 * 3) / 10;
                if (media < 5) {
                    System.out.println("Codigo do aluno" + codAluno
                            + "\n Nota 1:" + nota1
                            + "\n Nota 2:" + nota2
                            + "\n Nota 3:" + nota3
                            + "\n Media:"+media);
                    System.out.println("Reprovado");
                } else {
                    System.out.println("Codigo do aluno" + codAluno
                            + "\n Nota 1:" + nota1
                            + "\n Nota 2:" + nota2
                            + "\n Nota 3:" + nota3
                            + "\n Media:" + media);
                    System.out.println("APROVADO");
                }
            } else if (nota2 > nota1 && nota2 < nota3) {
                media = (nota1 * 3 + nota2 * 4 + nota3 * 3) / 10;
                if (media < 5) {
                    System.out.println("Codigo do aluno" + codAluno
                            + "\n Nota 1:" + nota1
                            + "\n Nota 2:" + nota2
                            + "\n Nota 3:" + nota3
                            + "\n Media:" + media);
                    System.out.println("REPROVADO");
                } else {

                    System.out.println("Codigo do aluno" + codAluno
                            + "\n Nota 1:" + nota1
                            + "\n Nota 2:" + nota2
                            + "\n Nota 3:" + nota3
                            + "\n Media:"+media);
                    System.out.println("APROVADO");
                }
            } else {
                media = (nota1 * 3 + nota2 * 3 + nota3 * 4) / 10;
                if (media < 5) {
                    System.out.println("Codigo do aluno" + codAluno
                            + "\n Nota 1:" + nota1
                            + "\n Nota 2:" + nota2
                            + "\n Nota 3:" + nota3
                            + "\n Media:"+media);
                    System.out.println("REPROVADO");
                } else {
                    System.out.println("Codigo do aluno" + codAluno
                            + "\n Nota 1:" + nota1
                            + "\n Nota 2:" + nota2
                            + "\n Nota 3:" + nota3
                            + "\n Media:"+media);
                    System.out.println("APROVADO");
                }
            }
         System.out.println("Insira o codigo do aluno!\n"
                + "Se o numero inserido for negativo o sistema fechará!");
        codAluno = ler.nextInt();   
        }
        System.out.println("Programa Finalizado!");
        
    }

}
