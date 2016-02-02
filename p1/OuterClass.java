public class OuterClass {
    
    private int oci = 999;
    
    public class InnerClass {
        
        public InnerClass() { oci++; }
        
        public void print() {
            System.out.println("Inner: " + oci + "\n");
        }
    }
    
    public void print() {
        System.out.println("Outer: " + oci + "\n");
    }
}