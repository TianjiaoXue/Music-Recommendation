/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CF;

import java.util.Arrays;
import java.util.TimerTask;

/**
 *
 * @author Tianjiao
 */
public class PSO extends TimerTask {

    public static int songcount = 30;
    public static int usercount = 30;
    Thread[] userThread;
    TestUser[] tu = new TestUser[usercount];
    ActiveUser au = new ActiveUser();
    UpdateUser uu = new UpdateUser();
    double[] gBest;
    double gbest;

    public void init() {

        for (int i = 0; i < usercount; i++) {
            tu[i] = new TestUser();
            tu[i].initalWeight();       
            tu[i].intialRecord();
            tu[i].initalScore();
        }
        gBest = tu[0].pBest;

        au.initalScore();
    }

    public void run() {
        for (int i = 0; i < songcount; i++) {
            double[] active = au.initialActive(i);
                
            for (int j = 0; j < usercount; j++) {
                double[] test = tu[j].initialTest(i);
             
               double[] weightnew= uu.updateTestUser(tu[j].weight, tu[j].pBest, gBest);   
             
               double pbest = uu.updatePbest(test, active,  tu[j].pBest,  weightnew);               

               double gbest= uu.updateGbest(test, active,  gBest , tu[j].pBest); 
//                 System.out.println("user: "+j + " song: "+i+" pbest: "+ pbest + " gbest: " + gbest);
//                 System.out.println(pbest);
            }
           // System.out.println(Arrays.toString(gBest));

        }
    }

}
