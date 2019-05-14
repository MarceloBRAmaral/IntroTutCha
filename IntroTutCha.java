import java.util.Scanner;

public class IntroTutCha {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int value = input.nextInt();//enter the value to be searched
        int size = input.nextInt();//enter the array size
        int myArray[] = new int[size];//provision for an array of a given size
        int index = size-1;//variable to store the position to be tested

        for(int i=0; i<size; i++){//reads the array from STDIN
            myArray[i] = input.nextInt();
        }

        for(int i=0; i<size; i++){
            if(myArray[index]==value){
                System.out.print(index);
                break;
            }else{index--;}
        }
    }
}