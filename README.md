https://hub.docker.com/_/eclipse-temurin

How to gradle

https://docs.gradle.org/current/samples/sample_building_java_applications.html
https://docs.spring.io/spring-boot/gradle-plugin/packaging.html

Infra pre-req

regcred secrets for private registry access in each namespace
kubectl create secret docker-registry regcred --docker-server=<your-registry-server> --docker-username=<your-name> --docker-password=<your-pword> --docker-email=<your-email>


kubectl create secret tls NAME --cert=path/to/cert/file --key=path/to/key/file [--dry-run=server|client|none]
