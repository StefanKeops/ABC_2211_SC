CREATE VIEW DOI7 AS
SELECT  *
FROM emp 
WHERE empno NOT IN (SELECT DISTINCT mgr FROM emp WHERE mgr IS NOT NULL)doi7 