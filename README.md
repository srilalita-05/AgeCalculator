markdown

# Age Calculator

A simple Java console application that calculates age based on a given date of birth or estimates a date of birth from the user's age in years. This application uses Java's date and time API to ensure accurate calculations.

## Features
- **Calculate Age**: Enter a date of birth to receive the exact age in years, months, and days.
- **Estimate Date of Birth**: Enter an age in years to approximate a date of birth.

## Requirements
- Java Development Kit (JDK) 8 or later

## Usage
1. **Run the Program**:
   javac AgeCalculator1.java
   java AgeCalculator1

    Choose an Option:
        Enter 1 to calculate age based on your date of birth.
        Enter 2 to estimate a date of birth based on an age in years.

Example

Option 1:

    Input: 05-09-2005
    Output: "Your age is X years, Y months, and Z days."

Option 2:

    Input: 25
    Output: "Your approximate date of birth could be around: DD-MM-YYYY."

Code Breakdown

    calculateAge: Computes age by finding the period between the date of birth and the current date.
    calculateDOBFromAge: Estimates date of birth by subtracting the provided years from the current date.

Error Handling

    Handles invalid date formats and future dates, displaying informative messages.
