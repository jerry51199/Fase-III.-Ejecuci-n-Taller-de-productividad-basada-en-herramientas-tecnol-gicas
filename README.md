📚 Papelería Punto Escolar

Digitaliza y optimiza los procesos de tu papelería con esta aplicación web académica en Java.

Papelería Punto Escolar es un proyecto académico que facilita la gestión de inventario, control de ventas y administración de usuarios de forma intuitiva, profesional y escalable.

✨ Características principales

🛠 Gestión de inventario: CRUD completo de productos.

🧾 Control de ventas: Registro de ventas y generación automática de tickets.

🔐 Administración de usuarios: Roles Admin / Empleado con permisos específicos.

📊 Reportes inteligentes: Ventas e inventario para toma de decisiones.

✅ Pruebas automáticas: JUnit + integración CI/CD con Travis CI.

🏗 Arquitectura MVC

La aplicación sigue el patrón Modelo-Vista-Controlador (MVC), separando claramente la lógica de negocio, la presentación y los datos:

🖥 Frontend (Vista)

Tecnologías: JSP, HTML, CSS y JavaScript

Descripción: Interfaz de usuario amigable e intuitiva, donde se interactúa con el sistema.

⚙️ Servidor / Controlador

Tecnologías: Tomcat o GlassFish

Descripción: Gestiona la lógica de negocio, recibe las solicitudes del usuario y dirige las respuestas a la vista adecuada.

💾 Modelo / Base de Datos

Tecnologías: MySQL o PostgreSQL

Descripción: Almacena información crítica del sistema: usuarios, inventario y ventas.

📂 Repositorio y Control de Versiones

Tecnología: GitHub

Descripción: Controla versiones del código, ramas, commits y Pull Requests.

🔧 CI/CD

Tecnología: Travis CI

Descripción: Ejecuta pruebas automáticas y valida los commits antes de integrarlos al flujo de desarrollo.

🌿 Flujo de desarrollo

Se manejan dos ramas principales:

develop: Integración de nuevas funcionalidades

master: Código estable listo para producción

Proceso por tarea / Issue:

Crear branch de tarea: feature/hu-xx o bugfix/descripcion

Desarrollar la funcionalidad y realizar commits

Abrir Pull Request hacia develop

Travis CI ejecuta pruebas automáticamente

Merge a develop cuando las pruebas pasan

Merge a master al finalizar la versión (GA)




🖥 Uso

Iniciar sesión como Administrador o Empleado

Gestionar inventario y ventas

Generar tickets y consultar reportes

Explorar módulos según tu rol

🧪 Pruebas

Pruebas unitarias con JUnit en módulos críticos

Travis CI ejecuta pruebas automáticamente al hacer push o abrir Pull Requests

📅 Milestones

Beta: Desarrollo, pruebas iniciales y funcionalidades básicas

GA: Código final, optimizado y documentado

🏷 Etiquetas / Labels

Backend | Frontend | Usuarios | Seguridad | Login | Reporte | CI/CD | Documentación | Mejora | Bug

💻 Tecnologías

Lenguaje: Java (JSP, Servlets)

Base de datos: MySQL / PostgreSQL

IDE: NetBeans / Eclipse

Control de versiones: Git / GitHub

CI/CD: Travis CI

Pruebas: JUnit

👨‍💻 Autor

Gerardo Sánchez Muñoz
Proyecto Académico – Papelería Punto Escolar

📧 Contactar
 | 🌐 GitHub
