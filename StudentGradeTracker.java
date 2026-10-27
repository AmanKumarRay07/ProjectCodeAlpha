package ProjectCodeAlpha;

import java.util.Scanner;

public class StudentGradeTracker {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("==================================================================================");
    System.out.println("                          STUDENT GRADE TRACKER                                   ");
    System.out.println("==================================================================================");
    System.out.println();

    // Number of Students
    System.out.print("Enter No of students : ");
    int n = sc.nextInt();

    // Arrays
    String[] name = new String[n];
    int[] score = new int[n];

    System.out.println("Enter Student Details");

    // Input
    for (int i = 0; i < n; i++) {
      System.out.println("\nStudent" + " " + (i + 1));

      System.out.print("Enter  the Student Name : ");
      name[i] = sc.next();
      sc.nextLine();

      boolean validscore;

      System.out.print("Enter the Student Score : ");
      score[i] = sc.nextInt();

     validscore=score[i]>=0 && score[i]<=100;

     while(!validscore)
     {
      System.out.println("Invalid Score");
      System.out.print("Enter the Score Again : ");
      score[i]=sc.nextInt();

    
      validscore=score[i]>=0 && score[i]<=100;
      System.out.println("Valid Score :"+score[i]);
     }
     
    

    }
    // Output
    System.out.println("\n=============================================================================================");
    System.out.println("                               STUDENT SUMMARY                                               ");
    System.out.println("=============================================================================================");

    System.out.println("STUDENT NAME                            SCORE");
    System.out.println("---------------------------------------------");

    for (int i = 0; i < n; i++) {
      System.out.println(name[i] + "                                 " + score[i]);
    }
    System.out.println("----------------------------------------------\n\n");

    // Some Calculation Tasks ======Average,Highest Score And Lowest======

    // Average Score of Student
    double total = 0;
    for (int i = 0; i < n; i++) {
      total = total + score[i];

    }
    double avg = total / n;
    System.out.println("Average Score : " + avg);

    // Higest Score Of Student
    int max = score[0];
    for (int i = 0; i < n; i++) {
    if(score[i] > max)
    {
       max = score[i];

    }
    }
    System.out.println("Highest Score : " + max);

    // Lowest Score of Student
    int min = score[0];
    for (int i = 0; i < n; i++) {
      if (score[i] < min) {
        min = score[i];
      }
    }
    System.out.println("Lowest Score  : " + min);

    System.out.println("================================================================================================");
    System.out.println("                               GRADE TRACKER COMPLETED                                          ");
    System.out.println("================================================================================================");

  }

}
