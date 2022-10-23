public class ash{
    public static int terraform(int n,int a[],int b[]) {
        
        int max=Integer.MIN_VALUE;int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]<min){
                min=b[i];
            }
        }
        int count=max-min;
        return count;
    }
    public static void main(String[] args) {
        int[]a={2,3,2};
        int[]b={1,1,1};
        int c=terraform(3, a, b);
        System.out.println(c);
    }
}