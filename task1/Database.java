package task1;

public class Database {
   private static Database instance;
    private static Connection connection;
    private static String connectionUrl="jdbc:mysql://localhost:3306/assignment5?useUnicode=true&serverTimezone=UTC";
    private Database(){

    }
    public static Database getInstance(){
        if(instance==null){
            instance=new Database();
            query("Selected...");
        }
        return instance;
    }
    public static void query(String sql) {
        try{
            Class.forName("org.mysql.Driver");
            connection=DriverManager.getConnection(connectionUrl,"com.mysql.cj.jdbc.Driver","gift111");
            System.out.println("Connected");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
