# Student Management System

This project is configured to use **JDK 17.0.17 (Oracle)** located at `/usr/lib/jvm/jdk-17.0.17-oracle-x64`.

## Prerequisites

- JDK 17.0.17 Oracle installed at `/usr/lib/jvm/jdk-17.0.17-oracle-x64`
- Maven 3.6+ (included via Maven Wrapper)

## Building the Project

### Option 1: Using the convenience script (Recommended)
```bash
./mvnw-jdk17.sh clean install
```

### Option 2: Setting JAVA_HOME manually
```bash
export JAVA_HOME=/usr/lib/jvm/jdk-17.0.17-oracle-x64
export PATH=$JAVA_HOME/bin:$PATH
./mvnw clean install
```

## Running the Application

```bash
./mvnw-jdk17.sh spring-boot:run
```

Or with manual JAVA_HOME:
```bash
export JAVA_HOME=/usr/lib/jvm/jdk-17.0.17-oracle-x64
export PATH=$JAVA_HOME/bin:$PATH
./mvnw spring-boot:run
```

## IntelliJ IDEA Configuration

The project is configured with:
- Project SDK: JDK 17
- Language Level: Java 17
- Maven Compiler: Java 17 (source/target/release)

IntelliJ IDEA should automatically detect the JDK configuration from:
- `.idea/misc.xml` - Project SDK settings
- `~/.m2/toolchains.xml` - Maven toolchains configuration
- `pom.xml` - Maven compiler plugin settings

## Project Structure

- `src/main/java/tn/esprit/studentmanagement/` - Main application code
  - `controllers/` - REST Controllers
  - `entities/` - JPA Entities
  - `repositories/` - Data repositories
  - `services/` - Business logic services
- `src/main/resources/` - Application configuration
- `src/test/java/` - Test classes

## Maven Configuration

The project uses:
- Spring Boot 3.5.5
- Java 17
- Maven Compiler Plugin 3.11.0 with explicit Java 17 configuration
- Maven Toolchains for JDK path resolution

