package dynamic_programming.돌게임.banasu0723;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int winner = 0;
        while(N!=0){
            if(N>3){
                N-=3;
            }else{
                N--;
            }
            winner++;
        }
        if(winner%2==0){
            System.out.println("CY");
        }else{
            System.out.println("SK");
        }
    }
}