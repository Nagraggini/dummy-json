[![Run Rest Assured API Tests](https://github.com/Nagraggini/dummy-json/actions/workflows/maven-tests.yml/badge.svg)](https://github.com/Nagraggini/dummy-json/actions/workflows/maven-tests.yml)

![Top Language](https://img.shields.io/github/languages/top/Nagraggini/dummy-json)
![Rest Assured](https://img.shields.io/badge/Rest%20Assured-API-orange) ![License](https://img.shields.io/badge/license-MIT-green)


## REST API Tests: Dummy JSON

This repository contains an automated REST API test suite for the [Dummy JSON](https://dummyjson.com/).

The project demonstrates API testing using REST Assured, JUnit 5, Maven, Allure Report, and GitHub Actions CI/CD.

## Allure Test Report

The automated test results and execution reports are generated and published automatically via GitHub Actions:

![Allure Report](docs/assets/img/allure_report.png)
📊 [View the Allure Report](https://nagraggini.github.io/dummy-json/)

## Toolbox

- Programming language: Java 21
- Test automation framework: JUnit 5
- API testing framework: REST Assured
- Reporting: Allure Report
- Build tool: Maven
- CI/CD: GitHub Actions

Requirements:
- JDK 21+
- Maven 3.x
- Internet connection
  
To run the tests, execute:

On Linux:
```./mvnw clean test```

On Windows:
```mvnw clean test```

To run a single test:                  

```./mvnw -Dtest=UserListTest#checkStatusCode test```

## Covered Test Scenarios

- GET user by ID
- POST create new user
- PUT update existing user
- DELETE user
- HTTP status code validation
- Response body validation
- JSON schema/content validation
- Positive and negative test cases
