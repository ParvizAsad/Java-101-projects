public class NativePow {
    public static void main(String[] args) {
        int base = Util.intInput("Hansi ədədi yoxlamaq istəyirsiniz?");
        int exponent = Util.intInput("Yoxlamaq istədiyiniz  qüvvəti daxil edin:");
        System.out.println(base + " ədədi = "+ exponent+ " üstü "+nativePow(base,exponent) +  "."  );
    }

    static int nativePow(int base,int exponent ){
        int mod = 0;
        int tempNum;
        boolean continues = true;
        int count = 0;
        while (continues) {
            mod = base % exponent;
            if (mod == 0) {
                count++;
                base = base/exponent;
            } else if (mod!=0) {
                continues=false;
            }
        }

        return count;
    }
}
