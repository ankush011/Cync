# Use the latest image from UBUNTU installed in the machine
FROM ubuntu:latest

# Update ubuntu system
RUN apt-get update

# Install java version on ubuntu-selenium image
RUN apt-get install -y default-jdk
RUN apt-get install -y default-jre

# Install maven on ubuntu-selenium image
RUN apt-get install -y maven

# Install git on ubuntu-selenium image
RUN apt-get install -y git



#copy
COPY . /home/likewise-open/IDEXCEL/sankush/cync/Cync_Automation_Project

# Run the maven command to execute all the tests
WORKDIR "/home/likewise-open/IDEXCEL/sankush/cync/Cync_Automation_Project"
RUN ls -al
CMD mvn clean install test
