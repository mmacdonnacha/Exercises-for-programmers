package exercise44;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AppTest 
{
    App app;
    String jsonFile;


    @Before
    public void before(){
        app = new App();
        jsonFile = "src\\test\\resources\\input.json";
    }

    @After
    public void after(){
        app = null;
        jsonFile = "";
    }

    @Test
    public void firstProductIsSame() throws Exception
    {
        Product expected = new Product("Widget", 25.00, 5);

        JSONObject jsonObject = app.readJsonFile(jsonFile);
        List<Product> actual = app.getProducts(jsonObject);

        assertEquals(expected, actual.get(0));
    }

    @Test
    public void secondProductIsSame() throws Exception
    {
        Product expected = new Product("Thing", 15.00, 5);
        
        JSONObject jsonObject = app.readJsonFile(jsonFile);
        List<Product> actual = app.getProducts(jsonObject);

        assertEquals(expected, actual.get(1));
    }

    @Test
    public void thirdProductIsSame() throws Exception
    {
        Product expected = new Product("Doodad", 5.00, 10);

        JSONObject jsonObject = app.readJsonFile(jsonFile);
        List<Product> actual = app.getProducts(jsonObject);

        assertEquals(expected, actual.get(2));
    }
    @Test
    public void listOfProductsAreSame() throws Exception
    {
        List<Product> expected = new ArrayList<>();
        expected.add(new Product("Widget", 25.00, 5));
        expected.add(new Product("Thing", 15.00, 5));
        expected.add(new Product("Doodad", 5.00, 10));

        JSONObject jsonObject = app.readJsonFile(jsonFile);
        List<Product> actual = app.getProducts(jsonObject);

        assertEquals(expected, actual);
    }
}