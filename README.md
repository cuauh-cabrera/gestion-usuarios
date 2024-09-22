## Sistema de Gestión de Usuarios
Aplicación que permite la gestión de usuarios mediante la implementación de permisos basados en estados (Activo, Inactivo, Revocado). La aplicación permite la consulta y persistencia de registros en una Base de Datos Relacional (MySQL) mediante la implementación de una API REST desarrollada con Spring y Spring Boot.

La gestión de permisos, autenticación y autorización se desarrolló a través de Spring Security a través de métodos de encriptamiento de contraseñas.

Para el desarrollo de la interfaz de usuario (IU) se utilizó la biblioteca de plantillas Thymeleaf que permite una integración nativa con Spring Boot y Spring Security.



## Requirimientos

* Spring Framework
* SpringBoot
* Spring Security
* Thymeleaf
* MySQL

## Dependencias
La información detallada de las dependencias externas puede ser consultada en el archivo pom.xml

## Project Build
Para la instalación del proyecto se necesita:

*	Java JDK 8 o superior
*	Maven 3.1.1 o superior
*	Git
* IDE (IntelliJ, Netbeans,Eclipse, VScode)

Clona el proyecto mediante Maven para inicializar el servidor

	$ mvn clean install


