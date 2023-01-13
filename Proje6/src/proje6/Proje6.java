package proje6;

public class Proje6 {
    
    static int min(int num1, int num2){
            int minValue = num1 < num2 ? num1 : num2;
            return minValue;
        }

    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = min(2,3);
        int n2 = min(9,6);
        System.out.println(n1);
        System.out.println(n2);
    }
    
}
