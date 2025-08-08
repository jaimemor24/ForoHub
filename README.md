<h1 align="center"> 💬ForoHub  </h1>


## &#128221; Descripcion


**ForoHub** es una API REST desarrollada en Java (Java 17) que permite gestionar un sistema de foros desde la consola. Utilizando Spring Boot y MySQL, esta aplicación ofrece endpoints seguros y eficientes para creación, lectura, actualización y eliminación de recursos del foro.

**Motivación:** Crear una plataforma de discusión ligera y segura, aprovechando tecnologías robustas como Spring Boot, JPA y Flyway.

**Objetivo:** Aprender e implementar un backend bien estructurado, con migraciones de base de datos, validación y seguridad integradas.

**Diagrama de flujo de la API:** Visualiza cómo interactúan el cliente, los endpoints y la lógica interna (controladores → servicios → repositorios → base de datos):


## 🚧 Proyecto🚧
![Badge Finalizado](https://img.shields.io/badge/Status-Finalizado-green
) ![Badge version](https://img.shields.io/badge/version-1.0-blue)

## 🚀 Tecnologías 
### Stack y herramientas utilizadas:

- ![JavaJDK]( https://img.shields.io/badge/-JavaJDK-000000.svg?style=flat&logo=JavaJDK)
- ![Maven]( https://img.shields.io/badge/-Maven-000000.svg?style=plastic&logo=ApacheMaven)
- ![Springboot]( https://img.shields.io/badge/-Springboot-000000.svg?style=plastic&logo=Springboot)
- ![MySQL]( https://img.shields.io/badge/-MySQL-000000.svg?style=plastic&logo=MySQL)
- ![intellijidea]( https://img.shields.io/badge/-intellijIDEA-000000.svg?style=plastic&logo=intellijidea)
- ![Insomnia]( https://img.shields.io/badge/-Insomnia-000000.svg?style=plastic&logo=Insomnia)
### Dependencias incluidas:
- ![Lombok]( https://img.shields.io/badge/-Lombok-000000.svg?style=plastic&logo=Lombok)
- ![SpringWeb]( https://img.shields.io/badge/-SpringWeb-000000.svg?style=plastic&logo=SpringWeb)
- ![SpringBootDevTools]( https://img.shields.io/badge/-SpringBootDevTools-000000.svg?style=plastic&logo=SpringBootDevTools)
- ![SpringDataJPA]( https://img.shields.io/badge/-SpringDataJPA-000000.svg?style=plastic&logo=SpringDataJPA)
- ![Flyway]( https://img.shields.io/badge/-FlywayMigration-000000.svg?style=plastic&logo=Flyway)
- ![Validation]( https://img.shields.io/badge/-Validation-000000.svg?style=plastic&logo=Validation)
- ![SpringSecurity]( https://img.shields.io/badge/-SpringSecurity-000000.svg?style=plastic&logo=SpringSecurity)
- ![MySQLDriver]( https://img.shields.io/badge/-MySQLDriver-000000.svg?style=plastic&logo=MySQLDriver)
- ![JWT]( https://img.shields.io/badge/-JWT-000000.svg?style=plastic&logo=JsonWebTokens)

## ▶️ Cómo ejecutar el proyecto
**1- Asegúrate de tener instalado:**
- Java JDK (versión recomendada 17)
- Maven
- MySQL 
- Insomnia

**2- Clona el repositorio:**
https://github.com/jaimemor24/ForoHub.git
 
 **3- Configura en application.properties los parámetros de conexión a MySQL (URL, Usuario, Contraseña).**
 
 **4- Ejecuta las migraciones Flyway al iniciar la aplicación (se ejecutan automáticamente al arrancar Spring Boot).**
 
 **5- Inicia la API:**

## 📖 Uso / EndPoints
Desde Insomnia puedes consumir los endpoints de ForoHub. Ejemplos de uso:
**Crear un tópico ( POST  /Api/topicos)**
```
{
	"id": 2,
	"titulo": "HTTP",
	"mensaje": "Error en la  requisicion",
	"autor": "fulanito de tal ",
	"curso": "HTTP en la web"
	
}
```

**Leer todos los tópicos (GET /Api /topicos)**

**Actualizar un tópico (PUT /Api /topicos) — envía JSON con campos actualizados.**
```
{
	"id": 1,
	"titulo": "Error  HTTP",
	"mensaje": "Error  requisicion"
}
```
**Eliminar un tópico (DELETE /topicos/{id})**

## Características 
- Operaciones CRUD completas para tópicos
- Estructura JSON coherente y sencilla
- Seguridad mediante Spring Security y JWT
- Persistencia con Spring Data JPA y migraciones gestionadas por Flyway
- Productividad mejorada con Lombok y Spring Boot DevTools


## 🧑‍💻 Autor
Desarrollado por - [Jaime Moral](https://github.com/jaimemor24)

Proyecto educativo inspirado por la iniciativa Alura Latam + Oracle ONE.

## 📄 Licencia
<img src="https://img.shields.io/badge/License-MIT-yellow" alt="Licencia MIT" />
Este proyecto está bajo la Licencia MIT - consulta el archivo LICENSE para más detalles.
