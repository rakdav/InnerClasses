public class Math
{
    public static class Factorial{
        private long result;
        private int key;

        public Factorial(long r, int k) {
            this.result = r;
            this.key = k;
        }

        public long getResult() {
            return result;
        }

        public int getKey() {
            return key;
        }
    }
    public static Factorial getFactorial(int x){
        int result=1;
        for(int i=1;i<=x;i++) result*=i;
        return new Factorial(result,x);
    }
}
