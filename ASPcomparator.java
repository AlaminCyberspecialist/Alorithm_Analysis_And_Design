import java.util.Comparator;
public class ASPcomparator implements Comparator<ActivitySelection>{

    @Override
    public int compare(ActivitySelection o1, ActivitySelection o2) {
        // TODO Auto-generated method stub
        return o1. getFinish() - o2.getFinish();
    }

 
 
    


}
