package mains;

import java.util.*;

import models.Sphere;
import models.Torus;

public class KalkulatorPabrik {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("Ahmad Muflih Azhari");
        System.out.println("245150701111030");
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");

        System.out.print("Isikan Radius\t: ");
        double majorRadiusTorus = scanner.nextDouble();
        System.out.print("Isikan radius\t: ");
        double minorRadiusTorus = scanner.nextDouble();
        System.out.println("=============================================");

        Torus torus = new Torus(majorRadiusTorus, minorRadiusTorus);
        torus.printInfo();

        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius\t: ");
        double radiusSphere = scanner.nextDouble();
        System.out.println("=============================================");

        Sphere sphere = new Sphere(radiusSphere);
        sphere.printInfo();
        System.out.println("=============================================");
    }
}