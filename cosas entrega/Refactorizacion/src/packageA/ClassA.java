/*
 * ClassA.java
 *
 * 
 */

package packageA;

public class ClassA {
    
    double field;
     
    public ClassA() {        
    }
    
    public class SubClass {
        double subfield;
        public void subMethod() {            
        }
    }
    
    private packageA.SubClass g_variable;
    
    public void noReturn() {
       
        int a = 0;
        int b = 0;
        
        System.out.println(a+b);                
        
    }
        
    public void singleOutput() {        
        int a = 0;       
        int b = 0;     
        
        int c = 0;
        
        if(a==0) c = 0;
        
        System.out.println("c= "+c);                        
    }
    
    public void loop(int a) {
        String s= "";
        while(--a>0) {            
            
            if( a%3 != 0) {
                s = s+"--, ";
                
            }else{
                s = s+a+", ";
            }
           
            
        }
        if(s.endsWith(", ")) s=s.substring(0,s.length()-2);
        System.out.println(s);
        return;
                
    } 
    
    public packageA.SubClass global() {
        
        g_variable = new packageA.SubClass();
        
        return g_variable;        
    }
       
    
    public static void statMethod(int a) {
        int b=2;
        
        System.out.println(a+b);                
        
    }
            
    public int existing(int xx, int yy) {
        return 0;
    }
    
    public double existing2(int xx, int yy) {   
        return 0.0;    
    }
    
    public int existing3(int xx, int yy, int zz) {
        return 0;
    }
    
}
