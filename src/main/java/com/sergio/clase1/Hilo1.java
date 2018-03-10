/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergio.clase1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EducaciónIT
 */
public class Hilo1 extends Thread{

    @Override
    public void run() {
        System.out.println("Hilaso");
        List<String> lista = new ArrayList<>();
        lista.add("Jorge");
        lista.add("carola");
        lista.add("messi");
        lista.stream().filter(x -> x.equals("carola")).forEach(System.out::println);
    }
    
}
