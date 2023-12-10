package L12.Ex19;

public class Ex19 {
    public static void main(String[] args){
        int a = 5;
        double sum = 0.0;

        for(int i=1;i<=a;i++){
            sum += Math.sqrt(i);
        }
        
        System.out.println(sum);
    }
}
