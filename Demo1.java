

/**
 * InnerDemo1
 */

@FunctionalInterface
 interface Status {

    
    int A(int i);
    
    
}


// class B implements Status{

    
//     public int A(int i) {
//          i = 20;
//          return i;
//     }

// }

public class Demo1 {

    public static void main(String[] args) {
        
    //    Status obj1 = new Status()
    //      {
    //         public int A(int i){
    //             i = 20;
    //             return i+i;
    //         }

    //      };  

    //      int anss = obj1.A(20);
    //      System.out.println(anss);
        
        Status obj  = (int i) -> i;
        int ans = obj.A(20);
        System.out.println(ans);
        
        
            
        
    }
    
}
