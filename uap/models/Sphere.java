package models;

import bases.Shape;
import interfaces.*;

public class Sphere extends Shape
        implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    private double radius;

    public Sphere() {
    }

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4 * PI * Math.pow(radius, 3)) / 3;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * Math.pow(radius, 2);
    }

    @Override
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    @Override
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    @Override
    public double calculateCost() {
        return gramToKilogram() * PRICE_PER_KG;
    }

    @Override
    public void printInfo() {
        System.out.println("Volume\t\t: " + getVolume());
        System.out.println("Luas Permukaan\t: " + getSurfaceArea());
        System.out.println("Massa\t\t: " + getMass());
        System.out.println("Massa dalam kg\t: " + gramToKilogram());

        System.out.println("Biaya kirim\t: Rp " + calculateCost());
    }
}