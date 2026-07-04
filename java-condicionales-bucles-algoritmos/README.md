# Mi Primer Proyecto Java 🚀

¡Bienvenido a tu primer proyecto Java! Este proyecto contiene una estructura inicial muy sencilla para ayudarte a dar tus primeros pasos en el desarrollo con Java.

## Estructura del Proyecto

* **`src/com/ejemplo/Main.java`**: Contiene el código fuente principal que imprime un mensaje de "Hola Mundo" y realiza una suma matemática básica.
* **`src/com/ejemplo/BuscarDuplicados.java`**: Contiene un ejemplo práctico utilizando estructuras de datos (`List` y `Set`) para identificar elementos repetidos en una lista.
* **`src/com/ejemplo/InversorArray.java`**: Invierte un arreglo de enteros modificándolo directamente en memoria (*in-place*) usando dos punteros.
* **`src/com/ejemplo/InversorArrayStream.java`**: Invierte un arreglo de enteros utilizando Java Streams, retornando un nuevo arreglo.
* **`src/com/ejemplo/ContadorVocales.java`**: Recibe un String e indica cuántas vocales (incluidas tildes y mayúsculas/minúsculas) posee.
* **`src/com/ejemplo/MayorMenor.java`**: Recibe un arreglo de enteros desordenados y encuentra tanto el número mayor como el menor en una sola pasada de bucle.

---

## Requisitos de Instalación 🛠️

Para poder compilar y ejecutar este código en tu computadora local, necesitas tener instalado el **JDK (Java Development Kit)**. Sigue estos pasos si aún no lo tienes configurado:

1. **Descarga el JDK**:
   * Te recomendamos descargar **Eclipse Temurin** (una distribución gratuita y de código abierto de Java respaldada por la comunidad y grandes empresas).
   * Ve a [Adoptium.net](https://adoptium.net/) y descarga el instalador correspondiente para Windows (generalmente la versión LTS más reciente, como Java 17 o Java 21).

2. **Instalación**:
   * Ejecuta el instalador descargado.
   * **IMPORTANTE**: Durante la instalación en Windows, asegúrate de marcar las opciones:
     * **"Add to PATH"** (Agregar al PATH).
     * **"Associate .jar"** (Asociar archivos .jar).
     * **"Set JAVA_HOME variable"** (Establecer la variable JAVA_HOME).

3. **Verifica la instalación**:
   * Cierra todas las terminales que tengas abiertas y abre una nueva terminal (PowerShell o CMD).
   * Ejecuta el siguiente comando para confirmar que Java está listo:
     ```powershell
     java -version
     ```
     Debería devolverte la versión de Java que acabas de instalar.

---

## Cómo Ejecutar el Proyecto desde la Consola 💻

Una vez que tengas Java instalado y configurado en tu sistema, abre una terminal en la raíz de esta carpeta (`c:\Users\Usuario\Documents\GitHub\Java 1`) y ejecuta los siguientes comandos:

1. **Compilar los archivos**:
   ```powershell
   javac -d bin src/com/ejemplo/*.java
   ```
   *Esto compilará todas las clases java del proyecto en la carpeta `bin`.*

2. **Ejecutar el programa de saludo (Main)**:
   ```powershell
   java -cp bin com.ejemplo.Main
   ```

3. **Ejecutar el programa de buscar duplicados**:
   ```powershell
   java -cp bin com.ejemplo.BuscarDuplicados
   ```

4. **Ejecutar el programa de invertir arreglo (Dos punteros / In-place)**:
   ```powershell
   java -cp bin com.ejemplo.InversorArray
   ```

5. **Ejecutar el programa de invertir arreglo (Java Streams)**:
   ```powershell
   java -cp bin com.ejemplo.InversorArrayStream
   ```

6. **Ejecutar el programa de contar vocales**:
   ```powershell
   java -cp bin com.ejemplo.ContadorVocales
   ```

7. **Ejecutar el programa de encontrar el mayor y menor**:
   ```powershell
   java -cp bin com.ejemplo.MayorMenor
   ```

¡Deberías ver el mensaje de saludo y el resultado de la suma en tu terminal!
