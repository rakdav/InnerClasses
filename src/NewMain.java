public class NewMain
{
    public static void main(String[] args) {
        int[] x={1,2,3,4,5};
        class Power
        {
            private final int n;
            public Power(int nval) {
                this.n = nval;
            }
            private int Compute(int x){
                int res=1;
                for (int i=0;i<n;i++) res*=x;
                return res;
            }
        }

        Power d3=new Power(3);
        for (int item:x)
        {
            System.out.println(d3.Compute(item));
        }
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
