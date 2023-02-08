public class FindHoroscopeApp {

    public static void main(String[] args) {

//        Qoç Burcu : 21 Mart - 20 Aprel
//        Buğa Burcu : 21 Aprel - 21 May
//        Əkizlər Burcu : 22 May - 22 Iyun
//        Xərçəng Burcu : 23 Iyun - 22 Iyul
//        Şir Burcu : 23 Iyul - 22 Avqust
//        Qız Burcu : 23 Avqust - 22 Sentyabr
//        Tərəzi Burcu : 23 Sentyabr - 22 Oktyabr
//        Əqrəb Burcu : 23 Oktyabr - 21 Noyabr
//        Yay Burcu : 22 Noyabr - 21 Dekabr
//        Oğlaq Burcu : 22 Dekabr - 21 Yanvar
//        Kova Burcu : 22 Yanvar - 19 Fevral
//        Balıq Burcu : 20 Fevral - 20 Mart
//


        System.out.println("ardicil olaaraq doğulduğunuz ayı və günü qeyd edin" +
                "\n məsələn: 12 iyun -da do]ulmusnuzsa aya-6, günə -12 qeyd edin");
        int month = Util.intInput("Doğulduğunuz ayın rəqəmlə ifadəsini daxil edin: ");
        int day = Util.intInput("Doğulduğunuz günün(rəqəmlə) ifadəsini daxil edin: ");
        if (month == 1) {
            if (day >= 1 && day <= 31) {
                System.out.println(day>=21 ? "Kova" :"Oğlaq");
            } else {
                System.out.println("Yanlış tarix!");
            }
        }
        else if (month == 2) {
                if (day >= 1 && day <= 29) {
                    System.out.println(day >= 20 ? "Balıq" : "Kova");
                } else {
                    System.out.println("Yanlış tarix!");
                }
        }
        else if (month == 3) {
            if (day >= 1 && day <= 31) {
                System.out.println(day>=21 ? "Qoç" :"Balıq");
            } else {
                System.out.println("Yanlış tarix!");
            }
        }
        else if (month == 4) {
            if (day >= 1 && day <= 31) {
                System.out.println(day>=21 ? "Buğa" :"Qoç");
            } else {
                System.out.println("Yanlış tarix!");
            }
        }
        else if (month == 5) {
            if (day >= 1 && day <= 31) {
                System.out.println(day>=22 ? "Əkizlər" :"Buğa");
            } else {
                System.out.println("Yanlış tarix!");
            }
        }
        else if (month == 6) {
            if (day >= 1 && day <= 31) {
                System.out.println(day>=23 ? "Xərçəng " :"Əkizlər");
            } else {
                System.out.println("Yanlış tarix!");
            }
        }
        else if (month == 7) {
            if (day >= 1 && day <= 31) {
                System.out.println(day>=23 ? "Şir" :"Xərçəng");
            } else {
                System.out.println("Yanlış tarix!");
            }
        }
        else if (month == 8) {
            if (day >= 1 && day <= 31) {
                System.out.println(day>=23 ? "Qız" :"Şir");
            } else {
                System.out.println("Yanlış tarix!");
            }
        }
        else if (month == 9) {
            if (day >= 1 && day <= 31) {
                System.out.println(day>=23 ? "Tərəzi" :"Qız");
            } else {
                System.out.println("Yanlış tarix!");
            }
        }
        else if (month == 10) {
            if (day >= 1 && day <= 31) {
                System.out.println(day>=23 ? "Əqrəb" :"Tərəzi");
            } else {
                System.out.println("Yanlış tarix!");
            }
        }
        else if (month == 11) {
            if (day >= 1 && day <= 31) {
                System.out.println(day>=22 ? "Yay" :"Əqrəb");
            } else {
                System.out.println("Yanlış tarix!");
            }
        }
        else if (month == 12) {
            if (day >= 1 && day <= 31) {
                System.out.println(day>=22 ? "Oğlaq" :"Yay");
            } else {
                System.out.println("Yanlış tarix!");
            }
        }
        else {
            System.out.println("Yanlış tarix!");
        }


    }

}
