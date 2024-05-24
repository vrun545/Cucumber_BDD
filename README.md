
**Cucumber BDD Project with Selenium (Java)**

**Description:**

This Maven project is a robust automation framework that combines Behavior-Driven Development (BDD) principles with Selenium WebDriver in Java to automate testing on the Amazon website. It follows a Page Object Model (POM) architecture and incorporates various features as per the provided assignment specifications.

**Features:**

1. **Maven Project:** 
   - This project is structured as a Maven project, enabling easy dependency management and build automation.

2. **Page Object Model (POM):**
   - The framework implements the Page Object Model to maintain separation between test code and page-specific code, enhancing maintainability and reusability.

3. **Pages:**
   - Three pages have been created representing different sections or functionalities of the Amazon website, such as the homepage, search results page, and product details page.

4. **Feature Files:**
   - Two feature files have been created, each containing a minimum of two scenarios, to demonstrate the testing of various functionalities of the Amazon website.

5. **Parameterization:**
   - Parameterization has been implemented to provide flexibility in testing by allowing the same scenario to be executed with different inputs or test data.

6. **Regular Expressions:**
   - Regular expressions have been used to reuse the same step definition for multiple scenarios, reducing duplication of code and improving maintainability.

7. **Coding Guidelines:**
   - The framework adheres to proper coding guidelines as per the shared guidelines, ensuring consistency, readability, and maintainability of the codebase.

8. **Hooks and Tags:**
   - Hooks and tags have been utilized to manage test setup and teardown activities and to organize and selectively execute tests based on tags.

9. **Cucumber Reports:**
   - Cucumber reports are generated using plugins to provide comprehensive test execution reports, including pass/fail status, test duration, and scenario details. These reports enhance visibility and facilitate analysis of test results.

**How to Run Tests:**

1. Clone the project repository.
2. Open the project in your preferred Java IDE.
3. Ensure that the necessary dependencies are resolved by Maven.
4. Run the `TestRunner.java` class as a JUnit test to execute the feature files.
5. View the test results in the console or in the designated test report file.

**Contributing:**

Contributions are welcome! If you find any issues or have suggestions for improvements, please create a pull request or raise an issue in the project repository.

**License:**

This project is licensed under the MIT License. See the [LICENSE](./LICENSE) file for details.

**Acknowledgments:**

- This project was created as part of an assignment for BDD Cucumber testing with Selenium.

