package main;

import java.util.Scanner;

public class Poll {
  
static String[] Q={"How important is climate change?","How imporant is renewable energy?","How important are electric vehicles?","How important is medicinal marijuana?","How imporant is univ. basic income?"};//here you edit your issues
static int[][] R=new int[5][10];
public static void main(String[] args){
	
   double[] total=new double[]{0,0,0,0,0};
   double avg=0;
   int participants;
   
   Scanner scnr=new Scanner(System.in);
   
   System.out.println("How many people are participating in this survey?(1-10)");
   participants = scnr.nextInt();
   
   for(int i = 1; i <= participants; i++){
       for(int j = 0; j < 5; j++){
           System.out.println("Please answer between 1-10.\n" + (j+1) + "." + Q[j]);
           R[j][i]=scnr.nextInt();
       }
   }
   
   
   System.out.println("Responses");
   for(int i = 0; i < 5; i++){
       System.out.print("\n" + (i + 1) + "." + Q[i] + "\t");
       for(int j = 0; j < 10; j++){
           System.out.print(R[i][j] + "\t");
           total[i]=total[i] + R[i][j];
       }
       avg=total[i] / 10;
       System.out.print("Average="+avg);
   }
   
   double max = total[0];
   double min = total[0];
   int maxI = 0;
   int minI = 0;
   
   for(int i = 0; i < 5; i++){
       if(max < total[i]){
           max = total[i];
           maxI = i;
       }
       if( min > total[0]){
           min = total[0];
           minI = i;
       }
   }
   
   System.out.println("\n\nHighest rated question - "+Q[maxI]+"\tRatings:"+max);
   System.out.println("Lowest rated question - "+Q[minI]+"\tRatings:"+min);
  
   }
}