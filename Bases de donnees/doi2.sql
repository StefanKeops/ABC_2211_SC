CREATE VIEW DOI2 AS
SELECT ename, job, hiredate
FROM emp 
WHERE job <> 'MANAGER' AND hiredate BETWEEN '1981-01-01' AND '1981-12-31';