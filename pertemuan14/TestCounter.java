package pertemuan14;

//TestCounter.java
public class TestCounter {
 public static void main(String[] args) {
     System.out.println("Initial instance count: " + Counter.getInstanceCount());
     
     Counter c1 = new Counter();
     Counter c2 = new Counter();
     Counter c3 = new Counter();
     
     System.out.println("Current instance count: " + Counter.getInstanceCount());
     
     Counter c4 = new Counter();
     System.out.println("Final instance count: " + Counter.getInstanceCount());
 }
}