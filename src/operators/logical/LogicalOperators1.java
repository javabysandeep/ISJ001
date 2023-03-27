package operators.logical;

public class LogicalOperators1 {
    public static void main(String[] args) {
        //logical operators
        //AND : &&, &
        //OR : ||, |
        //XOR: ^
        //NOT: !

        int ssc = 65;
        int hsc = 90;
        int graduation = 65;

        System.out.println("Are you allowed for the admission "+
            (ssc>=80 && hsc>=80 && graduation>=80)
        );

        System.out.println("Are you allowed for the admission : "+
            (ssc>=80 || hsc>=80 || graduation>=80)
        );

        
        

        

    }
}