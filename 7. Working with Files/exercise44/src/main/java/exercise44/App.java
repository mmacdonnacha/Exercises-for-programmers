package exercise44;

import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class App {
    public static void main(String[] args) {
        App app = new App();
        String filename = "src\\main\\resources\\input.json";
        List<Product> products;
        Scanner scan = new Scanner(System.in);
        boolean found = false;

        try{
            JSONObject jsonObject = app.readJsonFile(filename);
            products = app.getProducts(jsonObject);

            while(!found){
                System.out.print("What is the product name? ");
                String itemName = scan.nextLine();
                
                found = app.findProduct(products, itemName);
            }
            scan.close();
        }catch(ParseException e){
            System.out.println("ParseException\n\t" + e.getMessage());
        }catch(Exception e) {
        	System.out.println("Exception\n\t" + e.getMessage());
        }

    }

    public JSONObject readJsonFile(String filename) throws Exception {
        FileReader reader = new FileReader(filename);
        JSONParser jsonParser = new JSONParser();
        return (JSONObject) jsonParser.parse(reader);
    }


    public List<Product> getProducts(JSONObject jsonObj){
        List<Product> products = new ArrayList<>();
        JSONArray jsonArray = (JSONArray) jsonObj.get("products");
        
        @SuppressWarnings("unchecked")
        Iterator<JSONObject> iterator = jsonArray.iterator();
        
        while (iterator.hasNext()) {
            JSONObject jsObj = iterator.next();
                
        
	        String name  = (String) jsObj.get("name");
	        Double price = (Double) jsObj.get("price");
            int quantity = Integer.parseInt(jsObj.get("quantity").toString());
                
            Product p = new Product(name, price, quantity);
            products.add(p);
        }

        return products;
    }

    public boolean findProduct(List<Product> products, String itemName){
        for(Product prod : products){
            if (prod.getName().equals(itemName)){
                System.out.println(prod);
                return true;
            }
        }

        System.out.println("Sorry, that product was not found in our inventory.");
        return false;
    }
}