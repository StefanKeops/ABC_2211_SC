CREATE VIEW liste13
AS SELECT d.dname, MAX(e.sal) AS max_sal
FROM emp e
JOIN dept d ON e.deptno = d.deptno
GROUP BY d.deptno, d.dname;