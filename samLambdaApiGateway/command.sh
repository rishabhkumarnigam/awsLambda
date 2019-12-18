# create an S3 bucket
aws s3 mb s3://rishabh-code-sam

# we need to package our cloudformation
#it will upload artifacts to s3 bucket and generated transformed yml file
aws cloudformation package --s3-bucket rishabh-code-sam  --template-file template.yml --output-template-file generated/gen-template.yml

#instead of aws cloudformation package we could have used sam package
#the generated file is exactly same except the code uri is referencing s3 bucket

#deploy our template
aws cloudformation deploy --template-file generated/gen-template.yml --stack-name hello-world-sam --capabilities CAPABILITY_IAM


