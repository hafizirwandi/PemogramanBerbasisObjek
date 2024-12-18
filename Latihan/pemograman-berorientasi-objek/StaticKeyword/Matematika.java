package StaticKeyword;

import java.lang.Math;

public class Matematika {
    public static void main(String[] args) {
        // Menghitung luas lingkaran
        double radius = 5;
        double luasLingkaran = Math.PI * Math.pow(radius, 2);
        System.out.println("Luas lingkaran dengan jari-jari " + radius + " adalah: " + luasLingkaran);

        // Menghitung volume bola
        double volumeBola = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume bola dengan jari-jari " + radius + " adalah: " + volumeBola);

        // Mencari nilai maksimum dan minimum dari dua bilangan
        int bilangan1 = 10, bilangan2 = 25;
        int max = Math.max(bilangan1, bilangan2);
        int min = Math.min(bilangan1, bilangan2);
        System.out.println("Nilai maksimum dari " + bilangan1 + " dan " + bilangan2 + " adalah: " + max);
        System.out.println("Nilai minimum dari " + bilangan1 + " dan " + bilangan2 + " adalah: " + min);

        // Membulatkan ke atas dan ke bawah
        double bilanganDesimal = 3.14;
        double ceil = Math.ceil(bilanganDesimal);
        double floor = Math.floor(bilanganDesimal);
        System.out.println("Pembulatan ke atas dari " + bilanganDesimal + " adalah: " + ceil);
        System.out.println("Pembulatan ke bawah dari " + bilanganDesimal + " adalah: " + floor);

        // Menghitung akar kuadrat
        double akar = Math.sqrt(25);
        System.out.println("Akar kuadrat dari 25 adalah: " + akar);

        // Menghitung sin, cos, dan tan
        double sudut = Math.toRadians(45); // Mengubah derajat ke radian
        double sin = Math.sin(sudut);
        double cos = Math.cos(sudut);
        double tan = Math.tan(sudut);
        System.out.println("Sin dari 45 derajat adalah: " + sin);
        System.out.println("Cos dari 45 derajat adalah: " + cos);
        System.out.println("Tan dari 45 derajat adalah: " + tan);

        // Menghitung bilangan acak antara 0.0 (inklu  sif) dan 1.0 (eksklusif)
        double bilanganAcak = Math.random();
        System.out.println("Bilangan acak: " + bilanganAcak);
    }
}