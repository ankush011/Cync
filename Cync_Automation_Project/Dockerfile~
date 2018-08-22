FROM ubuntu:14.04
RUN apt-get update && apt-get install -y \
    openjdk-8-jre \
    openjdk-8-jdk  \
	maven
COPY . /app

CMD mvn clean -X /app/Cync_Automation_Project
