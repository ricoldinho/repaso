INSERT INTO dnis (numero, letra, fechaExpedicion, fechaValidez) VALUES 
('84324178','U','2019-01-01','2029-01-01'),
('12345678', 'K', '2022-01-01','2032-01-01'),
('87654321', 'L', '2020-01-01','2030-01-01'),
('12355555', 'M', '2021-01-01','2031-01-01');

INSERT INTO institutos (nombre, localidad, capacidadalumnos) VALUES 
('IES Los Manantiales', 'Alcorcón', 2922),
('IES El Olivo', 'Alcorcón', 22);

INSERT INTO alumnos (nombre, edad, modulo, dni_id, instituto_id) VALUES 
('Juan Perez Costa', 22, 'DAW2', 1 ,1),
('Maria Lopez Garcia', 23, 'DAW2', 2, 2),
('Pedro Sanchez Rodriguez', 21, 'DAW2', 3, 1),
('Ana Martinez Fernandez', 22, 'DAW2', 4, 1);