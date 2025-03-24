# Running the Project with Docker

This project is configured to run using Docker and Docker Compose. Follow the steps below to set up and run the application:

## Environment Variables

- The `postgres` service requires the following environment variables:
  - `POSTGRES_USER`: Set to `spring_user`.
  - `POSTGRES_PASSWORD`: Set to `secret`.
  - `POSTGRES_DB`: Set to `todo_db`.

## Build and Run Instructions

1. Clone the repository and navigate to the project directory.
2. Build and start the services using Docker Compose:
   ```bash
   docker-compose up --build
   ```
3. Access the application at `http://localhost:8080`.

## Exposed Ports

- `app` service: Exposes port `8080`.
- `postgres` service: Exposes port `5432` internally.

## Notes

- The application is built using Maven and Java 17.
- The `app` service depends on the `postgres` service, which uses PostgreSQL.

For further details, refer to the project documentation or contact the maintainers.