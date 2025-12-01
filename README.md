📘 README – Sistema de Gestión para Papelería Punto Escolar
🏪 Descripción del Proyecto

El sistema de Papelería Punto Escolar es una aplicación diseñada para digitalizar y optimizar los procesos principales de una papelería, incluyendo gestión de inventario, control de ventas, administración de usuarios y generación de reportes.

El proyecto forma parte de una entrega académica y se desarrolla bajo un enfoque profesional utilizando metodologías ágiles, GitHub como repositorio de código y Travis CI como sistema de integración continua.

🎯 Objetivos del Proyecto

Automatizar los procesos internos de la papelería.

Reducir errores en ventas e inventario.

Crear un sistema modular y escalable.

Implementar CI/CD con Travis CI.

Mantener trazabilidad completa del proyecto mediante Issues, Milestones y Pull Requests.

🧩 Funcionalidades del Sistema
✅ Implementadas en la fase BETA

Sistema de autenticación (Login).

Gestión de inventario (CRUD de productos).

Registro de ventas.

Prueba JUnit básica.

Pipeline de integración continua con Travis CI.

🚀 Planificadas para la fase GA

Alertas de stock mínimo.

Reportes de ventas e inventario.

Recuperación de contraseña.

Documentación extendida.

📌 Gestión del Proyecto
📁 Branches principales

master → versión estable del sistema

develop → rama en desarrollo

🔱 Branches por funcionalidad

feature/login

feature/inventario

feature/ventas

feature/reportes

feature/alerts

feature/travis

feature/junit

Todas las funcionalidades se integran mediante Pull Requests hacia develop.

📝 Issues

Todo el control del proyecto está documentado en la sección de Issues del repositorio.
Cada Issue incluye:

Descripción detallada

Tiempo estimado

Dependencias

Etiquetas

Milestone asignado

Criterios de aceptación

Issues principales:

Configuración inicial del proyecto

Login

CRUD Inventario

Ventas

Alertas de stock

Reportes

Travis CI

Pruebas JUnit

Documentación

🎯 Milestones

Se definieron dos etapas clave:

🎛 BETA

Incluye:

Login

Inventario

Ventas

Travis CI

JUnit básico

📦 GA (General Availability)

Incluye:

Reportes

Alertas

Documentación final

Recuperación de contraseña

🚧 Integración Continua – Travis CI

Se utiliza Travis CI para ejecutar pruebas automáticamente en cada commit o Pull Request.

📄 Archivo .travis.yml
language: java
jdk:
  - openjdk17

script:
  - mvn clean test

notifications:
  email: false

🧪 Prueba JUnit incluida

Ubicación sugerida:

src/test/java/com/papeleria/AppTest.java


Código:

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {
    @Test
    public void pruebaBasica() {
        assertTrue(true);
    }
}

🏛 Arquitectura del Sistema
[ Cliente Web ]
        |
        v
[ Servidor Java / Spring o Jakarta ]
        |
        v
[ API REST ]
        |
        v
[ Base de Datos MySQL ]
        |
        v
[ GitHub ] → Travis CI → Build/Test

🙌 Contribuciones

Para agregar código:

Crear un branch desde develop:

git checkout develop
git checkout -b feature/nueva-funcionalidad


Desarrollar la funcionalidad.

Subir el código:

git add .
git commit -m "Descripción del cambio"
git push origin feature/nueva-funcionalidad


Crear Pull Request hacia develop.

📄 Licencia

Este proyecto se utiliza con fines académicos y puede compartirse con la comunidad de código libre conforme a lo acordado con la empresa Papelería Punto Escolar.
