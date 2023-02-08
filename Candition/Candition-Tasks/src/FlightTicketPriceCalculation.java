public class FlightTicketPriceCalculation {

    public static void main(String[] args) {
        int age = Util.intInput("Yaşınızı daxil edin: ");
        double km = Util.intInput("Mesafeni daxil edin: ");
        int cmd = Util.intInput("Səfər tipini müəyyən edin:" +
                "\n 1. Tək gediş" +
                "\n 2. Gediş-dönüş" +
                "\n Seçimizin qarşısındakı nömrəni daxil edin:");

        double price = km * 0.1;
        double finalPrice;
        if (age >= 0 && km >= 0 && (cmd == 1 || cmd == 2)){
            if (age<=12){
                price=price*0.5;
            } else if (age>12 && age<=24) {
                price=price*0.9;
            } else if (age>=65) {
                price=price*0.7;
            }

            if (cmd==2){
                price=(price*0.8)*2;
            }
        }else{
            System.out.println("Yanlış dəyər");
        }
        System.out.println("Toplam ödəniş: " + price);

    }

}
