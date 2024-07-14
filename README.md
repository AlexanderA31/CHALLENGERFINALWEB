# NTT DATA FINAL EJERCICIO AUTOMATIZACIÓN

Esta automatización está hecha en base a Selenium y Cucumber para NTT DATA.

## Requisitos de Instalación

### Herramientas Necesarias

1. **Java Development Kit (JDK)**
   - Asegúrate de tener instalada la versión 8 o superior.
   - [Descargar JDK](https://www.oracle.com/java/technologies/javase-downloads.html)

2. **Apache Maven**
   - Herramienta de gestión de dependencias y construcción de proyectos.
   - [Descargar Maven](https://maven.apache.org/download.cgi)

3. **Selenium WebDriver**
   - Biblioteca para la automatización de navegadores.
   - La dependencia de Maven se incluye en el archivo `pom.xml`.

4. **Cucumber**
   - Herramienta para pruebas BDD (Behavior Driven Development).
   - La dependencia de Maven se incluye en el archivo `pom.xml`.

5. **IDE de Desarrollo**
   - Se recomienda IntelliJ IDEA o Eclipse.
   - [Descargar IntelliJ IDEA](https://www.jetbrains.com/idea/download/)

### Configuración del Proyecto

1. **Clonar el Repositorio**
   ```bash
   git clone https://github.com/AlexanderA31/CHALLENGERFINALWEB.git
    
### Instalar Dependencias

Una vez importado el proyecto, Maven descargará automáticamente todas las dependencias especificadas en el archivo `pom.xml`. 

![imagen](https://github.com/user-attachments/assets/c5f22d5e-bffa-47f6-9de3-82060dfbefa3)

### Asegurarnos de descargar el chromedriver y colocarlo en la ruta especificada y de la arquitectura de las especificaciones del ordenador en este caso de 64 bits

![imagen](https://github.com/user-attachments/assets/853deb28-b5d2-4530-9c46-a5df7737b9a1)

Enlace: [Descargar Chromedriver](https://googlechromelabs.github.io/chrome-for-testing/)

### Asegurarnos de estar usando la versión de Java correcta 

![imagen](https://github.com/user-attachments/assets/fef15596-209f-4b40-9152-7b17fd34dbbd)

## Resultados Obtenidos

### Resultados del Test

### Ejecución del Proyecto 

![imagen](https://github.com/user-attachments/assets/d455186e-fd1f-4cbb-a210-8649a78eee58)

## Revisar los Reportes del Proyecto 

![imagen](https://github.com/user-attachments/assets/c9cbb96a-6ff8-4a0f-84d1-f46617c88f93)

## Reportes 

![imagen](https://github.com/user-attachments/assets/fb2a236d-5f1b-4fb0-acd5-926fd824257d)
![imagen](https://github.com/user-attachments/assets/cca97bf6-b419-44ff-a0a8-59533fdd8e90)


## Estructura del Proyecto

```plaintext
├── drivers
│   ├── chromedrivers.exe
├── src
│   └── test
│       └── java
│           └── com.nttdata
│               ├── page
│               │   └── BlazePage
│               ├── runner
│               │   └── RunnerTest
│               ├── steps
│               │   └── BlazeStep
│               ├── Stepsdefinitions
│                   └── BlazeStepDef
└── resources
    └── features
        └── Blaze.feature
├── pom.xml
├── conclusiones.txt
└── README.md
