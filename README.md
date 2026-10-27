# PruebaBanistmoAuto

Automatización web del sitio de Banistmo para acceder a la sección **Relación con Inversionistas** y descargar la documentación del **Bono de Género**.

## Tecnologías

- Java 17
- Gradle 8.8 (wrapper incluido)
- Serenity BDD 4.2.34 con Cucumber
- Patrón Screenplay
- JUnit 4
- Google Chrome

## Estructura

```
src/test/
├─ resources/features/login.feature     # Escenarios en Gherkin
└─ java/com/automation/
   ├─ runners/          # CucumberTestSuite
   ├─ stepdefinitions/  # Pasos de Gherkin conectados a las tareas
   ├─ tasks/            # Acciones del actor (abrir sitio, seleccionar menú)
   ├─ userinterfaces/   # URL y localizadores de la página
   └─ questions/        # Consultas para validar la UI
```

## Escenarios

1. Acceder a la página Relación con Inversionistas desde *Acerca de → Información Corporativa*.
2. Acceder a la sección Bono de Género.
3. Descargar el documento *Marco de referencia para la emisión de un Bono Social de Género*.

## Requisitos

- JDK 17
- Google Chrome instalado

## Ejecución

```bash
./gradlew clean test
```

En Windows:

```bash
gradlew.bat clean test
```

Al finalizar, el reporte de Serenity se genera en `target/site/serenity/`.

## Configuración

`serenity.properties` define el navegador (Chrome), el tamaño de ventana y la toma de capturas en los pasos fallidos.
