# Instalación

## Descarga e instalación

OmegaT puede instalarse de varias maneras. Para usuarios de Windows o Mac, la más fácil es descargar el fichero ejecutable de [https://omegat.org/](https://omegat.org/).

OmegaT requiere que la versión 1.8 o superior de Java Runtime Environment (JRE) esté instalada en el ordenador, pero se facilita un instalador que incluye su propio JRE. Se recomienda esta versión.

### Instalación en la línea de comandos

También es posible instalar OmegaT en la línea de comandos mediante el gestor de paquetes del sistema operativo. Esta modalidad de instalación es muy cómoda pero las versiones disponibles en el gestor de paquetes tienden a quedarse un poco anticuadas.

En Linux puede instalarse con los gestores de paquetes `apt` (en Debian o Ubuntu), `pacman` (en Manjaro) y en Windows 10 existe un paquete de OmegaT[1] para `chocolatey`, un gestor de paquetes para PowerShell[2]:

```
choco install omegat --pre
```



### Versiones

Versión "estándar" y versión "más reciente". >>>


## Optimización y extensiones

Por razones históricas y de modelo de desarrollo, la instalación de OmegaT tiene opciones predefinidas que no siempre son las más convenientes. Sin embargo, cada usuario puede personalizarla según sus preferencias.

Para agilizar esa operación, he preparado un paquete con los ficheros de configuración de usuario con las preferencias que yo recomiendo. Para utilizarlos, debes ir a [https://github.com/msoutopico/omegat-asetrad](https://github.com/msoutopico/omegat-asetrad) > [02_instalacion](https://github.com/msoutopico/omegat-asetrad/tree/main/02_optimizacion), y descargar el fichero [`user_config.zip`](https://github.com/msoutopico/omegat-asetrad/raw/main/02_optimizacion/user_config.zip).

Acto seguido, deberás descomprimir los contenidos de ese fichero en la carpeta de configuración de usuario de OmegaT. Puedes llegar a ella de dos maneras:

1. En OmegaT: **Opciones > Preferencias > Acceso a carpeta de configuración**.

2. **Win+R**, abrir: `%appdata%/OmegaT`

El paquete `user_config.zip` que se descarga desde el enlace de arriba incluye varias optimizaciones:

* Configuración
  * Filtros
  * Autotexto
  * Preferencias de la interfaz
  * etc.
* Scripts
  * Adaptar etiquetas
  * Exportar proyecto como Excel
  * etc.
* Plugins
  * [OMT package](https://github.com/briacp/plugin-omt-package/releases/)
  * [Filtros de Okapi](https://bintray.com/okapi/Distribution/OmegaT_Plugin)
* Verificación ortográfica
   * Diccionarios para lenguas españolas

Notas

[1] https://community.chocolatey.org/packages/omegat

[2] Para poder instalar OmegaT mediante el gestor de paquetes `chocolatey`, es necesario instalar `chocolatey` previamente, ver: https://jcutrer.com/windows/install-chocolatey-choco-windows10
