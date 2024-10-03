# Job Application Tracking System

This is a robust backend system for tracking job applications. It allows users to manage and monitor their job application process efficiently.

## Technologies Used

- Java
- Spring Boot
- JHipster
- H2 Database (Development)
- MySQL (Production)
- Hibernate
- Ehcache
- Cucumber (for testing)
- OpenAPI (for API-first development)

## Setup and Installation

1. Ensure you have Java 11 or later installed.
2. Install Node.js and npm.
3. Install JHipster: `npm install -g generator-jhipster`
4. Clone this repository: `git clone [repository-url]`
5. Navigate to the project directory: `cd job_back`
6. Run `./mvnw` (for Maven) or `./gradlew` (for Gradle) to start the application.

## Usage

After starting the application, you can access the API at `http://localhost:8080/api`.

(Note: Add more specific usage instructions once we've developed the core functionalities)

## API Documentation

API documentation is automatically generated using OpenAPI. You can access the Swagger UI at `http://localhost:8080/swagger-ui.html` when the application is running.

## Database

- H2 (Development): The H2 console is available at `http://localhost:8080/h2-console` when running in development mode.
- MySQL (Production): Ensure you have MySQL installed and update the `application-prod.yml` with your database configuration.

## Testing

This project uses Cucumber for behavior-driven development (BDD) testing. To run the tests:

```
./mvnw clean test
```

## Contributing

1. Fork the repository
2. Create your feature branch: `git checkout -b feature/my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin feature/my-new-feature`
5. Submit a pull request

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

---

For more information on using JHipster, refer to the [JHipster documentation](https://www.jhipster.tech/documentation-archive/v8.7.1).
