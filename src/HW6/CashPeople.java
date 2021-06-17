package HW6;

import java.util.HashMap;
import java.util.Map;

public class CashPeople {

    Map<Integer,People> cash = new HashMap<Integer, People>();

    public void addToCash(People people){
        cash.put(people.getId(), people );
    }

    public People getPeopleFromCash(int id){
        return cash.get(id);
    }

}
