# TALLER DE ARQUITECTURAS DE SERVIDORES DE APLICACIONES, META PROTOCOLOS DE OBJETOS, PATR�N IOC, REFLEXI�N

Para este taller se construyó un servidor Web (tipo Apache) en Java. El servidor puede entregar páginas html, y archivos css, js y jpg. Igualmente el servidor debe proveer un framework IoC para la construcción de aplicaciones web a partir de POJOS.  El servidor debe atender múltiples solicitudes no concurrentes.

# GU�A

---
## HERRAMIENTAS

* [Java](https://www.java.com/) - El lenguaje de programaci�n utilizado
* [Git](https://git-scm.com/) - Controlador de versiones
* [Maven](https://maven.apache.org/) - Gesti�n de dependencias

## C�MO INSTALAR

Clone el repositorio con el comando:

```
git clone https://github.com/rayo100/Taller4-AREP.git
```

Una vez clonado el repositorio nos dirigimos al directorio raiz del proyecto:

```
cd Taller4-AREP
```

Ejecute el comando:

```
mvn clean package exec:java
```

Finalmente ingrese al navegador de su preferencia y use el siguiente enlace para vizualizar la pagina:
http://localhost:35000/

## DOCUMENTACION

Para visualizar la documentación de javadoc ejecutamos el comando: 

```
mvn javadoc:javadoc
```

## TEST UNITARIOS

Nos ubicamos en el directorio principal del repositorio y ejecutamos el comando:

```
mvn test
```

## SOLUCION

En este taller creamos nuestra implementacion de las anotaciones @Component y @RequestMapping para poder simular un microfamework spring.

## EXPLICACIONES

* Patrones: Hacemos uso del patron singleton para crear una sola instancia del servidor y una sola instancia de StaticFiles.


## AUTOR

* Cesar V�squez [GitHub](https://github.com/rayo100)
