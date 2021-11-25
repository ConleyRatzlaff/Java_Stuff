/*
Conley Ratlzaff
CIS219
Tu Th 3:30
*/

import java.util.Arrays;

public class Main{
  int[] number = new int[20];
  static void getRandom(){
  //sets length of number array to 20
  Main myObj = new Main();
  //generates 20 random numbers and stores them into number array
  for(int i = 0; i < number.length; i++){
    myObj.number[i] = (int)(Math.random()*30 + 1);

  }
  //prints the contents of array
  //System.out.println(Arrays.toString(number));
  }

  static void checkArray(){
    int x = number[]
    for (int i= 0; i < number.length; i++){
      if ( x == number[i]){
        getRandom();
        checkArray();
      }else{
        return x;
    }
  }
}


  public static void main(String[] args) {
  getRandom();
  checkArray();
  System.out.println(Arrays.toString(number));
  }
}
