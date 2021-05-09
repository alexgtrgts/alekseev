SELECT * FROM people WHERE id % 2 != 0;

SELECT name, COUNT(name)
FROM people
GROUP BY name
HAVING COUNT(name) > 1;

SELECT DATE_ADD(age,INTERVAL 1 year) as new_age FROM people;

SELECT DISTINCT name FROM people;

SELECT AVG(Salary) FROM employees;

SELECT * FROM employees
WHERE Salary > (SELECT AVG (Salary) FROM employees);

SELECT Dept_Name
FROM employees w
         RIGHT JOIN departments d ON (w.Dept = d.DeptNums)
WHERE Dept_Name IS NULL;

UPDATE employees SET salary =
                         CASE
                             WHEN salary = 1000 THEN 1500
                             ELSE 1100
                             END;

SELECT CONCAT(name, salary) AS new_field FROM employees;

ALTER TABLE people RENAME allpeople;