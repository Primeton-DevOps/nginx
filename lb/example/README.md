# Usage  
  
`mvn clean package`  
  
`# Copy target/bootstrap.jar to target machine`  
`# 8080`  
`java -jar bootstrap.jar`  
`# 8081`  
`java -Dspring.profile.active=dev -jar bootstrap.jar`  
`# 8082`  
`java -Dspring.profile.active=test -jar bootstrap.jar`