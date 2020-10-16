-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
INSERT INTO actor (first_name, last_name)
        VALUES ('Hampton', 'Avenue');
INSERT INTO actor (first_name, last_name)
        VALUES ('Lisa', 'Byway');
SELECT 
-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
INSERT INTO film (title, language_id, description, release_year, original_language_id)
        VALUES ('Euclidean PI', 1, 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1);
-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
--SELECT * FROM film WHERE title LIKE '%PI';
--SELECT * FROM actor WHERE last_name = 'Byway' OR last_name = 'Avenue';
INSERT INTO film_actor (film_id, actor_id) VALUES (1001, 201);
INSERT INTO film_actor (film_id, actor_id) VALUES (1001, 202);
-- 4. Add Mathmagical to the category table.
INSERT INTO category (name) VALUES ('Mathemagical');
-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
INSERT INTO film_category (film_id, category_id) VALUES (1001, 17);
SELECT * FROM film WHERE title = 'Euclidean PI' OR title = 'EGG IGBY' OR title = 'KARATE MOON' OR title = 'RANDOM GO' OR title = 'YOUNG LANGUAGE';
UPDATE film_category SET category_id = 17 WHERE film_id = 274 OR film_id = 494 OR film_id = 714 OR film_id = 996;
-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)

-- 7. Add a copy of "Euclidean PI" to all the stores.

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE>

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.
