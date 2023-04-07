package classComponents;

public class DatabaseTest {
    public static void main(String[] args) {
        //mysql prod, dev
        System.out.println(DatabaseConstants.Mysql.Dev.username);
        System.out.println(DatabaseConstants.Mysql.Dev.password);

        System.out.println(DatabaseConstants.Mysql.Prod.username);
        System.out.println(DatabaseConstants.Mysql.Prod.password);

        //oracle prod, dev
        System.out.println(DatabaseConstants.Oracle.Dev.username);
        System.out.println(DatabaseConstants.Oracle.Dev.password);

        System.out.println(DatabaseConstants.Oracle.Prod.username);
        System.out.println(DatabaseConstants.Oracle.Prod.password);
        //mongo prod, dev
        System.out.println(DatabaseConstants.MongoDb.Dev.username);
        System.out.println(DatabaseConstants.MongoDb.Dev.password);

        System.out.println(DatabaseConstants.MongoDb.Prod.username);
        System.out.println(DatabaseConstants.MongoDb.Prod.password);
    }
}
