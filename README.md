- API REST Empresa-Producto-Pedido
Este repositorio contiene tres microservicios desarrollados en Spring Boot para gestionar pedidos. La aplicación utiliza una base de datos MySQL de la que se adjuntan los scripts en el repositorio. Expone sus funcionalidades a través de una API REST que se muestran a traves del navegador.

Características Principales:
•	Arquitectura basada en microservicios
•	Uso base de datos MySQL.
•	Relaciona el microservicio pedido con el microservicio de empresa y con el microservicio de producto.
•	Exposición de endpoints para interactuar con todas las entidades.
Tecnologías Utilizadas
•	Spring Boot: Infraestructura para microservicios eficiente.
•	Swagger: Documentación y visualización de API RESTful.
•	JUnit: Marco para pruebas unitarias en Java.
Inicio Rápido
1.	Clonar el repositorio: git clone https://github.com/SrCrux/ProyectoMasterjava.git
2.	Acceder al directorio del proyecto: cd xxx
Entidades
1.	Empresa: Representa a una empresa con las propiedades código de empresa, nombre, correo y teléfono.
2.	Producto: Representa un producto con las propiedades código de producto, nombre, categoria, precio y stock.
3.	Pedido: Representa un pedido con las propiedades código de pedido, código de empresa, código de producto, cantidad, fecha y total.
 
Servicio Empresa

Este microservicio proporciona funcionalidades para la gestión de empresas.

Funcionalidades
1.	Listar todas las empresas
2.	Crear una nueva empresa
3.	Buscar una empresa
4.	Eliminar una empresa

Endpoints

Puerto 8080
1.	Listar todas las empresas
  URL: /empresas
  Método: GET
2.	Crear una nueva empresa
  URL: /empresas
  Método: POST
3. Buscar una empresa
  URL: /empresas/{idEmpresa}
  Método: GET
4. Eliminar una empresa
  URL: /empresas/{idEmpresa}
  Método: DELETE

Servicio Producto

Este microservicio proporciona funcionalidades para la gestión de productos.

Funcionalidades
1.	Listar todos los productos
2.	Crear nuevos productos
3.	Modificar un producto
4.	Eliminar un producto
5.	Actualizar el stock de productos
6.	Recibir el precio de un producto

Endpoints

Puerto 8081
1.	Listar todos los productos
  URL: /productos
  Método: GET
2.	Crear un nuevo producto
  URL: /productos
  Método: POST
3. Modificar un producto
  URL: /productos
  Método: PUT
4. Eliminar un producto
  URL: /productos/{idProducto}
  Método: DELETE
5. Actualizar stock producto
  URL: /productos/{idProducto}/{unidades}
  Método: PUT
6. Recibir el precio de un producto
  URL: /productos/precio/{idProducto}

Servicio Pedido

Este interaccionará con el servicio de empresa y el servicio de producto para ofrecer su funcionalidad.

Funcionalidades
1. Realizar un pedido. Al realizar un pedido se actualiza el stock en el microservicio productos y se recoge el valor de cada producto para averiguar el total.
2. Listar pedidos por empresa. Como el microservicio de pedidos no dispone de los datos de las empresas, se crea una clase DAO para conseguir el id de la empresa.

Endpoints

•	Puerto 8082
1.	Realizar un pedido
  URL: /pedidos
  Método: POST
2.	Listar pedidos por empresa
o	URL: /pedidos/{idEmpresa}
o	Método: GET
