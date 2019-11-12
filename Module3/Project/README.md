# Library Management System

Final Project of Module 3 / Post-grad. Proposed to simulate a development of a simplified version of a management system of a Library.

## Core actions

The system must be capable of:
- Insert and delete:
  - People: Users and Employees;
  - Items: Books, Magazines and Newspapers;
  - Operations: Loans, Withdrawals and Returns of those items, by those people.
- Compose those entities above with their necessary attributes;
- Manage the possibility of common erros: 
  - Inexistence (of items, of people, of operations, etc);
  - Wrong inputs; 
- Close the following operation cycle: 
  1. Register an Item;
  2. Register an User;
  3. This user must be capable of requiring a Loan;
  4. An employee must authorize this loan, and proceed the withdrawal;
  5. When return the item, the employee register that operation;
  6. If that Return is register in date superior to 15 days after the withdrawal, fees must applicated;
  6. And the user realize the payment of possible fees.

## Files

| Files| Notes|
|:-----|:-----| 
| [Main.java](/Module3/Project/project.root/Main.java) | Big file with all the application logic. A next step will be separete this using a 'Service' layer. |
  
## Contributing to 'Library Management System'

Comments and contributions are welcome here, feel free to get in touch. To contribute to 'Library Management System', follow these steps:

1. Fork this repository.
2. Create a branch: `git checkout -b <branch_name>`. 
3. Make your changes and commit them: `git commit -m '<commit_message>'
4. Push to the original branch: `git push origin <project_name>/<location>`
5. Create the pull request.

Alternatively see the GitHub documentation on [creating a pull request](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/creating-a-pull-request).
