README

SETUP
1. Install Eclipse
2. Install Maven
3. Install Node.js https://nodejs.org/en/
4. Start JSON Server
4a. https://github.com/typicode/json-server
4b. In Terminal: sudo npm install -g json-server
4c. In Terminal: json-server --watch db.json

EXECUTION
Run As -> Run Configuration -> TestNG
Select Test -> Project -> Class
VM Arguments: -Denv=dev or -Denv=QA or -Denv=staging