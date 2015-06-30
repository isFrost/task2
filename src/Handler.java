import java.util.ArrayList;
import java.util.List;

/**
 * Created by isend_000 on 6/30/2015.
 */
public class Handler {

    public static List<Integer> handle(List<Integer> list){
        ArrayList<Integer> numbersToDelete = new ArrayList<>();
        for (Integer number : list){
            int count = 0;
            for (int j = 0; j < list.size(); j++){
                if (list.get(j) == number){
                    count++;
                    if (count >= 3){
                        numbersToDelete.add(number);
                    }
                }
            }
        }
        for (Integer n : numbersToDelete){
            for (int i = 0; i < list.size(); i++){
                if(n == list.get(i))
                    list.remove(i);
            }
        }
        return list;
    }

}
