package example;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;



public class Hello implements RequestHandler<Request, Response> {
  public Response handleRequest(Request request, Context context) {
    LambdaLogger lambdaLogger=context.getLogger();

    lambdaLogger.log("function name ="+context.getFunctionName());




    Response response=new Response();
    response.setBody("Everything is Ohkay in prod");
    response.setStatus_code(200);
    response.setStage("stage id"+request.getId());
    return response;
  }
}

//test
/*
{
    "id": "108902"
}*/
