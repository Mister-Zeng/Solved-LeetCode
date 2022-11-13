# Write your MySQL query statement below
SELECT name As Customers
FROM Customers c
LEFT JOIN Orders o
ON c.id = o.customerId
WHERE o.customerId IS NULL;