CREATE VIEW doi11 AS
SELECT  *
FROM emp 
WHERE job = (SELECT job FROM emp WHERE ename = 'Turner')