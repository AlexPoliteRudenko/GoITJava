SELECT avg(d.salary)
FROM developers d
  JOIN projects p USING (project_id)
WHERE p.cost = (SELECT min(cost) from projects)