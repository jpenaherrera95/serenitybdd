# serenitybdd

Este proyecto esta orientado a la creacion de pruebas automatizadas usando Serenity BDD con el patron ScreenPlay con el navegador Mozilla

> :information_source: Este Repositorio tiene fines de aprendizaje. Fue contruido utilizando un Mac con procesador M2

## Tech Stack

| Herramienta   | Version       |
| ------------- |:-------------:|
| IntelliJ Idea | Community Edition 2023.2.5 |
| Gradle        | 7.6      |
| Java SDK      | correto-17      |
| serenity-gradle-plugin      | 2.1.4      |
| serenity-single-page-report      | 2.1.4      |
| junit-bom      | 5.9.1      |
| junit      | 4.13.2      |
| junit-jupiter      | latest      |
| serenity-cucumber      | 3.6.23      |
| serenity-core      | 3.6.23      |
| serenity-junit      | 3.6.23      |
| serenity-screenplay-webdriver      | 3.6.23      |
| serenity-screenplay      | 3.6.23      |

### Pruebas de UI: Instalación y Ejecución
> :information_source: Estamos usando Gradle para nuestras dependencias, con el comando test detallado a continuacion las vamos a instalar
Desde la carpeta serenityCucumber podemos usar este comando para ejecutar las pruebas de la UI especificando nuestro runner para la UI (test/java/com.serenity/runners/TestRunners)

```
$ ./gradlew test --tests com.serenity.runners.TestRunners
```
Una vez ejecutadas las pruebas, se genera un reporte en el directorio:
- target/site/serenity/index.html (Feature report)
- build/report/tests/test/index.html

Las configuraciones para los reportes estan en:
- test/resources/serenity.conf

## Estructura del proyecto
```
src/
|-- main/
|   |-- java/
|       |-- com/
|           |-- serenity/
|               |-- questions/                 # Aqui definimos las asersiones que un actor puede hacer
|               |-- tasks/                     # Aqui definimos las tareas que un actor puede hacer
|               |-- userInterfaces/            # Aqui creamos las interfaces de las paginas
|-- test/
|   |-- java/
|       |-- com/
|           |-- serenity/
|               |-- glue/                      # Aqui van los archivos con los stepsDefinitions
|               |-- runners/                   # Aqui configuramos los runners en base a que pruebas querramos ejecutar
|               |-- TestUtils/                 # Aqui definimos archivos que nos permiten re usar funciones
|   |-- resources/
|       |-- config/                            # Aqui van los archivos para la configuracion de ambientes
|       |-- features/                          # Aqui van los archivos de features para Serenity BDD
|       |-- UI.data/                           # Carpeta especifica de la UI para configurar data driven tests
|       |-- API.data/                          # Carpeta especifica de las API para configurar data driven tests
build.gradle                                   # Configuracion de las dependencias que vamos a usar
|-- ...
```


## Enlaces de Ayuda

- [Serenity BDD Screen Play documentación](https://serenity-bdd.github.io/docs/screenplay/screenplay_fundamentals#screenplay-and-cucumber)
- [Serenity BDD Screen Play guía de pruebas](https://serenity-bdd.github.io/docs/screenplay/screenplay_webdriver)
