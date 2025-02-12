package org.example;
interface Calculator {
    int add(int a,int b);
    int sub(int a,int b);
    int mul(int a,int b);
    int div(int a,int b);
}
class NewCalculator implements Calculator
{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
    public int mul(int a,int b)
    {
        return a*b;
    }
    public int div(int a,int b)
    {
        return a/b;
    }
}
public class Main{
    public static void main(String[] args){
        NewCalculator cal=new NewCalculator();
        System.out.println("Addition:"+cal.add(20,30));
        System.out.println("sub:"+cal.sub(60,50));
        System.out.println("Mul:"+cal.mul(8,9));
        System.out.println("Div:"+cal.div(10,5));

    }

}