# Running the Project with Docker

This project is configured to run using Docker and Docker Compose. Follow the steps below to set up and run the application:

## Prerequisites

- Ensure Docker (version 20.10 or later) and Docker Compose (version 1.29 or later) are installed on your system.

## Environment Variables

- The `database` service requires the following environment variables:
  - `POSTGRES_USER`: Set to `user`.
  - `POSTGRES_PASSWORD`: Set to `password`.
  - `POSTGRES_DB`: Set to `todo_db`.

## Build and Run Instructions

1. Clone the repository and navigate to the project directory.
2. Build and start the services using Docker Compose:
   ```bash
   docker-compose up --build
   ```
3. Access the application at `http://localhost:8080`.

## Exposed Ports

- `todo_app` service: Exposes port `8080`.
- `database` service: Exposes port `5432` internally.

## Notes

- The application is built using Maven and Java 17.
- The `todo_app` service depends on the `database` service, which uses PostgreSQL.

For further details, refer to the project documentation or contact the maintainers.