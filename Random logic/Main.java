public class Main{
    public static void main(String[] args) {
        //int max is the variable that will hold the largest number in our output/matrix.
        //it's also the largest number we count towards, and count down a from once we reach it
        final int max = 10;

        //variable row_count keeps count of the number of rows generated in our output/matrix so far
        for(int row_count = 0; row_count <= max; row_count++){

            //the following is a nested for loop that generates output within each row
            //variable i keeps count of how many numbers have been printed in the row
            //x stores the actual number to be printed in the table/matrix
            for(int count_in_row = 0, x = row_count; count_in_row <= max; count_in_row++, x++){
                if(x <= max) //while counting up till max
                    System.out.print(x + " ");
                else
                    System.out.print(2*max - x + " "); //while counting down from max
            }

            //to put a new line at the end of every row
            System.out.println();
        }
    }
}