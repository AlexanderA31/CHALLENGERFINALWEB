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

![imagen](https://github.com/user-attachments/assets/73581fbf-7511-4311-91a7-bb7f9e163f8a)


### Asegurarnos de descargar el chromedriver y colocarlo en la ruta especificada y de la arquitectura de las especificaciones del ordenador en este caso de 64 bits

![853deb28-b5d2-4530-9c46-a5df7737b9a1](https://github.com/user-attachments/assets/f925f1e0-d3f2-4d04-81b1-4c9c9087aac3)


Enlace: [Descargar Chromedriver](https://googlechromelabs.github.io/chrome-for-testing/)

### Asegurarnos de estar usando la versión de Java correcta 

![fef15596-209f-4b40-9152-7b17fd34dbbd](https://github.com/user-attachments/assets/82c3fef3-52c6-441a-a051-189e1402af05)

## Resultados Obtenidos

### Resultados del Test

### Ejecución del Proyecto 

![d455186e-fd1f-4cbb-a210-8649a78eee58](https://github.com/user-attachments/assets/a031649d-0f17-46c7-9d47-a6b94eebe6ba)


## Revisar los Reportes del Proyecto 

![c9cbb96a-6ff8-4a0f-84d1-f46617c88f93](https://github.com/user-attachments/assets/3254e4fa-f31c-4a4c-a331-34d13bc988ae)

## Reportes 

![fb2a236d-5f1b-4fb0-acd5-926fd824257d](https://github.com/user-attachments/assets/b5b63ce0-bdbb-46e4-8d3e-e93d5c71ae71)

![cca97bf6-b419-44ff-a0a8-59533fdd8e90](https://github.com/user-attachments/assets/6de32609-373d-4d15-8956-8a2a655cd316)




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
