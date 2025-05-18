 
import java.util.Comparator;
public class knapsackComparator implements Comparator<itemValue>  {

    @Override
    public int compare(itemValue o1, itemValue o2) {
        // TODO Auto-generated method stub
       double cpr1,cpr2;
       cpr1 = new Double(o1.getProfit()/o1.getWeight());
       cpr2 = new Double(o2.getProfit()/o2.getWeight());

       if(cpr1>cpr2){
        return -1;
       }
       else if(cpr2>cpr1){
        return 1;
       }
       
       else{
        return 0;
       }
        
    }

    // @Override
    // public int compare(itemValue o1, itemValue o2) {
    //     // TODO Auto-generated method stub


    //     double cpr1,cpr2;
    //     cpr1 = new Double (o1.getProfit()/o2.getWeight());
    //     cpr2 = new Double(o2.getProfit()/o2.getWeight());
    //     if(cpr1 < cpr2){
    //         return 1;

    //     }
    //      else
    //          return 0;
    
         
    // }

    
    
    
}
