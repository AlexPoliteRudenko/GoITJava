CREATE VIEW
  temp_company_projects AS (SELECT DISTINCT
                                                d.company_id,
                                                c.customer_id,
                                                p.project_id,
                                                comp.name company,
                                                p.cost    pvalue,
                                                p.name,
                                                c.name    investor
                                              FROM developers d
                                                JOIN projects p USING (project_id)
                                                JOIN customers c USING (customer_id)
                                                JOIN companies comp USING (company_id)
                                              GROUP BY company, name);

SELECT *
FROM temp_company_projects;

# GROUP BY company_id, customer_id;

# SELECT
#   min(in_table.cust_invest),
#   comp_name,
#   cust_name
# FROM (SELECT
#         sum(cost) cust_invest,
#         comp_name,
#         cust_name,
#         customer_id
#       FROM customer_companies_profit_select
#       GROUP BY comp_name, cust_name) AS in_table
#   JOIN customer_companies_profit_select ccp USING (customer_id)
# GROUP BY comp_name;

# SELECT
#   investor,
#   company,
#   min(t.invest)
# FROM (SELECT
#         company_id,
#         customer_id,
#         company company_,
#         sum(cost) invest,
#         name investor
#       FROM temp_company_projects
#       GROUP BY company_id, customer_id) AS t
#   JOIN (SELECT
#           company_id,
#           customer_id,
#           company,
#           sum(cost) invest,
#           name
#         FROM temp_company_projects
#         GROUP BY company_id, customer_id) AS b ON t.invest = b.invest
# GROUP BY company;
;

SELECT
  temp.company,
  temp.sum_value,
  customers.name
FROM (SELECT
        customer_id,
        company_id company,
        sum(pvalue) sum_value,
        investor
      FROM temp_company_projects
      GROUP BY company, investor) AS temp
  JOIN (SELECT
       customer_id,
  company_id company,
  sum(pvalue) sum_value,
investor
FROM temp_company_projects
GROUP BY company, investor) as t ON min(t.sum_value) = temp.sum_value
  JOIN customers ON customers.name = temp.investor
GROUP BY company;