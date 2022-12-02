TRUNCAR LAS TABLAS Y LUEGO
TRUNCATE TABLE usuarios;TRUNCATE TABLE delitos;

INSERT INTO usuarios (username, nombre, apellido, password, red_social, fecha_nacimiento, enabled, image)
VALUES ('cristian.diez@iudigital.edu.co', 'Cristian', 'Diez', '', 0, '1989-11-17', 1, '');

INSERT INTO delitos(nombre, descripcion, usuarios_id)
VALUES ('Hurto', 'Cuando te roban alhuna pertenencia', 1);

INSERT INTO delitos(nombre, descripcion, usuarios_id)
VALUES ('acoso sexual', 'falta de respeto, groserias', 1);*/