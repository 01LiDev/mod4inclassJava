/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jldevelops.mod4inclassjl;

/**
 *
 * @author johnsonli
 */
public class Mod4InClassJL {

    public static void main(String[] args) {
        int[] employeeCommissions = {4483,5564,9547,3942,3361,5405,2712,1692,6049,8363,9686,8284,3989,2152,3854,3453,3936,2481,2583,7822};
        int[] rangeCounter = new int[9];
        int baseEarning = 200;
        double commissionRate = 0.09;
        for(int i = 0; i < employeeCommissions.length ; i++){
            double salesCommissions = baseEarning + employeeCommissions[i] * commissionRate;
            if(salesCommissions > 1000){
                rangeCounter[8] += 1;
            }else if(salesCommissions > 900){
                rangeCounter[7] += 1;
            }
            else if(salesCommissions > 800){
                rangeCounter[6] += 1;
            }
            else if(salesCommissions > 700){
                rangeCounter[5] += 1;
            }
            else if(salesCommissions > 600){
                rangeCounter[4] += 1;
            }
            else if(salesCommissions > 500){
                rangeCounter[3] += 1;
            }else if(salesCommissions > 400){
                rangeCounter[2] += 1;
            }
            else if(salesCommissions > 300){
                rangeCounter[1] += 1;
            }else if(salesCommissions > 200){
                rangeCounter[0] += 1;
            }
        }
          System.out.printf("%-10s%-2d \n","200-299$",rangeCounter[0]);
          System.out.printf("%-10s%-2d \n","300-299$",rangeCounter[1]);
          System.out.printf("%-10s%-2d \n","400-299$",rangeCounter[2]);
          System.out.printf("%-10s%-2d \n","500-299$",rangeCounter[3]);
          System.out.printf("%-10s%-2d \n","600-299$",rangeCounter[4]);
          System.out.printf("%-10s%-2d \n","700-299$",rangeCounter[5]);
          System.out.printf("%-10s%-2d \n","800-299$",rangeCounter[6]);
          System.out.printf("%-10s%-2d \n","900-299$",rangeCounter[7]);
          System.out.printf("%-10s%-2d \n","1000<$",rangeCounter[8]);


    }
}
