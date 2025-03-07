# Fixes

## Fix 1: Removed unused import --chaher
- **File**: `UserRestControl.java`
- **Description**: Removed the unused import `java.util.Date`. The class `UserRestControl` did not use this import, so it was considered unnecessary and removed.

## Fix 2: Fixed exposed SonarQube token --chaher
- **File**: `pom.xml`
- **Description**: Fixed the issue where the SonarQube token was exposed in the `pom.xml`. The token has been removed from the code and should now be handled securely.

## Fix 3: Changed Field Injection to Constructor Injection --chaher
- **File**: `UserRestControl.java`
- **Description**: Replaced the field injection of `IUserService` with constructor injection. This is a better practice as constructor injection is more testable and ensures that all required dependencies are provided when creating the object.

