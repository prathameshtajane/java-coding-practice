

/*
	Table number contains many numbers in column num including duplicated ones.
	Can you write a SQL query to find the biggest number, which only appears once.
	+---+
	|num|
	+---+
	| 8 |
	| 8 |
	| 3 |
	| 3 |
	| 1 |
	| 4 |
	| 5 |
	| 6 | 
	For the sample data above, your query should return the following result:
	+---+
	|num|
	+---+
	| 6 |
	Note:
	If there is no such number, just output null.
*/

Create table If Not Exists number (num int);
Truncate table number;
insert into number (num) values ('8');
insert into number (num) values ('8');
insert into number (num) values ('3');
insert into number (num) values ('3');
insert into number (num) values ('1');
insert into number (num) values ('4');
insert into number (num) values ('5');
insert into number (num) values ('6');

#display table
SELECT * 
FROM  number;


SELECT n.num
FROM number n
GROUP By n.num
HAVING COUNT(*)=1
ORDER BY n.num DESC
LIMIT 1;

SELECT n.num,COUNT(*) as counts
FROM number n
GROUP By n.num
-- HAVING COUNT(*)=1
ORDER BY n.num,COUNT(counts) DESC;

select if(count(*) =1, num, null) as num from number 
group by num order by count(*), num desc limit 1

-- HAVING COUNT(*)=1;

