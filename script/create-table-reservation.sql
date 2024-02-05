CREATE TABLE IF NOT EXISTS reservation (
    id_reservation serial PRIMARY KEY,
    date_reservation DATE,
    type_payment VARCHAR(200),
    depart_date DATE CHECK (depart_date > date_reservation),
    tarif DOUBLE PRECISION,
    destination VARCHAR(200),
    id_user_RE INT REFERENCES users(id_user)
);


INSERT INTO reservation (date_reservation, type_payment, depart_date, tarif, destination, id_user_RE)
VALUES 
   ('2024-02-04 09:12:00', 'Carte de crédit', '2024-02-05 12:00:00', 100.0, 'Destination A', 1);


