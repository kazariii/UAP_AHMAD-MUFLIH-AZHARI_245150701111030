package models;

import bases.Shape;
import interfaces.*;

public class Torus extends Shape
        implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    private double majorRadius;
    private double minorRadius;

    public Torus() {
    }

    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    public double getVolume() {
        return (2 * majorRadius * Math.pow(minorRadius, 2)) * Math.pow(PI, 2);
    }

    @Override

    public double getSurfaceArea() {
        return (4 * majorRadius * minorRadius) * Math.pow(PI, 2);
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