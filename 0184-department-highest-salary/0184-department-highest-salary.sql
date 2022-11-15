# Write your MySQL query statement below
SELECT A.* FROM (SELECT d.name AS Department, e.name AS Employee, e.salary AS Salary
FROM Employee e
JOIN Department d
ON e.departmentId = d.id) AS A 
JOIN
(SELECT d.name AS Department, MAX(e.salary) AS Salary
FROM Employee e
JOIN Department d
ON e.departmentId = d.id
GROUP BY 1) AS B

USING(Department, salary);
