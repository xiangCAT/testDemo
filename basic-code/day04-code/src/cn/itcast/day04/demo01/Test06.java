package cn.itcast.day04.demo01;

public class Test06{
    public static void main(String[] args) {
        int index = 0;
        for(int i = 1;i<=100;i++){
            if((i+1)%10==0 || (i>=90 && i<100)){
                continue;
            }
            System.out.print(i+" ");
            index++;
            if(index%5==0){
                System.out.println();
            }
        }
    }
}
