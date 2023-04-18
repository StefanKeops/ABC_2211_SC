CREATE VIEW liste12
AS SELECT ename, job, DATE_FORMAT(hiredate, '%a %d %b %Y') AS hiredate
FROM emp
WHERE deptno = 20;