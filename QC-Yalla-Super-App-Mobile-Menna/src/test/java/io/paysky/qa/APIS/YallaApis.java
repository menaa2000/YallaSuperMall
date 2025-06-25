package io.paysky.qa.APIS;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class YallaApis {

    @Test
    public void generateAdminOtp() {

        RestAssured.baseURI = "https://grey.paysky.io:7011";

        // Request payload
        String requestBody = "{\"username\":\"hassan.eid+2@paysky.io\",\"password\":\"1qaz!QAZ\",\"rememberMe\":false,\"otpId\":null,\"otpBtn\":\"Send OTP\"}";

        // API endpoint
        String endpoint = "/CMS2/api/Admin/GenerateAdminOtp";

        // Perform API request
        Response response = given()
                .header("content-type", "application/json")
                .body(requestBody)
                .when()
                .post(endpoint)
                .then()
                .extract()
                .response();

        // Validate response status code
        assertEquals(500, response.getStatusCode());

        // Print the response body (optional)
        System.out.println("Response Body: " + response.getBody().asString());

        // Add additional assertions based on the expected response
        // For example, you might want to check specific fields in the JSON response
        assertEquals("Success", response.jsonPath().getString("status"));
    }
}
