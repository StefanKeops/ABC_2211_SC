CREATE VIEW liste16
AS SELECT  ename, d.dname, e.sal
FROM emp e 
JOIN dept d ON e.deptno = d.deptno
WHERE job LIKE 'manager';