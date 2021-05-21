package ex010.Json;

//import Uur.JsonParser111;


import Uur.JsonParser111;

public class Main {
   static String json1;
    public static void main(String[] args) {
        String json = "{\n" +
                "  \"firstName\": \"John\",\n" +
                "  \"lastName\" : \"doe\",\n" +
                "  \"age\"      : 26.3\n" +
                "}";

//        Scanner temp = new Scanner(System.in);
//        String userName = temp.nextLine();
//        System.out.println(userName);
//        System.out.println(json);

        JsonParser111.jsonPars(json);
//        JsonParser111.jsonPars(json1);

    }

}
