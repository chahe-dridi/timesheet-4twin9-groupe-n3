# Fixes

## Fix 1: Removed unused import --chaher
- **File**: `UserRestControl.java`
- **Description**: Removed the unused import `java.util.Date`. The class `UserRestControl` did not use this import, so it was considered unnecessary and removed.

## Fix 2: Fixed exposed SonarQube token --chaher
- **File**: `pom.xml`
- **Description**: Fixed the issue where the SonarQube token was exposed in the `pom.xml`. The token has been removed from the code and should now be handled securely.
