package cn.itcast.day04.demo01;
//定义一个方法，求出1-100之间所有数的和。


   /* public class Tese04 {
        public static void main(String[] args) {
            System.out.println(sum(100));
        }
    public static int sum(int b){
        int sum = 0;
        for(int a = 1; a <= b ; a++){
            sum = sum + a;
        }
        return sum;
    }
}*/

   public class Tese04{
       public static void main(String[] args) {
           int sum = 0;
           for (int i = 0; i <=100; i++) {
               sum = sum + i;
               System.out.println(sum);
           }
       }
   }
