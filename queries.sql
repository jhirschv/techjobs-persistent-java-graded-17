--Part 1
SELECT name FROM employer WHERE location = "St. Louis City";
--Part 2
DROP TABLE job;
--Part 3

--Part 4
SELECT *
FROM skill
LEFT JOIN job_skills ON skill.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;