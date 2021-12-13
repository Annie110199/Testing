import com.google.gson.Gson;
import net.javacrumbs.jsonunit.JsonAssert;
import org.hamcrest.Matcher;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;

import static java.lang.String.valueOf;
import static net.javacrumbs.jsonunit.JsonMatchers.jsonPartMatches;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContainingInAnyOrder;

class Request {
    String status;
    Request() {
        this.status = "success";
    }
}

public class MatcherTest {
    @Test
    public void testJsonPartMatches() {
        Request request = new Request();
        Gson gson = new Gson();
        String s = gson.toJson(request);
        System.out.println(s);
        assertThat(s, jsonPartMatches("status", is(valueOf("success"))));
    }

    @Test
    public void givenArray_whenCheck_thenContainInAnyOrder() {
        Integer[] array = new Integer[]{5, 2, 4, 7, 12, 0};
        assertThat(array, arrayContainingInAnyOrder(2, 7, 5, 12, 4, 0));
    }

}