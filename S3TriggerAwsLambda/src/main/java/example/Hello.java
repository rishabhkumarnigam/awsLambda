package example;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
public class Hello implements RequestHandler<Student, String> {
  public String handleRequest(Student student, Context context) {
    LambdaLogger lambdaLogger=context.getLogger();
    lambdaLogger.log("function name ="+context.getFunctionName());
    lambdaLogger.log("environment working on ="+System.getenv("env"));

    return student.getId();
  }
}

//test
/*
{
    "id": "108902"
}*/
