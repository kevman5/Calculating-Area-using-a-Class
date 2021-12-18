package com.example.project_class;

public class Rectangle {
    private double side1;
    private double side2;
    private double ans1;

    public Rectangle()
    {
        side1 = 0;
        side2 = 0;
    }

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }


    public void setSide1(double p_side1)
    {
        side1 = p_side1;
    }
    public double getSide1()
    {
        return side1;
    }
    public void setSide2(double p_side2)
    {
        side2 = p_side2;
    }
    public double getSide2()
    {
        return side2;
    }
    public double calcArea()
    {
        ans1 = side1 * side2;
        return ans1;

    }



}
