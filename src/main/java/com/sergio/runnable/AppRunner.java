/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergio.runnable;

/**
 *
 * @author EducaciónIT
 */
public class AppRunner {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Nnasnd");
        MiRunnable superRun = new MiRunnable();
        Thread h1 = new Thread(superRun);
        h1.start();
        
        //El método join detiene el hilo main hasta que el hilo h1 finalize
        h1.join();
        
        System.out.println("Joasdasdasd");
        
        
        Thread h2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Segundo mejor runnable del mundo");
            }
        });
        
        h2.start();
        
        Thread th1 = new Thread(() -> {
            System.out.println("asd");
        });
        
        th1.start();
        
    }
}
