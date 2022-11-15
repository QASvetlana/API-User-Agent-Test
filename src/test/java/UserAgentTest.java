import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserAgentTest {
    @Test
    public void testUserAgent() {
        String name = "Username";

        JsonPath response = RestAssured
                .given()
                .queryParam("Mozilla\\/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit\\/537.36 (KHTML, like Gecko) Chrome\\/107.0.0.0 Safari\\/537.36\",\"platform\":\"Web\",\"browser\":\"Chrome\",\"device\":\"No\"", name)
                .get("https://playground.learnqa.ru/ajax/api/user_agent_check")
                .jsonPath();

        String answer = response.getString("user_agent");
        System.out.println(answer);

       // assertEquals("user_agent + name, answer,")


    }
}
