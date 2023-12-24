# serenitybdd

Este proyecto consta de dos partese:
- Automatizacion de UI con Serenity BDD utilizando el patron de diseño ScreenPlay
- Automtizacion de API utilizando la herramienta Karate

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
| karate      | XXX      |

## Instalación y Ejecución

Como podemos observar estamos utilizando Gradle para manejar nuestras dependencias, al momento de ejecutar las pruebas (comando test) procederemos a configurar las dependencias, es por este motivo que:

### Pruebas de UI
Desde la carpeta serenityCucumber podemos usar este comando para ejecutar las pruebas de la UI especificando nuestro runner para la UI (test/java/com.serenity/runners/TestRunners)

```
$ ./gradlew test --tests com.serenity.runners.TestRunners
```
Una vez ejecutadas las pruebas, se genera un reporte en el directorio:
- target/site/serenity/index.html
Las configuraciones para los reportes estan en:
- test/resources/serenity.conf

### Pruebas de API
Desde la carpeta serenityCucumber podemos usar este comando para ejecutar las pruebas de las APIs especificando nuestro runner para las APIs (test/java/com.serenity/runners/XXX)

```
$ ./gradlew test --tests com.serenity.runners.TestRunners
```
Una vez ejecutadas las pruebas, se genera un reporte en el directorio:
- target/site/serenity/index.html
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


## Enlaces de ayuda

- [Serenity BDD Screen Play documentación](https://serenity-bdd.github.io/docs/screenplay/screenplay_fundamentals#screenplay-and-cucumber)
- [Serenity BDD Screen Play guía de pruebas](https://serenity-bdd.github.io/docs/screenplay/screenplay_webdriver)
