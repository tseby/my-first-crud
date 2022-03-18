import Interfaces.Actions_history;
import org.junit.jupiter.api.*;

public class Actions_history_realization {

    @Test
    @BeforeAll
    @DisplayName("Adding an element in the arrayList")
    public void AddingAnElement() {

    }


    @Test
    @DisplayName("Adding an element to the list test")
    public void AddToTheArraylistWorks() {
        Actions_history.add_into_history("Added 1 element");
        Assertions.assertEquals(1, Actions_history.past_user_actions.size());
    }

    @Test
    @DisplayName("Deleting an element form the list")
    public void DeleteAnElementFromTheList() {
        Actions_history.add_into_history("Added 1 element");
        Actions_history.add_into_history("Added 2 elements");
        Actions_history.clean_history();
        Assertions.assertEquals(1, Actions_history.past_user_actions.size());
    }


}
