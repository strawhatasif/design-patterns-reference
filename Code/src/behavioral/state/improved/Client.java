package behavioral.state.improved;


public class Client {

    public static void main(String[] args) throws Exception {
        TCPConnection connection = new TCPConnection();
        connection.open();

        connection.acknowledge();
        connection.close();

        // If you uncomment connection.acknowledge(),
        // you will get an exception as you cannot acknowledge
        // a connection after it is closed

        //connection.acknowledge();
    }

}
