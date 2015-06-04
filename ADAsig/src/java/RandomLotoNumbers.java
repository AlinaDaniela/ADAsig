/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author user
 */
public class RandomLotoNumbers {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1; i<50; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        for (int i=0; i<6; i++) {
            System.out.println("Elementul: " + list.get(i));
        }
        
        System.out.println("RandGen " + randInt(1,20));
    }
        
    public static int randInt(int min, int max) {

    Random rand = new Random();

    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
}
   
}


