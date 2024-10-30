# Práctica Grupal - Caso Práctico #1

## Universidad Fidélitas
**Bachillerato en Ingeniería en Sistemas de Computación**  
**Curso:** SC-403 Desarrollo Web y Patrones

### Descripción del Proyecto
Este proyecto consiste en la implementación de una aplicación web para gestionar información sobre diferentes tipos de árboles. La aplicación permite realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre una base de datos que almacena datos relevantes de los árboles, utilizando Spring Boot y MySQL.

### Índice
- [Parte I: Base de Datos](#parte-i-base-de-datos)
- [Parte II: Proyecto y Plantilla](#parte-ii-proyecto-y-plantilla)
- [Parte III: Configuración de Propiedades](#parte-iii-configuración-de-propiedades)
- [Parte IV: Operaciones CRUD](#parte-iv-operaciones-crud)
- [Parte V: Uso de Plantillas](#parte-v-uso-de-plantillas)
- [Entrega](#entrega)

---

## Parte I: Base de Datos

1. **Creación de la Base de Datos**
   - Nombre de la base de datos: `practica`
   - Tabla: `arbol`
   - Estructura de la tabla `arbol`:
     - **id**: INT, llave primaria, autoincremental
     - **nombre_comun**: VARCHAR, nombre común del árbol
     - **tipo_flor**: VARCHAR, tipo de flor del árbol
     - **dureza_madera**: INT, dureza de la madera
     - **ruta_imagen**: TEXT, ruta de la imagen del árbol

2. **Usuario de la Base de Datos**
   - Usuario: `usuario_practica`
   - Contraseña: `la_Clave`
   - Acceso a todos los objetos de la base de datos `practica`

---

## Parte II: Proyecto y Plantilla

- **Framework utilizado**: Spring Boot
- **Nombre del proyecto**: `practica01`
- **Incorporación de Bootstrap**: Se ha utilizado Bootstrap mediante un fragmento de plantilla para la maquetación de la aplicación.

---

## Parte III: Configuración de Propiedades

- **Conexión a la Base de Datos**: Configurada para acceder a la tabla `estado`.
- **Puerto del Servidor**: El servidor web escucha en el puerto `91`.
- **Nivel de Log**: Mensajes de la consola configurados a nivel de `TRACE`, incluyendo la visualización del día del mes, así como la hora y el minuto en el log.

---

## Parte IV: Operaciones CRUD

Se han implementado las siguientes acciones:

- **Listado de Árboles**: Permite visualizar todos los registros de árboles.
- **Crear Nuevos Árboles**: Funcionalidad para añadir nuevos registros de árboles, incluyendo la carga de la imagen.
- **Actualizar Árboles**: Opción para modificar la información de un árbol existente.
- **Eliminar Árboles**: Posibilidad de eliminar un árbol de la base de datos.

*Nota: Se ha seguido la arquitectura de solución MVC vista en clase para todas las operaciones.*

---

## Parte V: Uso de Plantillas

El proyecto incluye archivos de fragmentos que contienen encabezados y pies de página para una mejor organización del contenido.

---

## Entrega

Para la entrega de esta práctica, se debe realizar un archivo ZIP con el proyecto completo (eliminando la carpeta `target`) y subirlo al enlace indicado en el campus durante la semana 6. Solo un miembro del equipo será responsable de la entrega.

---

### Instrucciones Adicionales

Asegúrese de que todos los nombres de tablas, variables, clases, campos y demás elementos se utilicen correctamente, ya que los errores en esta área pueden penalizar hasta un 30% de la calificación total de la práctica.
