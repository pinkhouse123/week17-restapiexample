package com.restapiexample.dummy.gorestinfo;

import com.restapiexample.dummy.model.EmployeeUpdatePojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PutTestForUpdateRecord extends TestBase {
    @Test
    public void updateRecord() {
        EmployeeUpdatePojo employeeUpDatePojo= new EmployeeUpdatePojo();
        employeeUpDatePojo.setId(21);
        employeeUpDatePojo.setEmployee_name("dhyani");
        employeeUpDatePojo.setEmployee_salary(50000);
        employeeUpDatePojo.setProfile_image("");
        employeeUpDatePojo.setEmployee_age(23);
        Response response = given()
                .header("Content-Type","application/json")
                .body(employeeUpDatePojo)
                .when()
                .put("/update/25");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}