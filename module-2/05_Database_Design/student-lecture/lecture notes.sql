/*Art Gallery Creation Script*/

--DROP TABLE artist;


BEGIN TRANSACTION;

CREATE TABLE customer
(
        id serial,
        firstname varchar(50) NOT NULL,
        lastname varchar(50) NOT NULL,
        address int NOT NULL,
        phone varchar(11) null,
        
        CONSTRAINT pk_customer PRIMARY KEY(id)
);

CREATE TABLE artist
(
        id serial,
        firstname varchar(50) NULL,
        lastname varchar(50) NOT NULL,
        
        CONSTRAINT pk_artist PRIMARY KEY(id)
);

CREATE TABLE art
(
        id serial,
        title varchar(75) NOT NULL,
        artist_id int NOT NULL,
        
        CONSTRAINT pk_art PRIMARY KEY(id)
);

CREATE TABLE customer_purchase
(
        customer_id int NOT NULL,
        art_id int NOT NULL,
        purchase_date timestamp NOT NULL,
        price money NOT NULL,
        
        CONSTRAINT pk_customer_purchase PRIMARY KEY(customer_id, art_id, purchase_date)
);

/*ALTER STATEMENTS TO ADD FOREIGN KEYS*/

ALTER TABLE art
ADD CONSTRAINT fk_art_artist FOREIGN KEY (artist_id) REFERENCES artist(id);

ALTER TABLE customer_purchase
ADD CONSTRAINT fk_customer_purchase_art FOREIGN KEY(art_id) REFERENCES art(id);

ALTER TABLE customer_purchase
ADD CONSTRAINT fk_customer_purchase_customer FOREIGN KEY(customer_id) REFERENCES customer(id);


COMMIT;

/*add some stuff*/

BEGIN TRANSACTION;

INSERT INTO artist(firstname, lastname) VALUES('Carol', 'Channing');
INSERT INTO artist(firstname, lastname) VALUES('Dennis', 'Frings');

INSERT INTO art(title, artist_id) VALUES ('At The Talkies', (SELECT id FROM artist WHERE firstname = 'Carol' AND lastname = 'Channing'));

COMMIT;