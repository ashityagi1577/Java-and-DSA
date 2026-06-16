import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args){
        List<String>CodingLanguages=new ArrayList<>();
        
        //1. Add Elements
        CodingLanguages.add("Java");
        CodingLanguages.add("Python");
        CodingLanguages.add("C++");
        CodingLanguages.add("Javascript");
    
       //2. Add at a specific index
       CodingLanguages.add(1, "Rust");
       CodingLanguages.add(3,"Go");
    
      System.out.println(CodingLanguages);
    

      //3. Access and update
      System.out.println("the value at 2 index :" +CodingLanguages.get(2));
      CodingLanguages.set(2,"Anaconda");   //Change the value
      System.out.println(CodingLanguages);


      //4. Remove Elements
      CodingLanguages.remove(2);
      System.out.println(CodingLanguages);

      //5. Sort List
      Collections.sort(CodingLanguages);
      // CodingLanguages.sort(null);
      System.out.println(CodingLanguages);

      System.out.println("the size of the ArrayList is:" +CodingLanguages.size());
      

      //for each loop
      for(String s:CodingLanguages){
        System.out.println("Languages:"+s);
      }
    }
}


