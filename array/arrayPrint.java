package array;

import java.io.*;
public class arrayPrint
{
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A[] = new int[10];
        System.out.print("Enter the elements :: ");
        for(int i=0; i<10;i++)
        A[i] = Integer.parseInt(br.readLine());
        for(int i=0; i<10; i++)
        System.out.println(A[i]);
    }
}