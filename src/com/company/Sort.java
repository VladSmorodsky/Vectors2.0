package com.company;

class Sort {

    static void sortToLow(Vector vector){
        double[] vec = new double[vector.getCountElementsInVector()];

        for (int items = 0; items < vector.getCountElementsInVector(); items++){
            vec[items] = vector.getValue(items+1);
            System.out.println("vec items: "+ vec[items]);
        }

        for (int index = 0; index < vec.length ; index++){
            for (int j = vec.length-1; j > index; j--){
                if (vec[j] > vec[j-1]){
                    double temp = vec[j];
                    vec[j] = vec[j-1];
                    vec[j-1] = temp;
                }
            }
        }

        for (int itms = 0; itms < vec.length; itms++){
            System.out.println("vec sort items: "+ vec[itms] + " ");
        }
    }

    static void sortToLarge(Vector vector){
        double[] vec = new double[vector.getCountElementsInVector()];

        for (int items = 0; items < vector.getCountElementsInVector(); items++){
            vec[items] = vector.getValue(items+1);
            System.out.println("vec items: "+ vec[items]);
        }

        for (int index = vec.length-1; index > 0 ; index--){
            for (int j = 0; j < index; j++){
                if (vec[j] > vec[j+1]){
                    double temp = vec[j];
                    vec[j] = vec[j+1];
                    vec[j+1] = temp;
                }
            }
        }
        for (int itms = 0; itms < vec.length; itms++){
            System.out.println("vec sort items: "+ vec[itms] + " ");
        }
    }
}
