public class _90 {
    public int fibonacci(int n){
        int first=0;
        int second=1;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=first+second;
            int temp= second;
            second=sum;
            first=temp;
        }
        return sum;
    }
    public int climbStairs(int n) {
        return fibonacci(n);
    }
    public static void main(String[] args){
        _90 obj= new _90();
        System.out.println(obj.climbStairs(5));
    }
}
