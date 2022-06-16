package uz.example;

import com.google.gson.*;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
//        Gson gson = new Gson();
//        File file = new File("user.txt");
//
//        FileReader reader=new FileReader(file);
//        JsonParser parser=new JsonParser();
//        Object obj=parser.parse(reader);
//        JsonObject jsonObject=(JsonObject) obj;
//
//        String username= jsonObject.get("username").getAsString();
//        String lastName=jsonObject.get("lastName").getAsString();
//        String firstName=jsonObject.get("firstName").getAsString();
//        int age=jsonObject.get("age").getAsInt();
//
//        System.out.println(username+" "+lastName+" "+firstName+" "+age);
        
//        Gson gson=new Gson();
//        File file=new File("valyuta.txt");
//        FileReader reader=new FileReader(file);
//        JsonParser parser=new JsonParser();
//        Object obj=parser.parse(reader);
//
//        JsonArray array=(JsonArray) obj;
//
//        for (int i = 0; i < array.size(); i++) {
//            JsonObject jsonObject=array.get(i).getAsJsonObject();
//
//            long id=jsonObject.get("id").getAsLong();
//            String code=jsonObject.get("Code").getAsString();
//            String Ccy=jsonObject.get("Ccy").getAsString();
//            String CcyNm_RU=jsonObject.get("CcyNm_RU").getAsString();
//            String CcyNm_UZ=jsonObject.get("CcyNm_UZ").getAsString();
//            String CcyNm_UZC=jsonObject.get("CcyNm_UZC").getAsString();
//            String CcyNm_EN=jsonObject.get("CcyNm_EN").getAsString();
//            String Nominal=jsonObject.get("Nominal").getAsString();
//            String Rate=jsonObject.get("Rate").getAsString();
//            String Diff=jsonObject.get("Diff").getAsString();
//            String Date=jsonObject.get("Date").getAsString();
//
//            System.out.println(id+'\n'+code+'\n'+Ccy+'\n'+CcyNm_EN+" " +
//                    ""+CcyNm_RU+" "+CcyNm_UZ+" "+CcyNm_UZC+'\n'+Nominal+
//                    '\n'+Rate+'\n'+Diff+'\n'+Date);
//
//
//        }


//        Gson gson=new Gson();
//        BufferedReader reader=new BufferedReader(new FileReader("user.txt"));
//
//        User o=gson.fromJson(reader,User.class);
//        System.out.println(o);

//        Gson gson=new Gson();
//        BufferedReader reader=new BufferedReader(new FileReader("valyuta.txt"));
//        ArrayList objects=gson.fromJson(reader, ArrayList.class);
//
//        for (Object object : objects) {
//            System.out.println(object);
//        }
//
//        Gson gson=new GsonBuilder().setPrettyPrinting().create();
//        JsonObject jsonObject=new JsonObject();
//        FileWriter fileWriter=new FileWriter(new File("user.txt"),true);
//
//        jsonObject.addProperty("username","eshmat1");
//        jsonObject.addProperty("firstName","Eshmat");
//        jsonObject.addProperty("lastName","Toshmatov");
//        jsonObject.addProperty("age",22);
//
//        fileWriter.write(gson.toJson(jsonObject));
//        fileWriter.close();


    }
}