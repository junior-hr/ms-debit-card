FROM openjdk:11
VOLUME /tmp
EXPOSE 8083
ADD ./target/ms-debit-card-0.0.1-SNAPSHOT.jar debit-card.jar
ENTRYPOINT ["java","-jar","/debit-card.jar"]