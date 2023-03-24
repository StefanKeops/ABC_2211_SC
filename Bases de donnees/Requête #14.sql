CREATE VIEW liste14
AS SELECT  d.dname, SUM(e.sal) + SUM(IFNULL(e.comm,0)) AS masse_salariale, COUNT(e.empno) AS nombre_employes, AVG(e.sal) AS salaire_moyen, e.job
FROM emp e 
JOIN dept d ON e.deptno = d.deptno
GROUP BY d.dname, e.job;