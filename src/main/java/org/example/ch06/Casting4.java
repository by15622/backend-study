package org.example.ch06;

public class Casting4 {

  public static void main(String[] args) {
    int div1 = 3 / 2; // 1.5가 나와야 하는데
    System.out.println("div1 = " + div1);

    double div2 = 3 / 2;
    System.out.println("div2 = " + div2);

    double dic3 = 3.0 / 2;
    System.out.println("div3 = " + dic3);

    double div4 = (double) 3 / 2;
    System.out.println("div4 = " + div4);

    int a = 3;
    int b = 2;
    double result = (double) a / b;
    System.out.println("result = " + result);
  }

}
