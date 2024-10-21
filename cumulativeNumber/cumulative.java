package CumulativeNumber;

public class cumulative {
    public static int sum(int... numbers) {
        int sum = 0;
        for(int number:numbers){
            sum+=number;
        }
        return sum;

    }
    public static void main(String[] args) {
        int[] nArray={1,2,3,4};
        int comp=sum(nArray);
        System.out.println(" Cumulative Sum for 4 : " +comp);
        int[] nArray1={1,2,3,4,5};
        int comp1=sum(nArray1);
        System.out.println(" Cumulative Sum for 5 : " +comp1);
        int[] nArray2={1,2,3,4,5,6,7,8,9,10};
        int comp2=sum(nArray2);
        System.out.println(" Cumulative Sum for 10: " +comp2);
        System.out.println("Total sum of cumulative :"+(comp+comp1+comp2));

        //int comp= sum(nArray);


    }
}









