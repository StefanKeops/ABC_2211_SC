CREATE VIEW liste18 AS
SELECT e.ename, e.job, d.dname, p.projetname
FROM emp e
JOIN dept d ON e.deptno = d.deptno
JOIN projet p ON e.project_no = p.projetno;