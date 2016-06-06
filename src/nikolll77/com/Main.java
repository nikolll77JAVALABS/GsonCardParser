package nikolll77.com;

import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    public static void main(String[] args)throws Exception  {

        String textFromFile= new String(Files.readAllBytes(Paths.get("e:\\json.txt")));

        Gson gson = new GsonBuilder().create();
        JSON json = (JSON) gson.fromJson(textFromFile,JSON.class);

        System.out.println(json.name);
//        System.out.println(json.surname);
//        System.out.println(json.phones[0]+" "+json.phones[1]);
        System.out.println(json.sites[0]+" "+json.sites[1]);
        System.out.println(json.address.country);
        System.out.println(json.address.city);
        System.out.println(json.address.street);
   }
}
