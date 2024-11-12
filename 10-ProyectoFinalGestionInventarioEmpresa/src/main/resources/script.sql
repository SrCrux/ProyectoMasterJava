CREATE SCHEMA `restaurante` ;
USE `restaurante`
CREATE TABLE `restaurante`.`empresas` (
  `id_Empresa` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `correo` VARCHAR(60) NULL,
  `telefono` INT NULL,
  PRIMARY KEY (`id_Empresa`));
  INSERT INTO `restaurante`.`empresas` (`id_Empresa`, `nombre`, `correo`, `telefono`) VALUES ('1', 'Dunder Mifflin', 'question@correo.com', '611223344');
INSERT INTO `restaurante`.`empresas` (`id_Empresa`, `nombre`, `correo`, `telefono`) VALUES ('2', 'Krusty Krab', 'burgercangreburger@correo.com', '611223355');
INSERT INTO `restaurante`.`empresas` (`id_Empresa`, `nombre`, `correo`, `telefono`) VALUES ('3', 'Baratie', 'sanji@correo.com', '611223366');
INSERT INTO `restaurante`.`empresas` (`id_Empresa`, `nombre`, `correo`, `telefono`) VALUES ('4', 'Portal Bostezante', 'dyd@correo.com', '611223377');
