ALTER TABLE developers
  ADD COLUMN salary REAL NOT NULL
  AFTER lname;

UPDATE developers d
SET d.salary = 180 * (SELECT count(ds.skill_id)
                      FROM developers_skills ds
                      WHERE ds.developer_id = d.developer_id);