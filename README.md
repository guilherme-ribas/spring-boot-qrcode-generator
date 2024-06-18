# Spring Boot QR Code Generator

This project is a simple Spring Boot application that generates QR Codes using the ZXing library. It exposes a RESTful endpoint to generate QR Codes based on input text.

## Prerequisites

- Java 8 or higher
- Maven
- An IDE (IntelliJ IDEA, Eclipse, etc.) or a text editor

## Getting Started

### Cloning the Repository

Clone this repository to your local machine:

```bash
git clone https://github.com/your-username/spring-boot-qrcode-generator.git
```

### Building the Project
Navigate to the project directory and build the project using Maven:

```bash
cd spring-boot-qrcode-generator
mvn clean install
```

### Running the Application
You can run the application using the following Maven command:

```bash
mvn spring-boot:run
```

Alternatively, you can run the generated JAR file:


```bash
java -jar target/qrcode-generator-0.0.1-SNAPSHOT.jar
```

### Usage
Once the application is running, you can generate QR Codes by accessing the /generateQRCode endpoint.

### Example
To generate a QR Code with the text "HelloWorld", use the following URL:

```bash
http://localhost:8080/generateQRCode?text=HelloWorld
```

You can also specify the width and height of the QR Code:

```bash
http://localhost:8080/generateQRCode?text=HelloWorld&width=300&height=300
```

### Response
The response will be a PNG image of the generated QR Code.

### Dependencies
- Spring Boot Starter Web
- ZXing Core
- ZXing Java SE
