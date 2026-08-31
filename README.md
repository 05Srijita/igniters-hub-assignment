# Igniters Hub Internship Assignment

## Student Details

- Name: [Your Full Name]
- Roll Number: [Your Roll Number]
- Branch: [Your Branch]
- Semester: [Your Semester]

## Technologies Used

- Java 17
- Spring Boot
- Maven
- Spring Web
- JavaMailSender

## Challenges Completed

### Challenge 1: Send an Email

A Spring Boot email sender that uses `JavaMailSender` to send an email with an image attachment. Mail credentials are configured locally using environment variables and are not included in this repository.

### Challenge 2: Palindrome Checker

Checks whether the supplied input string is a palindrome.

Example:

```text
Input: racecar
Output: The string 'racecar' is a palindrome.
```

### Challenge 3: Binary Search

Performs binary search on this sorted array:

```text
[1][3][5][7][9][11][13][15][17][19]
```

Example:

```text
Input: 7
Output: Element 7 is found at index 3.
```

### Challenge 4: String Manipulation

Performs the following operations on a sentence:

- Counts its words
- Reverses the word order
- Replaces spaces with hyphens

Example:

```text
Input: The quick brown fox
Word count: 4
Reversed: fox brown quick The
Modified: The-quick-brown-fox
```

## How to Run

1. Install Java 17 or later.
2. Open the project folder in IntelliJ IDEA.
3. Configure email values locally through environment variables:

```text
MAIL_USERNAME=your-email@gmail.com
MAIL_PASSWORD=your-gmail-app-password
```

4. Run the application:

```bash
mvn spring-boot:run
```

## Security Note

No real email password, Gmail App Password, or other secret is stored in this repository.
