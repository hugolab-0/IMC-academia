package br.senai.sp.jandira.ds1m.calculoImc;

import java.util.Scanner;

public class Calculadora {
    Scanner sc = new Scanner(System.in);
    String nome;
    double peso;
    double altura;
    double imc;

    //coletando informações do usuario
    public void obterDados(){
        System.out.print("Qual é o seu nome?");
       nome = sc.nextLine();

        System.out.println("Quanto você peso?");
        peso = sc.nextDouble();

        System.out.println("Qual é a sua altura?");
       altura = sc.nextDouble();

        calcularDados();
    }
    public void calcularDados(){
        imc = peso / (altura * altura);

        exibirDados();
    }
    public void exibirDados(){
        System.out.println("**RESULTADO**");
        System.out.println("____________________________________________");

        String imcFormatado = String.format("%.2f", imc);

        if (imc >= 18.5 && imc < 25.0) {
            System.out.println(nome + " seu imc é de: " + imcFormatado + " você está saudável");
        }
        else if(imc >= 25.0 && imc < 30.0){
            System.out.println(nome + " seu imc é de: " + imcFormatado + " você está levemente acima do peso");
        }
        else if(imc >= 30.0 && imc < 35.0){
            System.out.println(nome + " seu imc é de: " + imcFormatado + " você está com obesidade nível I");
        }
        else if(imc >= 35.0 && imc < 40.0){
            System.out.println(nome + " seu imc é de: " + imcFormatado + " você está com obesidade nível II (severa)");
        }
        else if (imc > 40.0){
            System.out.println(nome + " seu imc é de: " + imcFormatado + " você está com obesidade nível III (Mórbida)");
        }


        System.out.println("____________________________________________________________________");
        }
}