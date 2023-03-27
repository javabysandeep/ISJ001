package controlStatements.looping;

public class Pattern1 {
    public static void main(String[] args) {
        for (int row =1; row<=5; row++){
            //spaces
            for (int space=5-row;space>0; space--){
                System.out.print(" ");
            }
            //stars
            for (int star = 1; star <=row ; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
