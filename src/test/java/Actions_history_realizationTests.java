
import Connection.DB_connection;
import org.junit.jupiter.api.*;

import java.sql.SQLException;

public class Actions_history_realizationTests {
    DB_connection connection;

    @BeforeEach
    public void test() {
    }


    private static int meme = 100;

    @Test
    @Disabled
    @DisplayName("Test to see if connection to database was successful")
    public void ReturnTrueWhenConnectedToDataBase() throws SQLException {
        DB_connection.Connect_to_database();
        Assertions.assertEquals(1, connection.getJunit_testing_integer());
    }


}
