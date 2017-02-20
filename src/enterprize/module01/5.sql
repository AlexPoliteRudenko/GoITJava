CREATE VIEW customer_companies_profit_select AS
  SELECT DISTINCT
    comp.name comp_name,
    p.name    p_name,
    cust.name cust_name,
    p.cost
  FROM customers cust
    JOIN projects p USING (customer_id)
    JOIN developers USING (project_id)
    JOIN companies comp USING (company_id);

SELECT
  min(in_table.cust_invest),
  comp_name,
  cust_name
FROM (SELECT
        sum(cost) cust_invest,
        comp_name,
        cust_name
      FROM customer_companies_profit_select
      GROUP BY comp_name, cust_name) AS in_table
GROUP BY comp_name;