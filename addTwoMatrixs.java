import java.io.*;
import java.util.Scanner;

public class addTwoMatrixs{
    
public static void main(String[] args) {
    int soDong, soCot;
     
    Scanner scanner = new Scanner(System.in);
         
    System.out.println("Nhap vao so dong cua ma tran: ");
    soDong = scanner.nextInt();
    System.out.println("Nhap vao so cot cua ma tran: ");
    soCot = scanner.nextInt();
         
    int[][] A = new int[soDong][soCot];
    int[][] B = new int[soDong][soCot]; 
    int[][] C = new int[soDong][soCot]; 
    System.out.println("Nhap  phan tu cho ma tran thu nhat:\n");
    for (int i = 0; i < soDong; i++) {
        for (int j = 0; j < soCot; j++) {
            System.out.print("Nhap phan tu thu [" + i + ", " + j + "]: ");
            A[i][j] = scanner.nextInt();
        }
    }
         
    System.out.println("Ma Tran A: ");
    for (int i = 0; i < soDong; i++) {
        for (int j = 0; j < soCot; j++) {
            System.out.print(A[i][j] + "\t");
        }
        System.out.println("\n");   
    }
    System.out.println("Nhap  phan tu cho ma tran thu hai:\n");
    for (int i = 0; i < soDong; i++) {
        for (int j = 0; j < soCot; j++) {
            System.out.print("Nhap phan tu thu [" + i + ", " + j + "]: ");
            B[i][j] = scanner.nextInt();
        }
    }
         
    System.out.println("Ma Tran B: ");
    for (int i = 0; i < soDong; i++) {
        for (int j = 0; j < soCot; j++) {
            System.out.print(B[i][j] + "\t");
        }
        System.out.println("\n");   
    }
    System.out.println("Tong cua hai ma tran la:\n");
    for (int i = 0; i < soDong; i++) {
        for (int j = 0; j < soCot; j++) {
            C[i][j] = A[i][j]+B[i][j];
        }
    }
    for (int i = 0; i < soDong; i++) {
        for (int j = 0; j < soCot; j++) {
            System.out.print(C[i][j] + "\t");
        }
        System.out.println("\n");   
    }

}

}