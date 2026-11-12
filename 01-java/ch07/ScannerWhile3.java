package org.example.ch07;

import java.util.Scanner;

public class ScannerWhile3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int sum = 0;
    while (true) {
      System.out.println("0을 입력하면 프로그램은 종료된다.:");
      int num =  scanner.nextInt();

      if (num == 0) {
        break;
      }
      sum += num;
    }
    System.out.println("입력한 모든 정수의 합: " + sum);
  }

}
