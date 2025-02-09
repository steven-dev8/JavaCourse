package Lessons;

public class Aula02 {
    public static void main(String[] args) {
        // Existem 8 tipos primitivos em Java
        // int, float, boolean, char, long, double, byte, short
        // Para iniciar uma variável, colocamos o tipo dela no início
        int age = 19;
        long longNumber = 200000000;
        double wageDouble = 9000;
        float wageFloat = 9500;
        // Valores bytes recebem um número entre -128 até 127
        byte valueByte = 127;
        short ageShort = 10;
        boolean vdd = true;
        boolean falso = false;
        char caracter = 65;

        System.out.println("Eu tenho " + age + " anos de idade");
        System.out.println("Número longo: " + longNumber);
        System.out.println("Salário double: " + wageDouble);
        System.out.println("Salário float: " + wageFloat);
        System.out.println("Valor byte: " + valueByte);
        System.out.println("Idade short: " + ageShort);
        System.out.println("Verdadeiro: " + vdd);
        System.out.println("Falso: " + falso);
        System.out.println("Caractere: " + caracter);
    }
}
