package Pattern;

public class Pattern5 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
    for(int row=0;row < 2 * n;row++){
        //for every row, run the col
        int totalColsinRow =  row > n ? 2 * n - row : row;
        int noOfSpaces = n-totalColsinRow;
        for(int s=0;s<noOfSpaces;s++){
            System.out.print(" ");
        }
        for(int col=0; col<totalColsinRow; col++){
              System.out.print("* ");
        }

     //when one row is printed, we need to add a new line
System.out.println();
}    

}
}
