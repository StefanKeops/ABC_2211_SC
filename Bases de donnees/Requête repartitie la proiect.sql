UPDATE emp SET project_no = 
    CASE
        WHEN deptno = 30 AND job = 'SALESMAN' THEN 101
        ELSE 102
    END;