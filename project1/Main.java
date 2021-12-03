/*
Conley Ratlzaff
CIS219
Tu Th 3:30
*/

import java.util.Arrays;

public class Main{

  /*  static int checkArray(){

    Im going to be honest ive been trying to figure out how to make
    a method to check my array for duplicates but couldnt figure it out.



  }*/


  public static void main(String[] args) {
    int[] number = new int[20];
    for (int i = 0; i < number.length; i++){
      number[i] = (int) (Math.random()* 30 + 1);
    }
    System.out.println(Arrays.toString(number));
  }



}
