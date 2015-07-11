package ws;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.OutputCapture;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest("server.port=0")
public class ApplicationTest {

    @Rule
    public OutputCapture output = new OutputCapture();

    private WebServiceTemplate webServiceTemplate = new WebServiceTemplate();

    @Value("${local.server.port}")
    private int serverPort;

    @Before
    public void setUp() {
        this.webServiceTemplate.setDefaultUri("http://localhost:" + this.serverPort
                + "/ws/");
    }

    @Test
    public void testgetAsesorRequest() throws IOException {
        ClassPathResource cpr = new ClassPathResource("requestGetAsesor.xml");
        StreamSource source = new StreamSource(cpr.getInputStream());
        StreamResult result = new StreamResult(System.out);

        this.webServiceTemplate.sendSourceAndReceiveToResult(source, result);
    }

}
