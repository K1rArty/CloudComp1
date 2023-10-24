FROM openjdk:21
COPY . /java
WORKDIR /java
RUN javac ToDoListApplication.java
LABEL authors="Admin"

ENTRYPOINT ["top", "-b"]