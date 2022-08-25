# UD26-API03

Para utilizar los endpoint es necesario hacer login atraves del body a la siguiente URL. Esta te devolvera un token en los headers con el que podras hacer cualquier otra consulta.

## URL de la API

https://ud2703.herokuapp.com/login

### Endpoints de CAJEROS

  1- Obtener una lista de los cajeros
  - GET /api/cajeros
  
  2- Obtener un cajero por su codigo
  - GET /api/cajeros/{codigo}
  
  3- Insertar un cajero nuevo desde un request body
  - POST /api/cajeros
  
  4- Actualizar un cajero indicando su codigo y sus campos en el body
  - PUT /api/cajeros/{codigo}
  
  5- Borrar un cajero por su codigo 
  - DELETE /api/cajeros/{codigo}

### Endpoints de MAQUINAS REGISTRADORAS

  1- Obtener una lista de las maquinas registradoras
  - GET /api/maquinas
  
  2- Obtener una maquina por su codigo
  - GET /api/maquinas/{codigo}
  
  3- Insertar una maquina nuevo desde un request body
  - POST /api/maquinas
  
  4- Actualizar una maquinas indicando su codigo y sus campos en el body
  - PUT /api/maquinas/{codigo}
  
  5- Borrar una maquina por su codigo 
  - DELETE /api/maquinas/{codigo}
  
### Endpoints de PRODUCTOS

  1- Obtener una lista de los productos
  - GET /api/productos
  
  2- Obtener un producto por su codigo
  - GET /api/productos/{codigo}
  
  3- Insertar un producto nuevo desde un request body
  - POST /api/productos
  
  4- Actualizar un producto indicando su codigo y sus campos en el body
  - PUT /api/productos/{codigo}
  
  5- Borrar un producto por su codigo 
  - DELETE /api/productos/{codigo}
  
### Endpoints de VENTAS

  1- Obtener una lista de las ventas
  - GET /api/ventas
  
  2- Obtener una venta por su id
  - GET /api/ventas/{id}
  
  3- Insertar una venta nuevo desde un request body
  - POST /api/ventas
  
  4- Actualizar una venta indicando su id y sus campos en el body
  - PUT /api/ventas/{id}
  
  5- Borrar una venta por su id 
  - DELETE /api/ventas/{id}
