CREATE VIEW DOI6 AS
SELECT  empempemp.ename AS name, emp.hiredate AS hiredate, mgr.ename AS manager_name, mgr.hiredate AS manager_hiredate
FROM emp 
JOIN emp mgr ON emp.mgr = mgr.empno
WHERE emp.hiredate < mgr.hiredate;doi6