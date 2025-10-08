package main.java;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double massa, volume, densidade, altura;
        
        //Biblioteca para entrada de dados
        Scanner ler = new Scanner(System.in);

        System.out.println("=== CRIAÇÃO DO OBJETO CORPO HUMANO ===");

        System.out.println("Digite a massa inicial (kg):");
        massa = ler.nextDouble();

        System.out.println("Digite o volume inicial (m³):");
        volume = ler.nextDouble();

        System.out.println("Digite a densidade inicial (kg/m³):");
        densidade = ler.nextDouble();

        System.out.println("Digite a altura inicial (m):");
        altura = ler.nextDouble();

        
        CorpoHumano c1 = new CorpoHumano(massa, volume, densidade, altura);
        System.out.println("=== VALORES INICIAIS ===");
        System.out.printf("Massa: %.2f kg /n", c1.getMassa());
        
        System.out.printf("Volume: %.2f m³ /n", c1.getVolume());
        System.out.printf("Densidade: %.2f kg/m³ /n", c1.getDensidade());
        System.out.printf("Altura: %.2f m /n", c1.getAltura());
        
        System.out.println("IMC:" + c1.imc());


        System.out.println("Digite uma nova massa (kg):");
        massa = ler.nextDouble();
        c1.setMassa(massa);

        System.out.println("Digite uma nova altura (m):");
        altura = ler.nextDouble();
        c1.setAltura(altura);

        System.out.println("Novos valores: ");

        System.out.printf("Massa: %.2f kg /n", c1.getMassa());
        System.out.printf("Altura: %.1f m /n", c1.getAltura());

        System.out.println("Novo IMC: " + c1.imc());

        
        ler.close();
    }
}
