
package cumulativeNumber;

public class cumulative {
     int par4() {
        int sum = 0;
        for (int i = 1; i <= 4; i++) {
            sum += i;
        }
        return sum;
    }

    int par5() {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        return sum;
    }

    int par10() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }
    public static int sumCum(int num) {
        int sum = 0;
        for (int i = 1; i <=num; i++) {
            sum += i;
        }
        return sum;
    }


    public static void main(String[] args) {
        cumulative cum = new cumulative();
        System.out.println("Cumulative sum for 4 is " + cum.par4()) ;
        System.out.println("Cumulative sum for 5 is " + cum.par5()) ;
        System.out.println("Cumulative sum for 10 is "  + cum.par10()) ;
        System.out.println("Total sum of Cumulative : " + (cum.par4()+cum.par5()+cum.par10()));
    }
}







