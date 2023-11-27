# crudspring

Crud Spring Boot

## Creación BD en MySQL

El Gestor y base de datos a utilizar es MySQL, ejecutar primera instancia esta query para crear la BD.

`` CREATE SCHEMA `Articulo` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ; ``

## Consulta de endpoint

### Consultar articulos

`http://localhost:8090/api/v1/articulo/`

### Crear articulo

`http://localhost:8090/api/v1/articulo/`

Enviar JSON:

```
{
    "descripcion": "Iphone 8",
    "precio": 600.0
}
```

### Consultar articulo por id

`http://localhost:8090/api/v1/articulo/1`

### Eliminar articulo por id

`http://localhost:8090/api/v1/articulo/1`

### Actualizar articulo

`http://localhost:8090/api/v1/articulo/1`

Enviar JSON:

```
{
    "descripcion": "Smarth TV",
    "precio": 205.0
}
```
