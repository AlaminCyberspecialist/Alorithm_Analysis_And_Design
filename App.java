import java.util.*;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
       
        ArrayList<ActivitySelection>list = new ArrayList<>();

        ActivitySelection act1 = new ActivitySelection();
        act1.setActivity("A1");
        act1.setStart(0);
        act1.setFinish(6);

        ActivitySelection act2 = new ActivitySelection();
        act2.setActivity("A2");
        act2.setStart(3);
        act2.setFinish(4);

        ActivitySelection act3 = new ActivitySelection();
        act3.setActivity("A3");
        act3.setStart(1);
        act3.setFinish(2);

        ActivitySelection act4 = new ActivitySelection();
        act4.setActivity("A4");
        act4.setStart(5);
        act4.setFinish(9);

        ActivitySelection act5 = new ActivitySelection();
        act5.setActivity("A5");
        act5.setStart(5);
        act5.setFinish(7);

        ActivitySelection act6 = new ActivitySelection();
        act6.setActivity("A6"); 
        act6.setStart(8);
        act6.setFinish(9);

        list.add(act1);
        list.add(act2);
        list.add(act3);
        list.add(act4);
        list.add(act5);
        list.add(act6);


        Collections.sort(list,new ASPcomparator());
        System.out.println("Selected Activities: ");


        int i = list.get(0).getFinish();
        System.out.print(list.get(0).getActivity()+" ");

        for(ActivitySelection a:list){
            if(i<a.getStart()){
                System.out.print(a.getActivity()+ " ");
                i = a.getStart();
            }
        }

    }
}
