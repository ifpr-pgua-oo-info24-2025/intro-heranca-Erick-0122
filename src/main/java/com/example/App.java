
package com.example;

import com.example.models.*;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    Moto[] moto = new Moto[100];
    Carro[] carro = new Carro[100];
    Scanner scan = new Scanner(System.in);
    int op = 1, estacx = 0, estacy = 0;
    
    while(op != 0){
      
      System.out.println("\nO que gostaria de fazer ?");
      System.out.println("1)Adicionar Carro\n2)Adicionar Moto\n3)Exibir Veículos\n0)Sair");
      op = scan.nextInt();
      
      switch(op){

        case 1:

          String marca;
          String modelo;
          int ano, nportas;

          carro[estacx] = new Carro ("a", "b", 0 , 0);

          System.out.println("Qual a marca ?");
          marca = scan.nextLine();
          scan.nextLine();
          carro[estacx].setMarca(marca);

          System.out.println("Qual o modelo ?");
          modelo = scan.nextLine();
          carro[estacx].setModelo(modelo);

          System.out.println("Qual o ano do carro ?");
          ano = scan.nextInt();
          scan.nextLine();
          carro[estacx].setAno(ano);

          System.out.println("Quantas portas ?");
          nportas = scan.nextInt();
          scan.nextLine();
          carro[estacx].setNportas(nportas);

          estacx++;

        break;

        case 2:

          String tipoguidao;
          moto[estacy] = new Moto("a", "b", 0, "vrum");
          System.out.println("Qual a marca ?");
          marca = scan.nextLine();
          scan.nextLine();
          moto[estacy].setMarca(marca);

          System.out.println("Qual o modelo ?");
          modelo = scan.nextLine();
          moto[estacy].setModelo(modelo);

          System.out.println("Qual o ano da moto ?");
          ano = scan.nextInt();
          scan.nextLine();
          moto[estacy].setAno(ano);

          System.out.println("Qual o tipo de guidao ?");
          tipoguidao = scan.nextLine();
          moto[estacy].setTipoguidao(tipoguidao);

          estacy++;

        break;

        case 3:
          String frase;
          System.out.println("Carros :");

          for(int i = 0; i < estacx; i++){
             carro[i].exibirDetalhe();
          }

          System.out.println("Motos :");

          for(int i = 0; i < estacy; i++){
             moto[i].exibirDetalhe();
          }

        break;

      }

    }    

    scan.close();

  }
}
