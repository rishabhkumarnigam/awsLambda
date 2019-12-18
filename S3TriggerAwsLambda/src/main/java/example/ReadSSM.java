package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagement;
import com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagementClientBuilder;
import com.amazonaws.services.simplesystemsmanagement.model.GetParameterRequest;

public class ReadSSM {
  public String handleRequest(Student student, Context context) {

    GetParameterRequest parameterRequest=new GetParameterRequest().withName("/my-store/dev/db-url").withWithDecryption(false);
    AWSSimpleSystemsManagement ssmClient= AWSSimpleSystemsManagementClientBuilder.defaultClient();


    return "";

  }

}
