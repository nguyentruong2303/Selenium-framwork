package testdata;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import org.apache.poi.ss.formula.functions.T;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonDataReader {
    public String strUsername, strPassword;
    public String Title,  FirstName,  LastName,  Dob,  Ssn,
     Email,Password, ConfirmPW,  Address, Locality,  Region,  PostalCode,  Country,
     HomePhone,  MobilePhone,  WorkPhone;

    public void JsonReader() throws IOException, ParseException {
        String filePath = System.getProperty("user.dir") + "/src/main/java/testdata/DBankTestData.json";
        File srcFile = new File(filePath);
        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader(srcFile));
        for (Object jsonObj : jsonArray) {
            JSONObject person = (JSONObject) jsonObj;

            strUsername = (String) person.get("strUsername");
            System.out.println(strUsername);

            strPassword = (String) person.get("strPassword");
            System.out.println(strPassword);

            Title = (String) person.get("Title");
            System.out.println(Title);

            FirstName = (String) person.get("FistName");
            System.out.println(FirstName);

            LastName = (String) person.get("LastName");
            System.out.println(LastName);

            Dob = (String) person.get("Dob");
            System.out.println(Dob);

            Ssn = (String) person.get("Ssn");
            System.out.println(Ssn);

            Email = (String) person.get("Email");
            System.out.println(Email);

            Password = (String) person.get("Password");
            System.out.println(Password);

            ConfirmPW = (String) person.get("ConfirmPW");
            System.out.println(ConfirmPW);

            Address = (String) person.get("Address");
            System.out.println(Address);

            Locality = (String) person.get("Locality");
            System.out.println(Locality);

            Region = (String) person.get("Region");
            System.out.println(Region);

            PostalCode = (String) person.get("PostalCode");
            System.out.println(PostalCode);

            Country = (String) person.get("Country");
            System.out.println(Country);

            HomePhone = (String) person.get("HomePhone");
            System.out.println(HomePhone);

            MobilePhone = (String) person.get("MobilePhone");
            System.out.println(MobilePhone);

            WorkPhone = (String) person.get("WorkPhone");
            System.out.println(WorkPhone);
        }
    }
}
