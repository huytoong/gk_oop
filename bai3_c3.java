/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tgk;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

abstract class Polygon {
    protected int numVertices;
    protected double[] vertices;
    protected double area;

    public Polygon() {
        this.numVertices = 0;
        this.vertices = null;
        this.area = 0;
    }

    public void inputVertices() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        this.numVertices = scanner.nextInt();
        this.vertices = new double[this.numVertices];
        System.out.println("Enter the vertices:");
        for (int i = 0; i < this.numVertices; i++) {
            this.vertices[i] = scanner.nextDouble();
        }
    }

    public void outputVertices() {
        System.out.println("Vertices:");
        for (double vertex : this.vertices) {
            System.out.println(vertex);
        }
    }

    public abstract void calculateArea();
}

class Rectangle extends Polygon {
    public Rectangle() {
        super();
    }

    public void inputVertices() {
        Scanner scanner = new Scanner(System.in);
        this.numVertices = 2;
        this.vertices = new double[this.numVertices];
        System.out.println("Enter the top left and bottom right vertices:");
        for (int i = 0; i < this.numVertices; i++) {
            this.vertices[i] = scanner.nextDouble();
        }
    }

    public void calculateArea() {
        this.area = Math.abs(this.vertices[1] - this.vertices[0]);
    }
}

class Triangle extends Polygon {
    public Triangle() {
        super();
    }

    public void inputVertices() {
        Scanner scanner = new Scanner(System.in);
        this.numVertices = 3;
        this.vertices = new double[this.numVertices];
        System.out.println("Enter the three vertices:");
        for (int i = 0; i < this.numVertices; i++) {
            this.vertices[i] = scanner.nextDouble();
        }
    }

    public void calculateArea() {
        double s = (this.vertices[0] + this.vertices[1] + this.vertices[2]) / 2;
        this.area = Math.sqrt(s * (s - this.vertices[0]) * (s - this.vertices[1]) * (s - this.vertices[2]));
    }
}

public class bai3_c3 {
    public static void main(String[] args) {
        Polygon rectangle = new Rectangle();
        rectangle.inputVertices();
        rectangle.calculateArea();
        System.out.println("Area of rectangle: " + rectangle.area);

        Polygon triangle = new Triangle();
        triangle.inputVertices();
        triangle.calculateArea();
        System.out.println("Area of triangle: " + triangle.area);
    }
}