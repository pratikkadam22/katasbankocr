package edu.pdx.cs410J.dv5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BankOCR {
    public static void main(String args[]){
        /*StringBuilder sb = new StringBuilder();
        sb.append(" _  _     _  _  _  _  _  _\n");
        sb.append(" _| _||_||_ |_   ||_||_|| |\n");
        sb.append("|_  _|  | _||_|  ||_| _||_|\n");
        String input = sb.toString();*/

        char[][] input = {{' ','_',' ',' ','_',' ',' ',' ',' ',' ','_',' ',' ','_',' ',' ','_',' ',' ','_',' ',' ','_',' ',' ','_',' '},
                          {' ','_','|',' ','_','|','|','_','|','|','_',' ','|','_',' ',' ',' ','|','|','_','|','|','_','|','|',' ','|'},
                          {'|','_',' ',' ','_','|',' ',' ','|',' ','_','|','|','_','|',' ',' ','|','|','_','|',' ','_','|','|','_','|'},
                          {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '}};

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("     |  |",1);
        map.put(" _  _||_ ",2);
        map.put(" _  _| _|",3);
        map.put("   |_|  |",4);
        map.put(" _ |_  _|",5);
        map.put(" _ |_ |_|",6);
        map.put(" _   |  |",7);
        map.put(" _ |_||_|",8);
        map.put(" _ |_| _|",9);
        map.put(" _ | ||_|",0);
        int count = 0;
        StringBuilder accNum = new StringBuilder();
        for(int k = 0; k < 9; k++) {
            StringBuilder temp = new StringBuilder();
            int c = (k%9)*3;
            for(int i = 0; i < 3; i++) {
                for(int j = c; j < c + 3; j++){
                    temp.append(input[i][j]);
                }
            }
            System.out.println(temp.toString());
            accNum.append(map.get(temp.toString()));
        }

        System.out.print("The account number is " + accNum.toString());

    }
}
