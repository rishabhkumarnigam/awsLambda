package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.Bucket;

import java.util.List;

public class Hello implements RequestHandler<Student, String> {
  public String handleRequest(Student request, Context context) {

    LambdaLogger lambdaLogger = context.getLogger();
    lambdaLogger.log("first line");

    int i = 0;
    for (Bucket bucket : printAllBucketFromS3()) {
      lambdaLogger.log("Bucket " + ++i + " name =" + bucket.getName());
    }

    return "done";
  }

  public List<Bucket> printAllBucketFromS3() {


    AmazonS3Client amazonS3Client = new AmazonS3Client();
    return amazonS3Client.listBuckets();
  }
}

//test
/*
{
    "id": "108902"
}*/
