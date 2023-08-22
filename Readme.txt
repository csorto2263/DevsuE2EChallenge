# DevsuE2EChallenge

Este repositorio contiene un ejemplo de prueba funcional automatizada (prueba E2E) utilizando Selenium WebDriver y el framework TestNG. La prueba simula un flujo de compra en la página https://www.demoblaze.com/.

## Instalación

1. Clona este repositorio en tu máquina local: git clone https://github.com/csorto2263/DevsuE2EChallenge.git


2. Asegúrate de tener instalado Java y el controlador Chrome WebDriver.

3. Abre el proyecto en tu IDE favorito.

4. Configura el controlador Chrome WebDriver en el archivo `PurchaseFlowTest.java` reemplazando `"ruta/del/driver/chromedriver"` con la ruta real a tu controlador.

5. Ejecuta el caso de prueba `purchaseFlowTest` que se encuentra en 'MainPageTest.java'.

## Estructura del Proyecto

- `src/main/java`: Contiene las clases de Page Object Model (POM).
- `src/test/java`: Contiene el caso de prueba `MainPageTest.java`.
- `build.gradle`: Archivo de configuración de Gradle para las dependencias y la construcción del proyecto.

