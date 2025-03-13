package datastructure.큐2.Uechann;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = 0;
        String input;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        N = br.read();


        for (int i = 0; i < N; i++) {
            input = br.readLine();

            if(input.equals("push")) {

            }
            //pop 가장 앞에 있는 정수 빼고 출력, 없으면 -1 출력

            //size 큐에 들어있는 정수 개수 출력

            //empty 비어 있으면 1 아니면 0 출력

            //front 가장 앞에 있는 정수 출력 없으면 -1

            //back 가장 뒤에 있는 정수 출력 없으면 -1

        }


    }
}
