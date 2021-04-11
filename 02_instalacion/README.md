# Instalación

## Descarga e instalación

OmegaT puede instalarse de varias maneras. Para usuarios de Windows o Mac, la más fácil es descargar el fichero ejecutable de [https://omegat.org/](https://omegat.org/).

También es posible instalar OmegaT en la línea de comandos mediante el gestor de paquetes del sistema operativo (p. ex. `apt` en Debian o Ubuntu, `pacman` en Manjaro, etc.). En Windows 10 existe un paquete[1] para `chocolatey`, el gestor de paquetes de PowerShell:

```
choco install omegat --pre
```

Para poder instalar OmegaT mediante el gestor de paquetes `chocolatey`, es necesario instalar `chocolatey` previamente[2].


## Optimización y extensiones

Por razones históricas y de modelo de desarrollo, la instalación de OmegaT tiene opciones predefinidas que no siempre son las más convenientes. Sin embargo, cada usuario puede personalizarla según sus preferencias.

Para agilizar esa operación, he preparado un paquete con los ficheros de configuración de usuario con las preferencias que yo recomiendo. Para utilizarlos, debes ir a [https://github.com/msoutopico/omegat-asetrad](https://github.com/msoutopico/omegat-asetrad) > [02_optimizacion](https://github.com/msoutopico/omegat-asetrad/tree/main/02_optimizacion), y descargar el fichero [`user_config.zip`](https://github.com/msoutopico/omegat-asetrad/raw/main/02_optimizacion/user_config.zip).

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

[2] https://jcutrer.com/windows/install-chocolatey-choco-windows10
