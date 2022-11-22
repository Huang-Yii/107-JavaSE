import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();//如果要固定数字,在此括号内写上数字
        //int randNum = random.nextInt(100);//[0,100)
        //int randNum = random.nextInt(100)+100;//[100,200)
        int randNum = random.nextInt(50)+50;//[50,100)
        double n = Math.random();
        System.out.println(randNum);
        System.out.println(n);
    }

    //猜数字
    public static void main29(String[] args) {
        Scanner scan = new Scanner(System.in);//1
        Random random = new Random();
        int randNum = random.nextInt(100);//[0,100)
        //System.out.println(randNum);
        while (true){
            System.out.println("请输入你要猜的数字");
            int num = scan.nextInt();
            if (num > randNum) {
                System.out.println("猜大了!");
            }else if (num == randNum) {
                System.out.println("猜对了!");
                break;
            }else {
                System.out.println("猜小了!");
            }
        }
    }

    public static void main28(String[] args) {
        //循环输入输出
        Scanner scan = new Scanner(System.in);//1
        //读取多个整数
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            System.out.println("n = "+n);
        }
        //CTRL+D结束循环(Linux和IDEA) 在cmd中CTRL+Z
    }

    public static void main27(String[] args) {
        Scanner scan = new Scanner(System.in);//1
        System.out.println("请输入年龄: ");
        int n = scan.nextInt();//2
        System.out.println(n);

        scan.nextLine();

        //此时 上边儿输完后的 回车 会被下面读取到
        System.out.println("请输入姓名: ");
        String name = scan.nextLine();
        System.out.println(name);


    }

    public static void main26(String[] args) {
        Scanner scan = new Scanner(System.in);//1
        System.out.println("请输入姓名: ");
        //next相较于nextLine缺点是遇到空格就结束了
        String name = scan.next();
        System.out.println(name);
        //空格后边的会被name2读走
        String name2 = scan.next();
        System.out.println(name2);
    }

    public static void main25(String[] args) {
        Scanner scan = new Scanner(System.in);//1
        System.out.println("请输入姓名: ");
        String name = scan.nextLine();
        System.out.println(name);

        System.out.println("请输入年龄: ");
        int n = scan.nextInt();//2
        System.out.println(n);

        System.out.println("请输入工资: ");
        float f = scan.nextFloat();
        System.out.println(f);

        //相当于一个文件资源,用完记得关闭
        scan.close();
    }

    public static void main24(String[] args) {
        System.out.println("输出且换行");
        System.out.println("输出且不换行");
        System.out.printf("%s\n","格式化输出!和C语言一样!");
    }

    public static void main23(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }while (i <= 10);
    }

    public static void main22(String[] args) {
        //for写死循环
        for (int i = 0; ; i++) {
            //没有条件的时候,默认true,死循环
            System.out.println("ssda");
        }
    }

    public static void main21(String[] args) {
        int sum = 0;
        for (int k = 1; k <= 6; k++) {
            int ret = 1;
            for (int i = 1; i <= k; i++) {
                ret *= i;
            }
            //System.out.println(ret);
            sum += ret;
        }
        System.out.println(sum);
    }

    public static void main20(String[] args) {
        //fori
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void main19(String[] args) {
        //找到1-100内,既能被3整除 也能被5整除的数字  要求:使用break或者continue当中的一个
        int i = 1;
        while (i <= 100) {
            if(i % 3 != 0 || i % 5 != 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }

    public static void main18(String[] args) {
        int a = 1;
        while (a <= 10) {
            if (a == 2){
                a++;
                continue;
            }
            System.out.println(a);
            a++;
        }
        //System.out.println(a);
    }

    public static void main17(String[] args) {
        while (true){
            System.out.println("hello");
        }
    }

    public static void main16(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 5) {
            int a = 1;
            int ret = 1;
            while (a <= i) {
                ret *= a;
                a++;
            }
            sum += ret;
            i++;
        }
        System.out.println(sum);
    }

    public static void main15(String[] args) {
        int a = 1;
        int ret = 1;
        while (a <= 5){
            ret *= a;
            a++;
        }
        System.out.println(ret);
    }
    public static void main14(String[] args) {
        int a = 1;
        int sum = 0;
        while (a <= 100){
            sum = sum+a;
            a++;
        }
        System.out.println(sum);
        System.out.println("=====================");
        a = 1;
        int sumOdd = 0;
        while (a <=100) {
            sumOdd += a;
            a += 2;
        }
        System.out.println(sumOdd);
        System.out.println("=====================");
        a = 2;
        int sumEve = 0;
        while (a <= 100) {
            sumEve += a;
            a += 2;
        }
        System.out.println(sumEve);
    }

    public static void main13(String[] args) {
        int a = 1;
        while (a <= 5) {
            System.out.println(a);
            a++;
        }
        System.out.println("ssfjw");
    }

    public static void main12(String[] args) {
        //不能做switch的参数类型是什么? long double float Boolean不行  //字符串,枚举都可以
        int a = 1;
        switch (a){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println("输入有误!");
                break;
        }
    }

    public static void main11(String[] args) {
        int a = 10;
        switch (a){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println("输入有误!");
                break;
        }
    }

    public static void main9(String[] args) {
        int year = 1900;
        if(year % 400 == 0|| (year % 100 != 0 && year % 4 == 0)){
            System.out.println("是闰年!");
        }else {
            System.out.println("不是闰年!");
        }
    }

    public static void main8(String[] args) {
        int year = 2022;
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("是闰年!");
            }else {
                System.out.println("不是闰年!");
            }
        }else {
            if (year % 4 == 0) {
                System.out.println("是闰年!");
            }else {
                System.out.println("不是闰年!");
            }
        }
    }

    public static void main7(String[] args) {
        int a = 10;
        if (a > 0){
            System.out.println("正数");
        }else if (a < 0) {
            System.out.println("负数");
        }else {
            System.out.println("0!");
        }
    }

    public static void main6(String[] args) {
        int a = 10;
        if (a % 2 != 0){
            System.out.println("奇数!");
        }else {
            System.out.println("偶数!");
        }
    }

    public static void main5(String[] args) {
        int a = 10;
        if (a < 10){

        }else if (a > 15){

        }else {

        }
    }
    public static void main4(String[] args) {
        int a = 10;
        if (a == 10){
            System.out.println("a == 10");
        }else {
            System.out.println(a != 10);
        }
        int b = 10;
        if (b == 10){
            System.out.println("b == 10");
        }
        System.out.println("b != 10");
    }

    public static void main3(String[] args) {
        int a = 10;
//        if (a == 10){
//            System.out.println("a == 10");
//        }
        //不要这样写代码,该有的括号加上,逻辑更加清楚↓
        if (a == 10)
            System.out.println("a ==10");
        if (a == 20)
            System.out.println("sadaw");


    }

    public static void main2(String[] args) {
        System.out.println("1");
        System.out.println("3");
        System.out.println("2");
    }

    public static void main1(String[] args) {
        short a = 128;

        byte b = (byte) a;
        //byte c = 128; err

        System.out.println(a);
        System.out.println(b);
    }
}
