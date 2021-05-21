package Uur;

public class JsonParser111 {
    /**
     * Example arg js:
     * {
     * "firstName": "John",
     * "lastName" : "doe",
     * "age"      : 26.3
     * }
     **/
    public static void jsonPars(String js) {

        if (js != null) {
            int index1 = js.indexOf("\"");
            int index2 = js.indexOf(":");
            int index3 = js.indexOf(",");
            int index4 = js.indexOf("}");


            String firstKey = js.substring(index1 + 1, index2 - 1);
            String firstValue = js.substring(index2 + 3, index3 - 1);
            for (int i = 0; i < 5; i++) {
                System.out.println(js.charAt(index2+i));



            }

            System.out.println(firstKey);
            System.out.println(firstValue);
        }
    }

}

