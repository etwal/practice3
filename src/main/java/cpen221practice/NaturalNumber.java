package cpen221practice;

import java.util.ArrayList;

class NaturalNumber {

    private int number;

    public NaturalNumber(int number){


        if (number <= 0){
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.number = number;
    }

    public int[] factors(int number){

        ArrayList<Integer> fact = new ArrayList<Integer>();

        for (int i = 1; i< number; i++){
            if(number% i == 0){
                fact.add(i);
            }
        }

        int []factArray = new int[fact.size()];

        for (int i =0; i< fact.size(); i++){
            factArray[i] = fact.get(i);
        }


        return factArray;
    }


    public int factorSum(int[] factors){

        int total = 0;

        for (int i =0; i<factors.length; i++){
            total += factors[i];
        }
        return total;

    }

    public Classification getClassification() {
        int[] fact = factors(number);
        int sum = factorSum(fact);

       return sum<number ? Classification.DEFICIENT : sum>number? Classification.ABUNDANT: Classification.PERFECT;
       }

    }

    /*enum getClassification(){

        int[] fact = factors(number);
        int sum = factorSum(fact);

        if(sum < number){
            return DEFICIENT;

        }
    }*/


