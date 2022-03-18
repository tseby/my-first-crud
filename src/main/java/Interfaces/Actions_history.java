package Interfaces;

public interface Actions_history {

    boolean read_history();

    boolean clean_history();

    boolean add_into_history(String action);

}
