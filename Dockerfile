FROM openjdk:11
COPY target/StockPortfolioManager-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]