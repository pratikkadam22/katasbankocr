package edu.pdx.cs410J.dv5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BankOCR {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder();
        sb.append(" _ _     _  _  _  _  _  _\n");
        sb.append(" _|_||_||_ |_   ||_||_|| |\n");
        sb.append("|_ _|  | _||_|  ||_| _||_|\n");
        String input = sb.toString();
        char[][] arr = new char[4][27];
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
        while(count<=27){
            StringBuilder temp = new StringBuilder();

            for(int i = 0; i < 3; i++) {
                for(int j = count; j < count+3; j++){
                    temp.append(arr[i][j]);
                }
            }
            accNum.append(map.get(sb.toString()));
            count += 3;
        }

        System.out.print("The account number is " + accNum.toString());

    }
}
