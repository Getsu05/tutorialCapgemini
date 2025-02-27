INSERT INTO category(name) VALUES ('Eurogames');
INSERT INTO category(name) VALUES ('Ameritrash');
INSERT INTO category(name) VALUES ('Familiar');

INSERT INTO author(name, nationality) VALUES ('Alan R. Moon', 'US');
INSERT INTO author(name, nationality) VALUES ('Vital Lacerda', 'PT');
INSERT INTO author(name, nationality) VALUES ('Simone Luciani', 'IT');
INSERT INTO author(name, nationality) VALUES ('Perepau Llistosella', 'ES');
INSERT INTO author(name, nationality) VALUES ('Michael Kiesling', 'DE');
INSERT INTO author(name, nationality) VALUES ('Phil Walker-Harding', 'US');

INSERT INTO game(title, age, category_id, author_id) VALUES ('On Mars', '14', 1, 2);
INSERT INTO game(title, age, category_id, author_id) VALUES ('Aventureros al tren', '8', 3, 1);
INSERT INTO game(title, age, category_id, author_id) VALUES ('1920: Wall Street', '12', 1, 4);
INSERT INTO game(title, age, category_id, author_id) VALUES ('Barrage', '14', 1, 3);
INSERT INTO game(title, age, category_id, author_id) VALUES ('Los viajes de Marco Polo', '12', 1, 3);
INSERT INTO game(title, age, category_id, author_id) VALUES ('Azul', '8', 3, 5);

INSERT INTO client(name, id) VALUES ('Sergi', 1);
INSERT INTO client(name, id) VALUES ('Dani', 2);
INSERT INTO client(name, id) VALUES ('Sandra', 3);
INSERT INTO client(name, id) VALUES ('Marta', 4);

INSERT INTO loan (game_id, client_id, start_date, end_date) VALUES (1, 1, '2025-02-01', '2025-02-07');
INSERT INTO loan (game_id, client_id, start_date, end_date) VALUES (2, 2, '2025-02-05', '2025-02-12');
INSERT INTO loan (game_id, client_id, start_date, end_date) VALUES (3, 3, '2025-02-10', '2025-02-17');
INSERT INTO loan (game_id, client_id, start_date, end_date) VALUES (4, 4, '2025-02-15', '2025-02-22');



