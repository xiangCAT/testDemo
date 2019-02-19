package cn.itcast.day04.demo01;

public class Test03 {
    public static void main(String[] args) {
        System.out.println(same(10,30));
    }
   /* public static boolean same(int a , int b) {
       boolean same;
       if (a == b) {
           same = true;
       } else {
           same = false;
       }
       return same;
   } */ //方法一

    /* public static boolean same(int a , int b){
       boolean same = a == b ? true : false;
        return same;
  }*/  //方法二

       public static boolean same(int a , int b){
         return a == b;
       }// 方法三
 }
