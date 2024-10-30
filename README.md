# Práctica Grupal - Caso Práctico #1

¡Hola y bienvenidos a nuestro proyecto sobre la gestión de árboles! 🎉

## Descripción del Proyecto

Este proyecto es parte de nuestra práctica grupal en el curso de Desarrollo Web y Patrones en la Universidad Fidélitas. Hemos creado una aplicación web que permite gestionar información sobre diferentes tipos de árboles. La app está diseñada para realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) utilizando Spring Boot y una base de datos MySQL.

## Funcionalidades Principales

- **Gestión de Árboles**: Podrás listar, agregar, modificar y eliminar árboles en nuestra base de datos.
- **Interfaz Amigable**: La aplicación utiliza Bootstrap para una experiencia de usuario más atractiva y responsiva.
- **Base de Datos**: Se ha configurado una base de datos llamada `practica` que almacena información relevante sobre los árboles, como su nombre común, tipo de flor y más.

## Estructura del Proyecto

### Base de Datos

Hemos creado una tabla llamada `arbol` con los siguientes campos:

- **id**: Llave primaria autoincremental.
- **nombre_comun**: El nombre común del árbol.
- **tipo_flor**: Tipo de flor que tiene.
- **dureza_madera**: La dureza de su madera.
- **ruta_imagen**: La ruta de la imagen del árbol.

### Proyecto y Plantilla

El proyecto está construido con Spring Boot, y hemos incluido Bootstrap para la maquetación. Esto nos ha permitido crear una interfaz intuitiva y moderna.

### Configuración

Para que la aplicación funcione, asegúrate de que el servidor esté escuchando en el puerto `91` y que la conexión a la base de datos esté correctamente configurada. También hemos configurado el nivel de log a `TRACE` para facilitar la depuración.

### Operaciones CRUD

Hemos implementado las siguientes funcionalidades:

- **Listar árboles**: Visualiza todos los registros en la base de datos.
- **Crear nuevos árboles**: Agrega registros nuevos, junto con una imagen.
- **Actualizar árboles**: Modifica la información de los árboles existentes.
- **Eliminar árboles**: Borra registros que ya no necesites.

## Consejos Útiles

- **Validaciones**: Asegúrate de implementar validaciones para mantener la integridad de los datos al agregar o modificar registros.
- **Organización del Código**: Mantén una estructura clara en tus archivos y fragmentos para facilitar la colaboración y el mantenimiento.

## Entrega

Cuando estemos listos para entregar, empaquetaremos todo el proyecto en un archivo ZIP (sin la carpeta `target`) y lo subiremos al enlace correspondiente en el campus. Recuerda que solo un miembro del equipo debe hacer la entrega.

---

¡Esperamos que disfruten utilizando nuestra aplicación y que les sirva de referencia para sus propios proyectos! Si tienen alguna pregunta o comentario, no duden en dejarnos un mensaje.
