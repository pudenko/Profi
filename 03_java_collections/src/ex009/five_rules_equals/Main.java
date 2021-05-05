package ex009.five_rules_equals;

public class Main {
    public static void main(String[] args) {
        //1.reflaction
        String x = "r";
        String y = "r";
        String z = "r";

        System.out.println(x.equals(x));

        //2.semetrions
        if (x.equals(y)){
            System.out.println(y.equals(x));
        }

        //3.переносимость
        if (x.equals(y) && y.equals(z)){
            System.out.println(x.equals(z));
        }

        //4.Консистентность
        if (x.equals(y)){
            System.out.println(x.equals(y));
        }

        //5.equals null
        System.out.println(x.equals(null) == false);
    }

}
