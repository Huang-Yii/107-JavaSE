import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /**
         * 打印 X 图形
         */
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int num = scan.nextInt();

            for(int i = 1; i <= num; i++){
                for(int j = 1; j <= num; j++){
                    if(i == j) {
                        System.out.print('*');
                    }else if(i + j == num+1){
                        System.out.print('*');
                    }else {
                        System.out.print(' ');
                    }
                }
                    System.out.println();
            }
        }
    }

    public static void main6(String[] args) {
        /**
         * 求2个整数的最大公约数
         * 给定两个数，求这两个数的最大公约数
         *
         * 例如：
         * 输入：20 40
         * 输出：20
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入两个数字");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a % b;
        while (c != 0){
            a = b;
            b = c;
            c = a % b;
        }
        System.out.println(b);
    }

    public static void main5(String[] args) {
        /**
         * 二进制1的个数
         * 求一个整数，在内存当中存储时，二进制1的个数。
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num = scan.nextInt();
        int count = 0;
        for (int i = 0; i < 32; i++){
            //按位与
            if(((num>>>i)&1) == 1){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main4(String[] args) {
        /**
         * 判定素数
         * 给定一个数字，判定一个数字是否是素数
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num = scan.nextInt();
        int i = 0;
        if (num == 1){
            System.out.println(num+"不是素数");
        }else {
            for (i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    System.out.println(num+"不是素数");
                    break;
                }
            }
        }
        if (i > Math.sqrt(num)) {
            System.out.println(num+"是素数");
        }
    }

    public static void main3(String[] args) {
        /**
         * 输出闰年
         * 输出 1000 - 2000 之间所有的闰年
         */
        for (int i = 1000; i <= 2000; i++){
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
                System.out.println(i + "是闰年");
            }
        }
    }

    public static void main2(String[] args) {
        /**
         * 数字9 出现的次数
         * 编写程序数一下 1到 100 的所有整数中出现多少个数字9
         */
        int count = 0;
        for (int i = 1; i <= 100; i++){
            if (i/100 == 9){
                count++;
            }
            if (i%100/10 == 9){
                count++;
            }
            if (i%10 == 9){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main1(String[] args) {
        /**
         * 打印素数
         * 打印 1 - 100 之间所有的素数
         */
        for (int i = 1; i <= 100; i++){
            if (i == 1){
                continue;
            }
            int j;
            for (j = 2; j <= Math.sqrt(i); j++){
                if (i % j == 0){
                    break;
                }
            }
            if (j > Math.sqrt(i)){
                System.out.println(i);
            }
        }
    }
}
