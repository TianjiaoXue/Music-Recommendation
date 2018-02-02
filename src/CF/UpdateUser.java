/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CF;

import static java.lang.Math.sqrt;
import java.util.Arrays;

/**
 *
 * @author zhjian
 */
public class UpdateUser {

    public double fitness(double[] active, double[] test, double[] weight) {
        //euclidean to evalute similarity between two users.
        double sum = 0;
        for (int i = 0; i < test.length; i++) {
            sum += weight[i] * (test[i] - active[i]) * (test[i] - active[i]);
        }
        double euclidean = sqrt(sum);
        return euclidean;

    }

    public double updatePbest(double[] test, double[] active, double[] pBest, double[] weight) {

        double current = fitness(active, test, weight);
        double pbest = fitness(active, test, pBest);
        if (current < pbest) {
            pbest = current;
            for (int i = 0; i < test.length; i++) {
                pBest[i] = weight[i];
            }
        }

         return(double)(Math.round((pbest)* 100)/100.0);
    }

    public double updateGbest(double[] test,  double[] active,double[] gBest, double[] weight) {
        double current = fitness(active, test, weight);
        double gbest = fitness(active, test, gBest);

        if (current < gbest) {
            gbest = current;
            for (int i = 0; i < test.length; i++) {
                gBest[i] = weight[i];
            }
      }
        return(double)(Math.round((gbest)* 100)/100.0); 

    }

    public double[] updateTestUser(double[] weight, double[] pbest, double[] gbest) {
        double w = Math.random() / 2 + 0.5; //random inertia weight between 0.5-1
        double c1 = 1.5;
        double c2 = 1.5; //constant
        double r1 = Math.random();  //random number between 0-1
        double r2 = Math.random(); 
  
        for (int i = 0; i < weight.length; i++) {

            double[] change= new double[weight.length];
            change[i] = w * weight[i] + c1 * r1 * (pbest[i] - weight[i]) + c2 * r2 * (gbest[i] - weight[i]) ;  
//            if(change[i]<0){
//                change[i]=0.1;//min
//            }
//            if(change[i]>5){
//                change[i]=5.0;
//            }
            weight[i] =(double)(Math.round(( weight[i] + change[i])* 100)/100.0);  
           // System.out.println(Arrays.toString(weight));
        }
        
        return weight;
    }

}
