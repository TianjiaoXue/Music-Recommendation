/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CF;



/**
 *
 * @author Tianjiao
 */
public class ActiveUser {

    public final int feature = 10;
    public int song = 50;
    public int[] record = new int[feature];
    public int[] score = new int[song];//score for each song;

    public ActiveUser() {
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
            score[i] = (int)(10 * Math.random()); 

        }
        
        return score;
    }

    public double[] initialActive(int m) {
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
