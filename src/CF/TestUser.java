/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CF;

import java.util.Arrays;



/**
 *
 * @author Tianjiao
 */
public class TestUser {
    // for each training user

    public final int feature = 10;
    public int song = 50;
    public double[] weight = new double[feature + 1];//the weight set for each feature
    public double[] pBest = new double[feature + 1]; //the best postion of each feature
    public int[] record = new int[feature];

    public int[] score = new int[song];//score for each song;

    public TestUser() {
    }

    public double[] initalWeight() {
        for (int i = 0; i < weight.length; i++) {
            weight[i] = (double)(225 * Math.round(Math.random() * 100)/100.0);//randomly generate weight for each ferture between 0 to 10
            pBest[i] = weight[i];
        }
        //System.out.println("inital weight is: "+ Arrays.toString(weight)); 
        return weight;
    }

    public int[] intialRecord() {
        int age = (int) (Math.random() * 80);//random age from 0-80
        int gender = (int) (2 * Math.random()); //0 or 1
        if (age < 25) {
            record[0] = 1;
        } else if (age > 50) {
            record[0] = 3;
        } else {
            record[0] = 2;
        }
        record[1] = gender;
        for (int i = 2; i < feature; i++) {
            record[i] = (int) (2 * Math.random());
           
        }
        return record;
    }

    public int[] initalScore() {

        for (int i = 0; i < score.length; i++) {
            score[i] =(int)(10 * Math.random());
        }
        return score;
    }

    public double[] initialTest(int m) {
        double[] test;
        test = new double[feature + 1];
        for (int y = 0; y < feature; y++) {
            test[y] = record[y];
        }
        test[feature] = score[m];
        for (int i = 0; i < test.length; i++) {
        }
        return test;
    }
}
