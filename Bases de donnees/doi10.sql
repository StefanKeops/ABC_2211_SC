CREATE VIEW DOI10 AS
SELECT  *
FROM emp 
WHERE deptno = (SELECT deptno FROM emp WHERE ename = 'CLARK')