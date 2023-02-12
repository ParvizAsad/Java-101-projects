public class RecursivePow {
    public static void main(String[] args) {
        int base = Util.intInput("Ədədi daxil edin: ") ;
        int exponent =Util.intInput("üstü ədədini daxil edin: ");

        System.out.println(base +" üstü " + exponent+" = " + recursivePow(base,exponent));
    }
    static int recursivePow(int b, int e){
        int result=0;
        int c=0;
        if (e==0){
            result=1;
        }
        else if (e==1){
            result=b;
        }else if (e>1){
                 c= e-1;
                result=b*recursivePow(b,e-1);
        }
        return result;
    }


}
