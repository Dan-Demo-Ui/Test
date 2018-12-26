package api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.equalTo;





public class ApiTest {

	@Test
	public void test1() {
		RestAssured.baseURI="https://maps.googleapis.com";
		given().
//	       param("location","-33.8670522,151.1957362").
//	       param("radius","500").
//	       param("key","AIzaSyDIQgAh0B4p0SdyYkyW8tlG-y0yJMfss5Y").
//	       when().
//	       get("/maps/api/place/nearbysearch/json").
//	       then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
//	       body("results[0].name",equalTo("Sydney"));
		queryParam("key","AIzaSyDIQgAh0B4p0SdyYkyW8tlG-y0yJMfss5Y").
		body("{"+
  "\"location\": {"+
    "\"lat\": -33.8669710,"+
    "\"lng\": 151.1958750"+
  "},"+
  "\"accuracy\": 50,"+
  "\"name\": \"Google Shoes!\","+
  "\"phone_number\": \"(02) 9374 4000\","+
  "\"address\": \"48 Pirrama Road, Pyrmont, NSW 2009, Australia\","+
  "\"types\": [\"shoe_store\"],"+
  "\"website\": \"http://www.google.com.au/\","+
  "\"language\": \"en-AU\""+
"}").
		when().
		post("/maps/api/place/add/json").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		body("status",equalTo("OK"));
		
		
		
	}
}
