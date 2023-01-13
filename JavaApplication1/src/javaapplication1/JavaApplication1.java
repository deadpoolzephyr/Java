package javaapplication1;

public class JavaApplication1 extends T implements D{
    
    public int g(){return 2;}
    public int f(){return 8;}
    
    public int l(){return 17;}
    public static void main(String[] args) {
        
        JavaApplication1 a = new JavaApplication1();
        System.out.println(a.g());
        System.out.println(a.f());
        System.out.println(a.l());
    }
    
}
