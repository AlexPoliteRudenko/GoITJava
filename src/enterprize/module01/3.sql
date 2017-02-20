SELECT
  sum(d.salary),
  s.name
FROM developers d
  JOIN developers_skills USING (developer_id)
  JOIN skills s USING (skill_id)
where s.name LIKE '%java%';