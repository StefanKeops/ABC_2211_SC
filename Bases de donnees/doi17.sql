CREATE VIEW DOI17 AS
SELECT  *
FROM emp 
WHERE hiredate < (SELECT MIN(hiredate) FROM emp WHERE deptno = '10')