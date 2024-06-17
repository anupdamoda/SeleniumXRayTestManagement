FROM maven:3.8.4-jdk-11

# Set the working directory in the container
WORKDIR /usr/src/app

# Copy the current directory contents into the container at /usr/src/app
COPY . .

# Install any necessary packages and dependencies
RUN mvn dependency:resolve

# Default command to run when the container starts
CMD ["mvn", "clean", "compile", "test"]
