import Connection.DB_connection;
import Interface_realizations.Admin_interface_realization;
import org.junit.jupiter.api.*;

import java.sql.SQLException;

public class Admin_interface_realization_test {
    Admin_interface_realization admin_interface_realization = new Admin_interface_realization();
    @BeforeEach
    @DisplayName("Create an instance of Interface_realizations.Admin_interface_realization for each CRUD related test")
    public void CreateAnInstanceOfAdmin_interface_realization() {
//to be continued
    }

    @Test
    @DisplayName("Test to see if connection to database was successful")
    public void ReturnTrueWhenConnectedToDataBase() throws SQLException {
        DB_connection.Connect_to_database();
        Assertions.assertEquals(1, DB_connection.getJunit_testing_integer());
    }

    @Test
    @DisplayName("Testing Welcome_statment()")
    public void ReturnStringTrueIfWelcome_statmentMethodWorks(){

        Assertions.assertEquals("true",admin_interface_realization.Welcome_statment());
    }

    @Test
    @DisplayName("Testing add_user()")
    public void ReturnStringTrueIfadd_userMethodWorks(){

    }

    @Test
    @DisplayName("Testing show_table()")
    public void ReturnStringTrueIfshow_tableMethodWorks(){

    }
    @Test
    @DisplayName("Testing update_values()")
    public void ReturnStringTrueIfupdate_valuesMethodWorks(){

    }

}
