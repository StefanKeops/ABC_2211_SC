CREATE VIEW liste23 AS
SELECT e.ename, p.projetname
FROM emp e
JOIN projet p ON e.project_no = p.projetno
WHERE e.job = 'MANAGER';