package LeetCode.Easy;

import java.util.Scanner;
import java.util.Stack;

public class LeetCode_682_BaseBallGame {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int inputCount = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        int i = 0;
        int score = 0;
        while( i < inputCount){
            st.add(Integer.valueOf(sc.next()));
            i++;
        }

    }
}
