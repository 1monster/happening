package com.onemon.thehappening;

import java.util.ArrayList;

/**
 * Created by OneMonster on 4/1/16.
 */
public class HosunLib {

    public static ArrayList<ArrayList<String>> StationList;
    public static ArrayList<String> Adder;
    public static String[][] array = {
            {"1","2","3"},
            {"1","2","3"},
            {"1"}
    };
    public static void init() {
        StationList = new ArrayList<ArrayList<String>>();

        for(int i=0 ; i<array.length ; i++) {
            Adder = new ArrayList<String>();
            for (int j = 0; j < array[i].length; j++) {
                Adder.add(array[i][j]);
            }
            StationList.add(Adder);
        }
    }
    public static ArrayList<ArrayList<String>> get() {
        return StationList;
    }
}