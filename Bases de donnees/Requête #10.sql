CREATE VIEW liste10
AS SELECT d.dname, e.ename, e.job, e.sal
FROM emp e
JOIN dept d ON e.deptno = d.deptno
ORDER BY d.dname ASC, e.sal DESC;