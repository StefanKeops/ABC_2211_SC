CREATE VIEW DOI9 AS
SELECT  *
FROM emp 
WHERE hiredate = (SELECT hiredate FROM emp WHERE ename = 'FORD')