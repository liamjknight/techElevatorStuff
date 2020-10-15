-- INSERT

-- 1. Add Klingon as a spoken language in the USA
SELECT * FROM countrylanguage WHERE language LIKE '%ingo%';

INSERT INTO countrylanguage (countrycode, isofficial, language, percentage) VALUES ('USA', 'true', 'Klingon', 75.0);
        
SELECT * FROM countrylanguage WHERE language LIKE '%ingo%';

-- 2. Add Klingon as a spoken language in Great Britain
INSERT INTO countrylanguage (countrycode, language, isofficial, percentage) VALUES ('GBR', 'Klingon', 'false', 33.0);
SELECT * FROM countrylanguage WHERE language LIKE '%ingo%';
-- UPDATE

-- 1. Update the capital of the USA to Houston
SELECT c.name AS country, cty.name AS capital FROM country c
INNER JOIN city cty
        ON c.capital = cty.id
WHERE c.capital = cty.id AND c.code = 'USA';

SELECT * FROM city WHERE name = 'Houston';

UPDATE country SET capital = (SELECT id FROM city WHERE name = 'Houston')
        WHERE code = 'USA';

SELECT c.name AS country, cty.name AS capital FROM country c
INNER JOIN city cty
        ON c.capital = cty.id
WHERE c.capital = cty.id AND c.code = 'USA';

-- 2. Update the capital of the USA to Washington DC and the head of state
SELECT cty.name, c.headofstate FROM country c
INNER JOIN city cty
        ON c.capital = cty.id
WHERE c.capital = (SELECT id FROM city WHERE name = 'Houston');
SELECT * FROM city WHERE name = 'Washington';

UPDATE country SET capital = (SELECT id FROM city WHERE name = 'Washington'), headofstate = 'John Cena'
        WHERE code = 'USA';
        
SELECT cty.name, cty.district, c.headofstate FROM country c
INNER JOIN city cty
        ON c.capital = cty.id
WHERE c.capital = (SELECT id FROM city WHERE name = 'Washington');
-- DELETE

-- 1. Delete English as a spoken language in the USA
SELECT * FROM countrylanguage
WHERE countrycode = 'USA' AND language = 'English';

DELETE FROM countrylanguage
WHERE countrycode = 'USA' AND language = 'English';

SELECT * FROM countrylanguage
WHERE countrycode = 'USA' AND language = 'English';
-- 2. Delete all occurrences of the Klingon language 
SELECT * FROM countrylanguage
WHERE language = 'Klingon';

DELETE FROM countrylanguage
WHERE language = 'Klingon';

SELECT * FROM countrylanguage
WHERE language = 'Klingon';
-- REFERENTIAL INTEGRITY

-- 1. Try just adding Elvish to the country language table.
INSERT INTO countrylanguage (language)
        VALUES ('Elvish');

-- 2. Try inserting English as a spoken language in the country ZZZ. What happens?
INSERT INTO countrylanguage (language, countrycode) VALUES ('English', 'ZZZ');
-- 3. Try deleting the country USA. What happens?
DELETE FROM country WHERE code = 'USA';

-- CONSTRAINTS
SELECT * FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS;
SELECT * FROM INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE;
SELECT * FROM INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS

-- 1. Try inserting English as a spoken language in the USA
SELECT * FROM countrylanguage;
INSERT INTO countrylanguage (countrycode, language, isofficial, percentage)
        VALUES ('USA', English, true, 95.0);
-- 2. Try again. What happens?
SELECT * FROM countrylanguage;
INSERT INTO countrylanguage (countrycode, language, isofficial, percentage)
        VALUES ('USA', English, true, 95.0);
-- 3. Let's relocate the USA to the continent - 'Outer Space'
UPDATE country SET continent = 'Outer Space' WHERE code = 'USA';

-- How to view all of the constraints

SELECT * FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS
SELECT * FROM INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE
SELECT * FROM INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS


-- TRANSACTIONS

-- 1. Try deleting all of the rows from the country language table and roll it back.
BEGIN TRANSACTION;

        SELECT * FROM countrylanguage;
        
        DELETE FROM countrylanguage;
        
        SELECT * FROM countrylanguage;
ROLLBACK;

COMMIT;
-- 2. Try updating all of the cities to be in the USA and roll it back

-- 3. Demonstrate two different SQL connections trying to access the same table where one happens to be inside of a transaction but hasn't committed yet.
