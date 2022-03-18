
import org.junit.jupiter.api.*;
import Interface_realizations.Actions_history_realization;

public class Actions_history_realization_test {

    Actions_history_realization history = new Actions_history_realization();

    @Test
    @DisplayName("Adding an element to the list test")
    public void AddToTheArraylistWorks() {
        history.add_into_history("Added 1 element");
        Assertions.assertEquals(1, history.past_user_actions.size());
    }

    @Test
    @DisplayName("Deleting an element form the list")
    public void DeleteAnElementFromTheList() {
        history.add_into_history("Added 2 elements");
        history.clean_history();
        Assertions.assertEquals(1, history.past_user_actions.size());
    }

    @Test
    @DisplayName("Reading the list of past actions")
    public void ReadingTheListOfPastActions(){
        //idk how to test the sout yet
    }

}
