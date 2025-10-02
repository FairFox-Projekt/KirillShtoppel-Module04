interface IDataBaseConnection {
    void Connect();
    void Disconnect();
    void ExecuteQuery (String query);
}
class MySqlConnection implements IDataBaseConnection {
    public void Connect() {
    }
    public void Disconnect() {
    }
    public void ExecuteQuery(String query) {
    }
}
class SqlServerConnection implements IDataBaseConnection {
    public void Connect() {
    }
    public void Disconnect() {
    }
    public void ExecuteQuery(String query) {
    }
}
class OracleConnection implements IDataBaseConnection {
    public void Connect() {
    }
    public void Disconnect() {
    }
    public void ExecuteQuery(String query) {
    }
}

class DataBaseConnectionFactory {
    public IDataBaseConnection CreateConnection(String connType) {
        if (connType == "mysql") {
            return new MySqlConnection();
        }
        else if (connType == "sqlserver") {
            return new SqlServerConnection();
        }
        else {
            return new OracleConnection();
        }
    }
}

