SELECT
  t.Pname,
  max(t.Sumsalary)
FROM (SELECT p.name Pname, sum(d.salary) Sumsalary FROM projects p
  JOIN developers d USING (project_id) GROUP BY p.name) AS t;