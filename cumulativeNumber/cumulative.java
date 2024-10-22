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
        int[] par = {4,5,10};
       int total=0;
       int sFinal=0;
       int gTotal=0;
        for (int i = 0; i <=2; i++) {
            System.out.print("\n"+par[i]+ " = ");
            for (int j = 1; j <= par[i]; j++) {
                System.out.print(j+" ");
                int [] sArray = {total +=j};
                sFinal=sum(sArray);
            }
            System.out.println();
            System.out.println("\nCumulative Sum for "+ par[i]+" is " + sFinal);
            total-=total;
            gTotal+=sFinal;
        }
        System.out.println("\nTotal of Cumulative is : "+gTotal);
     }
}









