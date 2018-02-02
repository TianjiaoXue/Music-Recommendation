/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CF;

import java.util.Timer;

/**
 *
 * @author zhjian
 */
public class TestPSO {
    public static void main(String []args){
    //    Timer timer = new Timer();
        PSO pso= new PSO();
        pso.init();
        pso.run();
        
//         
//        timer.schedule(new (1), 5000);// 5秒后启动任务
//
//        OneTask secondTask= new OneTask(2);
//        timer.schedule(secondTask, 1000, 3000);// 1秒后启动任务,以后每隔3秒执行一次线程
//
//        Date date = new Date();
//        timer.schedule(new OneTask(3),new Date(date.getTime()+1000));//以date为参数，指定某个时间点执行线程
//
////      timer.cancel();
////      secondTask.cancel();
//
//    }
    }
}
