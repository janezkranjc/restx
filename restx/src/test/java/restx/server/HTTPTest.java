package restx.server;

import com.google.common.base.Optional;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.*;


/**
 * User: xavierhanin
 * Date: 2/20/13
 * Time: 1:57 PM
 */
public class HTTPTest {
    @Test
    public void should_extract_charset() throws Exception {
        assertThat(HTTP.charsetFromContentType("text/html; charset=UTF-8")).isEqualTo(Optional.of("UTF-8"));
        assertThat(HTTP.charsetFromContentType("application/json; charset=ISO-8859-1")).isEqualTo(Optional.of("ISO-8859-1"));
        assertThat(HTTP.charsetFromContentType("application/json")).isEqualTo(Optional.<String>absent());
    }
}
