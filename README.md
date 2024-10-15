# Project Title: KAYAN Digital Services Portfolio

## Overview
KAYAN Digital Services Portfolio offers a comprehensive suite of IT services and solutions designed to facilitate digital transformation for businesses. Our platform integrates products from leading vendors such as IBM, Red Hat, Automation Anywhere, ManageEngine, and Dynatrace to empower organizations with AI-driven technologies. We focus on delivering solutions in Digital Business Automation, Enterprise Application Integration, Data Analytics, and advanced tools like WatsonX.ai and Java Spring.ai. Our goal is to help clients grow their businesses rapidly while ensuring security and efficiency.

KAYAN operates on a customer-centric approach, allowing us to collaboratively analyze, design, implement, and execute a holistic digital services plan that aligns with our clients' specific needs. By partnering with the world’s largest technology providers, we provide a diverse array of software solutions tailored to meet the demands of modern enterprises.

As a trusted IT partner, our commitment extends beyond offering third-party solutions; we also provide ongoing support, including upgrades, maintenance releases, and patches. Our professional team is always ready to assist and address any emerging needs and queries.

For customers utilizing legacy systems, on-premise data centers, or cloud solutions, KAYAN's consultants and experts offer robust integration, analytics, and process automation services, ensuring a seamless transition to the cloud. This strategic move enables businesses to reduce costs, increase ROI, and enhance productivity and performance.

## Features
- **User Registration and Login**: Users can easily register for an account and securely log in to access personalized services and support.
- **Service Application**: Customers can apply for various services offered by KAYAN directly through the platform.
- **Contact Us**: A dedicated section for users to reach out for inquiries, support, or consultations regarding their digital transformation needs.

## Technologies Used
- **Spring MVC**: For handling the web layer and managing the application flow.
- **Spring Security**:To secure senstive data and for Authentcation and Password Encryption
- **Thymeleaf**: As the template engine for rendering dynamic web pages.
- **JPA**: For ORM (Object-Relational Mapping) to manage database interactions.
- **MySQL**: For the relational database management system.
- **Maven**: For dependency management and build automation.

## Architecture Overview
The application follows the Model-View-Controller (MVC) architecture pattern. 
- **Model**: Represents the data and business logic.
- **View**: Responsible for rendering the user interface.
- **Controller**: Handles user requests, interacts with the model, and returns the appropriate view.

- ## Getting Started

### Prerequisites
Before you begin, ensure you have the following installed on your machine:
- **Java JDK 11 or higher**: [Download Here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- **Maven**: [Download Here](https://maven.apache.org/download.cgi) (if using Maven for project management)
- **MySQL**: [Download Here](https://dev.mysql.com/downloads/mysql/) (or your preferred database)

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/ramezbakeer/kayanProject

2. Navigate to the project directory:
   ```bash
   cd kayanProject

3.Import the project into your preferred IDE (e.g., IntelliJ IDEA, Eclipse).

# Configuration

## Set up the Database
1. **Create a MySQL database** named `kayaan`.

2. **Update the `src/main/resources/application.properties` file** with your database connection details:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/kayaan
   spring.datasource.username=your_username
   spring.datasource.password=your_password

## Running the Application
1. **Open a terminal in the project directory and run**:

   ```bash
   mvn spring-boot:run

2. **Once the application is running, open your web browser and go to**:
     http://localhost:8080


This version maintains the correct formatting and includes all necessary steps for setting up and running your project. Let me know if you need further modifications!

## Directory Structure

Below is the directory structure of the **KAYAN Digital Services Portfolio** application with brief explanations for each folder and file.
   
   ```plaintext

      ├───.idea
      │   └───dataSources
      ├───src
      │   ├───main
      │   │   ├───java
      │   │   │   └───com
      │   │   │       └───ebi
      │   │   │           └───kayanProject
      │   │   │               ├───controller
      │   │   │               ├───entity
      │   │   │               ├───exception
      │   │   │               ├───model
      │   │   │               ├───repo
      │   │   │               ├───securityConfig
      │   │   │               └───service
      │   │   └───resources
      │   │       ├───static
      │   │       │   ├───css
      │   │       │   ├───fonts
      │   │       │   ├───images
      │   │       │   └───js
      │   │       └───templates
      │   └───test
      │       └───java
      │           └───com
      │               └───ebi
      │                   └───kayanProject
      └───target
          ├───classes
          │   ├───com
          │   │   └───ebi
          │   │       └───kayanProject
          │   │           ├───controller
          │   │           ├───entity
          │   │           ├───exception
          │   │           ├───model
          │   │           ├───repo
          │   │           ├───securityConfig
          │   │           └───service
          │   ├───static
          │   │   ├───css
          │   │   ├───fonts
          │   │   ├───images
          │   │   └───js
          │   └───templates
          └───generated-sources
              └───annotations
```

### Key Directories and Explanation

- **`.idea`**: IntelliJ project configuration files.
- **`src/main/java`**: Contains the Java code for your application, organized by package.
  - **`controller`**: Handles HTTP requests and responses.
  - **`entity`**: Represents the data models/entities.
  - **`exception`**: Handles custom exceptions.
  - **`model`**: Defines additional data models (DTOs, ViewModels, etc.).
  - **`repo`**: Contains repository interfaces for database operations.
  - **`securityConfig`**: Manages security-related configurations (e.g., authentication).
  - **`service`**: Contains the business logic for the application.
- **`src/main/resources`**: Stores static assets, templates, and configuration files.
  - **`static`**: Contains static files (CSS, JS, fonts, images).
  - **`templates`**: Stores HTML templates (if using Thymeleaf or similar templating engine).
- **`src/test`**: Holds test cases for the application.
- **`target`**: Generated files, compiled classes, and resources after the build.

