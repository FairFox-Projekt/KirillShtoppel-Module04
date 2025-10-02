public class BonusExecution {
    public static void main(String[] args) {
        DataBaseConnectionFactory factory = new DataBaseConnectionFactory();
        IDataBaseConnection mySqlConnection = factory.CreateConnection("mysql");
    }
}
