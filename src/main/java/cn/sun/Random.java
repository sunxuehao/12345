package cn.sun;

public class Random {
    private int i = (int) (100*Math.random());
    public void printRandom(){
        System.out.println("输出整数："+i);
    }
}
