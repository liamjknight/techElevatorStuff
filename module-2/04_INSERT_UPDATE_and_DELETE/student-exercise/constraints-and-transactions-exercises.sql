-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

START TRANSACTION;
-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
INSERT INTO actor (first_name, last_name)
        VALUES ('Hampton', 'Avenue');
INSERT INTO actor (first_name, last_name)
        VALUES ('Lisa', 'Byway');
SELECT * FROM actor ORDER BY actor_id DESC LIMIT 2;    
--ROLLBACK;
-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
INSERT INTO film (title, language_id, description, release_year, original_language_id)
        VALUES ('Euclidean PI', 1, 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1);
SELECT * FROM film WHERE title = 'Euclidean PI';
--ROLLBACK;
-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
--SELECT * FROM film WHERE title LIKE '%PI';
--SELECT * FROM actor WHERE last_name = 'Byway' OR last_name = 'Avenue';
INSERT INTO film_actor (film_id, actor_id) 
        VALUES ((SELECT film_id FROM film WHERE title = 'Euclidean PI'), 
        (SELECT actor_id FROM actor WHERE first_name = 'Lisa' AND last_name = 'Byway'));
        
INSERT INTO film_actor (film_id, actor_id) 
        VALUES ((SELECT film_id FROM film WHERE title = 'Euclidean PI'), 
        (SELECT actor_id FROM actor WHERE first_name = 'Hampton' AND last_name = 'Avenue'));
        
SELECT * FROM film_actor WHERE film_id = (SELECT film_id FROM film WHERE title = 'Euclidean PI');
--ROLLBACK;
-- 4. Add Mathmagical to the category table.
INSERT INTO category (name) VALUES ('Mathemagical');
SELECT * FROM category;
--ROLLBACK;
-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
UPDATE film_category 
SET category_id = (SELECT category_id FROM category WHERE name = 'Mathemagical')
WHERE film_id IN (SELECT film_id FROM film WHERE title IN ('EGG IGBY', 'KARATE MOON', 'RANDOM GO', 'YOUNG LANGUAGE'));

INSERT INTO film_category (category_id, film_id)
VALUES ((SELECT category_id FROM category WHERE name = 'Mathemagical'), (SELECT film_id FROM film WHERE title ='Euclidean PI'));

SELECT * FROM film_category
WHERE film_id IN (SELECT film_id FROM film WHERE title IN ('Euclidean PI', 'EGG IGBY', 'KARATE MOON', 'RANDOM GO', 'YOUNG LANGUAGE'));

--ROLLBACK;
-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)

-- 7. Add a copy of "Euclidean PI" to all the stores.


INSERT INTO inventory (film_id, store_id)
VALUES ((SELECT film_id FROM film WHERE title = 'Euclidean PI'), 1);
INSERT INTO inventory (film_id, store_id)
VALUES ((SELECT film_id FROM film WHERE title = 'Euclidean PI'), 2);


SELECT * FROM inventory ORDER BY inventory_id DESC;

--ROLLBACK;

COMMIT;
-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
DELETE FROM film WHERE title = 'Euclidean PI';--this is depended upon by the film_actor table as a foreign key constraint

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
DELETE FROM category WHERE name = 'Mathemagical';--this is depended upon by film_category as a foreign key constraint

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
DELETE FROM film_category WHERE category_id IN (SELECT category_id FROM category WHERE name = 'Mathmagical');--film_category is purely relations, no constraints

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE>
DELETE FROM film WHERE title = 'Euclidean PI';--still used by some actors
DELETE FROM category WHERE name = 'Mathemagical';--still used by some movies

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.


--Euclidean pie must have the two rows refrencing it in film_actor deleted, 
--Mathemagical must have the films depending on it deleted or have their genere changed

