package cn.itcast.day04.demo01;

public class Test02 {
    public static void main(String[] args) {
      /*  sum(10,20);//单独调用
        System.out.println(sum(10,20));//打印调用*/
        int number =sum(12,28); // 赋值调用
        System.out.println(number);
    }
    public static int sum(int a , int b){
        int result = a + b;
        return result;
    }
}
