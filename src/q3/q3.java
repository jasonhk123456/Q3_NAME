package q3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<Integer, Integer> map = new HashMap<Integer,Integer>();
	   List<Integer> x1 = new ArrayList<Integer>();
	   List<Integer> result = new ArrayList<Integer>();

       map.put(0, 1);
       map.put(1, 2);
       map.put(2, 3);
       map.put(3, 6);
       map.put(4, 7);
       map.put(5, 14);
       
       x1.add(0);
       x1.add(1);
       x1.add(4);
       
       
      for(int i = 0; i <x1.size();i++){
    	  Iterator<Entry<Integer, Integer>> 
          iterator = map.entrySet().iterator(); 

    	  while (iterator.hasNext()) { 
    		  
              Entry<Integer, Integer> 
                  entry 
                  = iterator.next(); 
              if (x1.get(i) == entry.getKey()) { 
            	  result.add(Integer.valueOf(entry.getValue()));
              } 
          } 
    	  
     }
   	
      System.out.println("result:" + result);
      
	}

}
