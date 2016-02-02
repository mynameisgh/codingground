public class HelloWorld{

     public static void main(String []args){
        OuterClass oc = new OuterClass();
        oc.print();
        
        OuterClass.InnerClass ic1 = oc.new InnerClass();
        oc.print();
        ic1.print();
        
        OuterClass.InnerClass ic2 = oc.new InnerClass();
        oc.print();
        ic2.print();
        
        OuterClass.InnerClass ic3 = oc.new InnerClass();
        oc.print();
        ic3.print();
        
     }
}
