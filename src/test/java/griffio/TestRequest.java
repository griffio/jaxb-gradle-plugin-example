package griffio;

import griffio.request.Request;
import org.junit.Test;

import java.util.UUID;

import static java.lang.String.valueOf;

public class TestRequest {

  @Test
  public void request() throws Exception {
    Request request = new Request();
    request.setReqId(valueOf(UUID.randomUUID()));
  }

}
