package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double[] arrayList = new double[5];

        //array filling
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < arrayList.length; index++){
            double i = scanner.nextDouble();
            arrayList[index] = i;
        }

        double[] arL = {20.0,10.0,30.0,4.0,50.0};
        double[] arL2 = {100.0,2.0,30.0,400.0,500.0};

        Vector v = new Vector(arrayList.clone());

        //Get value one element from array
        System.out.println("val:" + v.getValue(3));

        //Watch all Vector`s elements
        v.showValue();

        //Set value one element from array
        v.setValue(3,56);
        System.out.println(v.getValue(3));

        //Filling Vector from array
        v.setFillVector(arL);
        System.out.println(v.getValue(3));

        //Comparing Vectors
        Vector secondVector = new Vector(arrayList);
        System.out.println("Are vectors equal? "+"\n-"+secondVector.compareWith(v));

        //Counting elements on Vector
        System.out.println("The length of vector: "+secondVector.getCountElementsInVector());

        //Get min Vector`s element
        System.out.println(v.getMinValue());

        //Get max Vector`s element
        System.out.println(v.getMaxValue());

        //Multiplying Vector to Number
        v.multipleToNumber(5);
        v.showValue();

        //Sum with another Vector`s values
        v.sumVectors(secondVector);
        v.showValue();

        //Sort to low Vector
        Sort.sortToLow(v);

        //Sort to large Vector
        Sort.sortToLarge(v);
    }
}
