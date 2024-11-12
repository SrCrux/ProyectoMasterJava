CREATE SCHEMA `restaurante` ;
USE `restaurante`
CREATE TABLE `restaurante`.`pedidos` (
  `id_Pedido` INT NOT NULL AUTO_INCREMENT,
  `id_Empresa` INT NULL,
  `id_Producto` INT NULL,
  `fecha` DATE NULL,
  `total` DOUBLE NULL,
  PRIMARY KEY (`id_Pedido`),
  INDEX `id_Empresa_idx` (`id_Empresa` ASC) VISIBLE,
  INDEX `id_Producto_idx` (`id_Producto` ASC) VISIBLE,
  CONSTRAINT `id_Empresa`
    FOREIGN KEY (`id_Empresa`)
    REFERENCES `restaurante`.`empresas` (`id_Empresa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `id_Producto`
    FOREIGN KEY (`id_Producto`)
    REFERENCES `restaurante`.`productos` (`id_Producto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


