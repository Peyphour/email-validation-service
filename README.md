# Email validation service

A small and simple service to validate email addresses.
It runs as a standalone JAR.

The validation rules are as follow:
- The email address has at least one '@' character
- The domain of the email address has at least one MX record

# Build

Run `mvn package`

# Run 

Run `java -jar target/email-validator-1.0.0.jar`.
It will run on port 8080 by default, you can override this by adding the argument `--server.port=${port}` to the command
