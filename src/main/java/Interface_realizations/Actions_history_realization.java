package Interface_realizations;

import Interfaces.Actions_history;

import java.util.ArrayList;

public class Actions_history_realization implements Actions_history {

    public ArrayList<String> past_user_actions = new ArrayList<>();


    @Override
    public boolean read_history() {
        for (int i = 0; i < past_user_actions.size();i++){
            System.out.println(past_user_actions.get(i));
        }
        return false;
    }

    @Override
    public boolean clean_history() {
        past_user_actions.clear();
        add_into_history("History of actions has been cleaned");
        return false;
    }

    @Override
    public boolean add_into_history(String action) {
        past_user_actions.add(action);
        return false;
    }
}
