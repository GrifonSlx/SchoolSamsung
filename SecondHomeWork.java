#1
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.print(number % 10);
    }
}

#2
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt() , first = number/100, second = (number%100)/10, third = number%10;
        System.out.print(first + second + third);
    }
}

#3

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int result = (number%2 == 0) ?number+2 : number +1;
        System.out.print(result);
    }
}

#4
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), n = in.nextInt(), result;
        result = n * (100* a+b);
        System.out.println(result/100+" "+result%100);



    }
}
#5
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong(), n,h,m,s;
        n = N%(3600*24);
        h = n / 3600;
        m = n % 3600 / 60;
        s = n % 60;
        System.out.print(h+":"+m/10+m%10+":"+s/10+s%10);
    }
}

