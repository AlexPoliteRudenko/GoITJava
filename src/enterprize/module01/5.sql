
SELECT DISTINCT
  c.name,
  cust.name,
  min(p.cost)
FROM customers cust
  JOIN projects p USING (customer_id)
  INNER JOIN developers USING (project_id)
  INNER JOIN companies c USING (company_id) GROUP BY c.name;