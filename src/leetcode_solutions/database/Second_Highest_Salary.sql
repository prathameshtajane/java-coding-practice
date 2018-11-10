
/*

176. Second Highest Salary

link : https://leetcode.com/problems/second-highest-salary/description/

Write a SQL query to get the second highest salary from the Employee table.

+----+--------+
| Id | Salary |
+----+--------+
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |
+----+--------+
For example, given the above Employee table, the query should return 200 as the second highest salary. If there is no second highest salary, then the query should return null.

+---------------------+
| SecondHighestSalary |
+---------------------+
| 200                 |
+---------------------+

*/

Create table If Not Exists Employee (Id int, Salary int);
Truncate table Employee;
insert into Employee (Id, Salary) values ('1', '100');
insert into Employee (Id, Salary) values ('2', '200');
insert into Employee (Id, Salary) values ('3', '300');

#display table
SELECT * FROM Employee;

#final solution (This won't work ,if there is only one employee)
SELECT e.Salary as SecondHighestSalary
FROM Employee e
ORDER BY e.Salary ASC
LIMIT 1,1;




