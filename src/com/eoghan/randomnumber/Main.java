package com.eoghan.randomnumber;

import java.util.ArrayList;

/**
 *
 * @author Eoghan
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0);
        int run = 5;
        boolean gen;

        for (int i = 1; i < run; i++) {
            int rand = (int) Math.ceil(Math.random() * 5);
            gen = false;
            for (int j = 0; j < nums.size(); j++) {
                if (nums.get(j) == rand) {
                    gen = true;
                }
            }
            if (gen) {
                i--;
            } else{
                nums.add(rand);
                System.out.println(rand);
            }
        }
    }
}
