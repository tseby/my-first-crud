package Interface_realizations;

import Interfaces.Actions_history;

import java.util.ArrayList;

public class Actions_history_realization implements Actions_history {
Admin_interface_realization admin_interface_realization = new Admin_interface_realization();
    public ArrayList<String> past_user_actions = new ArrayList<>();


    @Override
    public boolean read_history() {
        for (int i = 0; i < past_user_actions.size();i++){
            System.out.println(past_user_actions.get(i));
        }
        admin_interface_realization.Welcome_statment();
        return false;
    }

    @Override
    public boolean clean_history() {
        past_user_actions.clear();
        add_into_history("History of actions has been cleaned");
        admin_interface_realization.Welcome_statment();
        return false;
    }

    @Override
    public boolean add_into_history(String action) {
        past_user_actions.add(action);
        admin_interface_realization.Welcome_statment();
        return false;
    }
}
