import java.util.ArrayList;
import java.util.List;

public class Test {

    private static final String ME = "hehe";

    public static void main(String[] args) {
        String[] arr = new String[]{"aaa","bbb","ccc"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        List list = new ArrayList();
        list.add(1111);
        list.add(2222);

        //ifn
        if (list == null) {

        }

        //inn
        if (list != null) {

        }

        for (Object o : list) {
            
        }

        for (int i = 0; i < list.size(); i++) {
            
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
                
    }
}
