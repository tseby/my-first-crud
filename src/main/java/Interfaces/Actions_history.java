package Interfaces;

import java.util.ArrayList;

public interface Actions_history {

    ArrayList<String> past_user_actions = new ArrayList<>();

    static boolean read_history(){
        for (int i = 0; i < past_user_actions.size();i++){
            System.out.println(past_user_actions.get(i));
        }
        return false;
    };

    static boolean clean_history(){
        past_user_actions.clear();
        add_into_history("History of actions has been cleaned");
        return false;
    };

    static boolean add_into_history(String action){
        past_user_actions.add(action);
        return false;
    };

}
