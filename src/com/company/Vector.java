package com.company;

public class Vector {

    private double[] arr;

    Vector(double[] arr){
        this.arr = arr;
    }

    //return array`s element
    public double getValue(int number){
        return arr[number-1];
    }

    //watch all Vector`s elements
    public void showValue(){
        for (double item:this.arr){
            System.out.println("Items:"+item);
        }
    }

    // Change array`s element
    public void setValue(int number, double val){
        arr[number-1] = val;
    }

    // Fill Vector with pointing array`s items
    public void setFillVector(double[] arr){
        int index = 0;
        if (arr.length == this.arr.length){
            for (double item:arr){
                this.arr[index] = item;
                index++;
            }
        }
        else {
            System.out.println("Array`s length is deny.");
        }
    }

    //Comparing Vectors
    public boolean compareWith(Vector vector){
        if (this.arr.length == vector.getCountElementsInVector()){
            for (int index = 0; index < this.arr.length; index++){
                if (this.arr[index] != vector.getValue(index+1)){
                    return false;
                }
            }
            return true;
        }
        else
            {
                return false;
            }
    }

    //Get Vectors length
    public int getCountElementsInVector(){
        return this.arr.length;
    }

    //Get Min Value from Vector
    public double getMinValue(){
        double min = this.arr[0];
        for(int index = 1; index < this.arr.length; index++){
            if (this.arr[index] < min){
                min = this.arr[index];
            }
        }
        return min;
    }

    //Get Max Value from Vector
    public double getMaxValue(){
        double max = this.arr[0];
        for(int index = 1; index < this.arr.length; index++){
            if (this.arr[index] > max){
                max = this.arr[index];
            }
        }
        return max;
    }

    //Multiplying Vector`s with number
    public void multipleToNumber(double number){
        for (int index=0; index < this.arr.length; index++){
            this.arr[index] *= number;
        }
    }

    //Sum with Vector
    public void sumVectors(Vector vector){
        if (this.arr.length == vector.getCountElementsInVector()){
            for (int index=0; index < this.arr.length; index++){
                this.arr[index] += vector.getValue(index+1);
            }
        }
    }
}
