
# Present

## Overview
**Present** is a Java-based application built using Maven.

## Project Structure
- `.idea/` - IntelliJ IDEA project settings.
- `pom.xml` - Maven configuration file.
- `present/` - Main application folder.
- `present.iml` - IntelliJ IDEA module file.
- `src/` - Source code directory containing the Java classes and resources.
- `tomcat.8080/` - Configuration or deployment folder for Apache Tomcat.

## Prerequisites
- **Java Development Kit (JDK)**: Version 8 or later.
- **Maven**: For managing dependencies and building the project.
- **Apache Tomcat**: For deploying the application.

## Setup and Deployment

### Clone the Repository
```bash
git clone https://github.com/sandaru-sdm/PresentsLK-Java.git
cd present
```

### Build the Project
Use Maven to build the project:
```bash
mvn clean install
```

### Deploy to Apache Tomcat
1. Copy the generated WAR file from the `target` directory to the `webapps` folder of your Tomcat server.
2. Start the Tomcat server:
   ```bash
   <TOMCAT_HOME>/bin/startup.sh
   ```
3. Access the application at `http://localhost:8080/present`.

## Development
Open the project in IntelliJ IDEA or your preferred IDE. Ensure that Maven and Tomcat configurations are properly set up.

## Contributing
Feel free to fork this repository and submit pull requests. Contributions are welcome!

## License
This project is licensed under the MIT License.
