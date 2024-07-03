CREATE TABLE CANDIDATO (
   ID BIGINT NOT NULL AUTO_INCREMENT,
   NOMBRE VARCHAR(255) NOT NULL,
   APELLIDO VARCHAR(255) NOT NULL,
   EMAIL VARCHAR(255) NOT NULL,
   GENERO VARCHAR(20),
   TELEFONO VARCHAR(20),
   EXPECTATIVA_SALARIAL DECIMAL(10, 2),
   PRIMARY KEY (ID)
);
INSERT INTO CANDIDATO (NOMBRE, APELLIDO, EMAIL, GENERO, TELEFONO, EXPECTATIVA_SALARIAL) VALUES
('Juan', 'Pérez', 'juan.perez@email.com', 'Masculino', '1234567890', 45000.00),
('María', 'López', 'maria.lopez@email.com', 'Femenino', '0987654321', 50000.00),
('Carlos', 'González', 'carlos.gonzalez@email.com', 'Masculino', '2345678901', 55000.00),
('Lucía', 'Martínez', 'lucia.martinez@email.com', 'Femenino', '3456789012', 60000.00),
('Eduardo', 'Rodríguez', 'eduardo.rodriguez@email.com', 'Masculino', '4567890123', 65000.00),
('Sofía', 'Hernández', 'sofia.hernandez@email.com', 'Femenino', '5678901234', 70000.00),
('David', 'Sánchez', 'david.sanchez@email.com', 'Masculino', '6789012345', 75000.00),
('Ana', 'García', 'ana.garcia@email.com', 'Femenino', '7890123456', 80000.00),
('Roberto', 'Díaz', 'roberto.diaz@email.com', 'Masculino', '8901234567', 85000.00),
('Lorena', 'Jiménez', 'lorena.jimenez@email.com', 'Femenino', '9012345678', 90000.00);