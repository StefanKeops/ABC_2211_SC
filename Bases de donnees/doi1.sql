CREATE VIEW DOI1 AS
SELECT e.ename, d.dname
FROM emp e
JOIN dept d ON e.deptno = d.deptno
WHERE d.deptno IN (20, 30) AND e.job = 'MANAGER';