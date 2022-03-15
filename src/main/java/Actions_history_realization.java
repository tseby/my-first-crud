import Interfaces.Actions_history;

import java.util.ArrayList;


public class Actions_history_realization implements Actions_history {
    private String user_action;

    ArrayList<String> past_user_actions = new ArrayList<String>();

    @Override
    public boolean read_history() {

        return false;
    }

    @Override
    public boolean clean_history() {

        return false;
    }

    @Override
    public boolean add_into_history(String action) {
        past_user_actions.add(action);
        return false;
    }

    public String getUser_action() {
        return user_action;
    }

    public void setUser_action(String user_action) {
        this.user_action = user_action;
    }
}
