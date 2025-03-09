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

# Fixes --Khouloud

## Fix 1: Removed unused imports 
- **Files**:
    - `UserRestControl.java` (line 6)
    - `UserRepository.java` (lines 4, 5)
    - `UserServiceImplMockTests.java` (line 4)
    - `UserServiceImplTest.java` (lines 4, 7)
    - `UserServiceImpl.java` (lines 5, 6)
- **Description**: Removed unnecessary imports that were not used in these files to improve code cleanliness.

## Fix 2: Removed commented-out code 
- **Files**:
    - `UserRestControl.java` (lines 30, 47)
    - `UserRepository.java` (lines 34, 39, 44, 49, 53)
    - `UserServiceImpl.java` (lines 41, 60, 75)
- **Description**: Removed commented-out code to enhance readability and maintainability.

## Fix 3: Removed unused variables 
- **Files**:
    - `UserServiceImpl.java` (line 21: removed unused variable `l`)
    - `UserServiceImpl.java` (line 51: removed unused variable `u_saved`)
- **Description**: Removed unused variables to improve code efficiency and eliminate unnecessary memory usage.
