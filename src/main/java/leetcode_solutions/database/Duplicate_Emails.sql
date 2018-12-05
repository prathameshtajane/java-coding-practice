/*
	182. Duplicate Emails

	Write a SQL query to find all duplicate emails in a table named Person.

	+----+---------+
	| Id | Email   |
	+----+---------+
	| 1  | a@b.com |
	| 2  | c@d.com |
	| 3  | a@b.com |
	+----+---------+
	For example, your query should return the following for the above table:

	+---------+
	| Email   |
	+---------+
	| a@b.com |
	+---------+
	Note: All emails are in lowercase.
*/

Create table If Not Exists Person (Id int, Email varchar(255));
Truncate table Person;
insert into Person (Id, Email) values ('1', 'a@b.com');
insert into Person (Id, Email) values ('2', 'c@d.com');
insert into Person (Id, Email) values ('3', 'a@b.com');

#display Person table
SELECT * FROM Person;

# final output
SELECT TempTable.Email 
FROM (SELECT p.Email,COUNT(p.id) as num FROM Person p GROUP BY p.Email) as TempTable
WHERE TempTable.num > 1;


# using having 
select Email
from Person
group by Email
having count(*) > 1;

#This is the one of the most efficient solution because of the Inner Join and On condition (I think)?
SELECT DISTINCT t1.Email
FROM Person t1
JOIN Person t2
ON t1.email = t2.email and t1.id <> t2.id