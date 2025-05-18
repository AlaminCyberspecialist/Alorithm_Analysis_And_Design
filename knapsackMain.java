 
 import java.util.*;
 
import java.util.Collections;
public class knapsackMain {
    public static void main(String[] args) throws Exception {
        
  ArrayList<itemValue>list = new ArrayList<>();

  itemValue i1 = new itemValue();
  
  i1.setObject(1);
  i1.setProfit(12);
  i1.setWeight(3);

  itemValue i2 = new itemValue();
  
  i2.setObject(2);
  i2.setProfit(5);
  i2.setWeight(1);

  itemValue i3 = new itemValue();
  
  i3.setObject(3);
  i3.setProfit(16);
  i3.setWeight(4);

  itemValue i4 = new itemValue();
  
  i4.setObject(4);
  i4.setProfit(7);
  i4.setWeight(2);

  itemValue i5 = new itemValue();
  
  i5.setObject(5);
  i5.setProfit(9);
  i5.setWeight(9);

  itemValue i6 = new itemValue();
  
  i6.setObject(6);
  i6.setProfit(11);
  i6.setWeight(4);

  itemValue i7 = new itemValue();
  
  i7.setObject(7);
  i7.setProfit(6);
  i7.setWeight(3);

  list.add(i1);
  list.add(i2);
  list.add(i3);
  list.add(i4);
  list.add(i5);
  list.add(i6);
  list.add(i7);


  Collections.sort(list,new knapsackComparator());

  int capacity = 15;
  double totalVal = 0;

  for(itemValue i:list){

    int curWeight = i.getWeight();
    int curVal = i.getProfit();

    if(capacity - curWeight >=0){
        capacity -=curWeight;
        totalVal+=curVal;
    }
    else{
        double frac = ((double)capacity/(double)curWeight);
        totalVal +=(frac*curVal);
        break;
    }
  }
  System.out.println(" Total profit:"+totalVal);


    


    }


    
}
