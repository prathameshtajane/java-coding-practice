/*
603. Consecutive Available Seats

link : https://leetcode.com/problems/consecutive-available-seats/description/

Several friends at a cinema ticket office would like to reserve consecutive available seats.
Can you help to query all the consecutive available seats order by the seat_id using the following cinema table?
| seat_id | free |
|---------|------|
| 1       | 1    |
| 2       | 0    |
| 3       | 1    |
| 4       | 1    |
| 5       | 1    |
Your query should return the following result for the sample case above.
| seat_id |
|---------|
| 3       |
| 4       |
| 5       |
Note:
The seat_id is an auto increment int, and free is bool ('1' means free, and '0' means occupied.).
Consecutive available seats are more than 2(inclusive) seats consecutively available.
*/

Create table cinema (id int primary key auto_increment, free bool);
Truncate table cinema;
insert into cinema (id, free) values ('1', true);
insert into cinema (id, free) values ('2', false);
insert into cinema (id, free) values ('3', true);
insert into cinema (id, free) values ('4', true);
insert into cinema (id, free) values ('5', true);

#display table
SELECT * FROM cinema;


#final solution
SELECT DISTINCT id.c1
FROM cinema as c1
JOIN  cinema as c2
ON ABS(c1.id - c2.id) = 1 AND c1.free = true  AND c2.free = true
ORDER BY c1.id;



