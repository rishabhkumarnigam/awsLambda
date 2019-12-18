/*
package example;

    import com.amazonaws.services.lambda.runtime.Context;
    import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
    import com.fasterxml.jackson.databind.JsonNode;
    import com.fasterxml.jackson.databind.ObjectMapper;

    import java.io.IOException;
    import java.io.InputStream;
    import java.io.OutputStream;
    import java.util.Optional;

public class LambdaApi implements RequestStreamHandler {

  public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context)
      throws IOException {
    ObjectMapper objectMapper =new ObjectMapper();
    final JsonNode event = objectMapper.readTree(inputStream);
    JsonNode body=event.findValue("body");
     JsonNode pathParameterMap = event.findValue("pathParameters");

    final String path1 = Optional.ofNullable(pathParameterMap).map(map1 -> map1.get("path1"))
        .map(JsonNode::asText).orElse(null);
  }
}

//test
*/
/*
{
    "id": "108902"
}*//*
*/
/*

*/
