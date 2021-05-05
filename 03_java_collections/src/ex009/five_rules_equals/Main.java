package ex009.five_rules_equals;

public class Main {
    public static void main(String[] args) {
        //1.reflaction
        String x = "r";
//       assert x.equals(x) != true;
//        assert 2+2 == 4;
        System.out.println(x.equals(x));

        //2.semetrions
        String y = "r";
        if (x.equals(y)){
            System.out.println(y.equals(x));
        }

        //3.переносимость
        String z = "r";
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
