package oop;

public class Test3 {
        public int sum = 1;
        public int y = 5;
        private int x = 3;
        public Test3(){
            sum = sum + 3;
            y = sum + y + x;
        }
        public Test3(int a, int b){
            x = x - a;
            y = b + y + 2*x;
        }
        public void methodA(){
            y = y + 7;
            x = y + 5;
            sum = x + y;
            System.out.println(x + " " + y+ " " + sum);}
        public void methodB(){
            y = y + 11;
            x = x + 33 - y;
            sum = sum + x + y;
            System.out.println(x + " " + y+ " " + sum);
        }
}

