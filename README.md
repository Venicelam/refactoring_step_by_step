# refactoring_step_by_step
1. public to private
	- Write a test case without changing other code
	- Add age getter
	- find usage
	- replace driver.age to driver.getAge()
	- public to private
	
2. give a meaningful name to age 18

3. Modify method name from checkDriver to checkIfDriverIsAdult

4. eliminate if else statement