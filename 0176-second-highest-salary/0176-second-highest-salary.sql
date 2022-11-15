# Write your MySQL query statement below
SELECT IF(COUNT(salary) = 2, MIN(salary) , NULL) AS SecondHighestSalary 
FROM (SELECT DISTINCT(salary) AS salary
FROM Employee e
ORDER BY salary DESC
LIMIT 2)AS A;
