public class LogicalOperators3 {
    public static void main(String[] args) {
        
        //System.out.println(10%1==0 && 10%0==0);//AE
        System.out.println(10%1==1 && 10%0==0);//false
        //&& will return the false immediatly if the operand is false and will not check further conditions
        
        //& will return the answer at the end after checking all the conditions
        System.out.println(10%1==1 & 10%0==0);//AE
    }
}