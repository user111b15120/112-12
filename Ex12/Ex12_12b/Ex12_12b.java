package L12.Ex12.Ex12_12b;

class Sum{
    private int sum = 0;
    public int add(int n){
        for(int i=1;i<=n;i++)
            sum += 1;
        return sum;
    }
}

public class Ex12_12b {
    Sum f = new Sum();
    System.out.println("Sum(5)= "+f.add(10));
}
