public class LogicalOperators4 {
    public static void main(String[] args) {
        
        //|| will return the answer immediatly after getting the first true and it will not check rest of the conditions
        System.out.println(10%1==0 || 10%0==0);//true


        //| will return the answer at the end after checking all the conditions

        System.out.println(10%1==0 | 10%0==0);//AE
    }
}