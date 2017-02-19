ALTER TABLE developers
  ADD COLUMN salary REAL NOT NULL
  AFTER lname;

UPDATE developers d
SET d.salary = 150 * (SELECT count(ds.skill_id)
                      FROM developers_skills ds
                      WHERE ds.developer_id = d.developer_id);