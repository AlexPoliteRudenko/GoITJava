SELECT
  in_table.it_name,
  max(in_table.it_sum_salary)
FROM (SELECT p.name it_name, sum(d.salary) it_sum_salary FROM projects p
  JOIN developers d USING (project_id) GROUP BY p.name) AS in_table;