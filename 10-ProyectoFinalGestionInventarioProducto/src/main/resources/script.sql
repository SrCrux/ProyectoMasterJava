CREATE SCHEMA `restaurante` ;
USE `restaurante`
CREATE TABLE `restaurante`.`productos` (
  `id_Producto` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `categoria` VARCHAR(45) NULL,
  `precio` DOUBLE NULL,
  `stock` INT NULL,
  PRIMARY KEY (`id_Producto`));
  INSERT INTO `restaurante`.`productos` (`id_Producto`, `nombre`, `categoria`, `precio`, `stock`) VALUES 
('1', 'Pollo', 'Carne', '7.99', '5'),
('2', 'Salmon', 'Pescado', '15.5', '6'),
('3', 'Cebolla', 'Verdura', '2.89', '20'),
('4', 'Salsa Cesar', 'Salsa', '4.5', '12'),
('5', 'Fresa', 'Fruta', '4.85', '8'),
('6', 'Ternera', 'Carne', '12.99', '4'),
('7', 'Atun', 'Pescado', '10.99', '8'),
('8', 'Zanahoria', 'Verdura', '3.49', '15'),
('9', 'Mayonesa', 'Salsa', '5.99', '10'),
('10', 'Plátano', 'Fruta', '3.99', '12'),
('11', 'Presa iberica', 'Carne', '19.99', '6'),
('12', 'Salmon Ahumado', 'Pescado', '18.99', '5'),
('13', 'Pimiento', 'Verdura', '4.99', '10'),
('14', 'Mostaza', 'Salsa', '6.99', '8'),
('15', 'Mango', 'Fruta', '5.99', '4'),
('16', 'Hamburguesa', 'Carne', '8.99', '15'),
('17', 'Bacalao', 'Pescado', '16.99', '4'),
('18', 'Pepino', 'Verdura', '5.49', '3'),
('19', 'Ketchup', 'Salsa', '7.99', '11'),
('20', 'Naranja', 'Fruta', '6.99', '10'),
('23', 'Lechuga', 'Verdura', '3.99', '18'),
('24', 'Ranchera', 'Salsa', '9.99', '9'),
('25', 'Cherry', 'Fruta', '7.99', '12'),
('26', 'Carne mechada', 'Carne', '10.99', '8'),
('27', 'Merluza', 'Pescado', '18.99', '5'),
('28', 'Espinacas', 'Verdura', '4.99', '15'),
('29', 'Alioli', 'Salsa', '10.99', '10'),
('30', 'Coco', 'Fruta', '8.99', '11'),
('31', 'Chuletas', 'Carne', '12.99', '7'),
('32', 'Gambas', 'Pescado', '19.99', '4'),
('33', 'Puerro', 'Verdura', '5.99', '12'),
('34', 'Salsa de Soja', 'Salsa', '11.99', '9'),
('35', 'Mango', 'Fruta', '9.99', '10'),
('36', 'Cordero', 'Carne', '14.99', '6'),
('37', 'Mejillones', 'Pescado', '16.99', '5'),
('38', 'Ajo', 'Verdura', '3.99', '20'),
('39', 'Salsa de Curry', 'Salsa', '12.99', '11'),
('40', 'Papaya', 'Fruta', '10.99', '12'),
('41', 'Alitas de pollo', 'Carne', '9.99', '8'),
('42', 'Sardinas', 'Pescado', '13.99', '6'),
('43', 'Champiñones', 'Verdura', '6.99', '15'),
('44', 'Salsa de Aguacate', 'Salsa', '13.99', '10'),
('45', 'Frambuesa', 'Fruta', '11.99', '11'),
('46', 'Bacon', 'Carne', '15.99', '5'),
('47', 'Lenguado', 'Pescado', '17.99', '4'),
('48', 'Coliflor', 'Verdura', '5.99', '12'),
('49', 'Salsa de Queso', 'Salsa', '14.99', '9'),
('50', 'Piña', 'Fruta', '12.99', '10');