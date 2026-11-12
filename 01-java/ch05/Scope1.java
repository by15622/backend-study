package org.example.ch05;

public class Scope1 {

  public static void main(String[] args) {
    int m = 10; // m 생존 시작
    if (true) {
      int x = 20; // x 생존 시작
      System.out.println("if m = " + m);
      System.out.println("if x = " + x);
    } // x 생존 종료, 아래 x는 살아있지 않기때문에 x는 사라짐
     // System.out.println("main x = " + x);
    System.out.println("main m = " + m);
  } // m 생존 종료

} // 지역변수는 본인의 코드 블록 안에서만 생존한다. 자신의 코드 블록안에서 벗어나면 제거된다.
