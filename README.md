# Documentación API-Servlet

Este proyecto es una aplicación web desarrollada con Java, utilizando Servlets para manejar las peticiones HTTP. El proyecto está configurado para ser desplegado en un servidor Tomcat y utiliza Maven como sistema de gestión y construcción de proyectos.

## Requisitos

- JDK 17
- Apache Maven
- Apache Tomcat

## Configuración del Proyecto

El archivo `pom.xml` contiene la configuración de Maven, incluyendo las dependencias necesarias y la configuración para el plugin de Tomcat, lo que permite desplegar la aplicación directamente desde Maven.

```xml
<dependency>
    <groupId>jakarta.platform</groupId>
    <artifactId>jakarta.jakartaee-api</artifactId>
    <version>9.1.0</version>
    <scope>provided</scope>
</dependency>
```

## Estructura del Proyecto

El proyecto sigue la estructura estándar de Maven para proyectos web:

  - src/main/java: Contiene los Servlets y otras clases Java.
  - src/main/webapp: Contiene los archivos JSP, HTML y otros recursos web como CSS o JavaScript.

## Servlets Implementados

ProductoServlet
Este Servlet maneja las peticiones GET y muestra una página HTML simple con un mensaje.

```java
@WebServlet("/producto")
public class ProductoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // Implementación
    }
}
```

## ParametroGetServlet

Este Servlet maneja las peticiones GET y muestra una página HTML que varía su contenido según los parámetros recibidos en la URL.

```java
@WebServlet("/parametros/url-get")
public class ParametroGetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Implementación
    }
}
```

## Despliegue

Para desplegar la aplicación, se puede utilizar el plugin de Tomcat de Maven configurado en el pom.xml. Asegúrate de tener un servidor Tomcat corriendo y configurado correctamente.

```cmd
  mvn tomcat7:deploy
```

## Acceso a la Aplicación

Una vez desplegada, la aplicación estará accesible desde un navegador web en la URL configurada para el servidor Tomcat, usualmente `http://localhost:8080/nombreDeLaAplicacion`.
