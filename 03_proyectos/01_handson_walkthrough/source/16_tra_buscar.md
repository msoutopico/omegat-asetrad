# = Buscar =

Que no te de la impresion de que los temas que han ido quedando para el final son menos importantes. Este tema es muy importante, pero también muy fácil.

Las memorias del proyecto (interna y externas) y los glosarios pueden tener mucha información pertinente y útil, pero tal vez no siempre sea visible (p. ej. si hay poca similitud, si hay demasiadas coincidencias, etc.).

Pero hay otras maneras de explotar los recueros lingüísticos del proyecto: el potente diálogo de **Buscar texto**. Adivina como se lanza ese diálogo... ¡Bingo! Otro atajo (de nuevo, un atajo estándar que puedes usar en muchas otras aplicaciones).

Veamos un ejemplo: quieres ver cómo has (o se ha) traducido la palabra «prueba» en otras partes del proyecto, así que prueba lo siguientes: selecciona la palabra «prueba» y pulsa **Ctrl + F**, y luego haz clic en el botón **Buscar**.

Para ir a cualquiera de los resultados, puedes hacer doble clic en él.

Evidentemente también puedes lanzar el diálogo de **Buscar texto** primero y escribir el texto que quieres buscar después.

Hay muchas opciones en ese diálogo y me llegaría mucho tiempo explicártelas todas, pero por suerte todas tienen nombres bastante claros, así que te invito a que las vayas probando para que vayas descubriendo lo que hace cada una, y selecciones las que que convengan en cada caso.

Me voy a parar solo en el tipo de búsqueda. Por un lado, puedes buscar un fragmento de texto tal cual, que es útil para encontrar coincidencias exactas de la expresión que buscas. También puedes hacer que el texto que busques se trate como palabras clave, es decir, que aparezcan las palabras en el segmento pero no necesiaramente en el mismo orden. Y por último puedes buscar expresiones regulares, que son un metalenguaje para buscar texto que corresponde a un determinado patrón (que también puedes utilizar en muchas otras herramientas, no es algo exclusivo de OmegaT).

Un ejemplo fácil: selecciona la opción de expresiones regulares y busca «#\d» (sin las comillas). Has buscado una almohadilla seguida de un dígito, y los resultados arrojados por esa búsqueda incluyen referencas a números de segmento.

Otro ejemplo menos fácil: busca «(?<!#|g)\d» (sin las comillas). Estás buscando cifras que no estén precedidas de almohadillha ni de la letra g.

Las expresiones regulares son muy potentes pero pueden ser complejas. Aunque dominarlas require tiempo y experiencia, puedes aprender los principios generales en media hora, este es uno de mis tutoriales favoritos: https://www.codeproject.com/Articles/9099/The-30-Minute-Regex-Tutorial

Con esto terminamos la sección sobre traducción y empezamos la de revisión. Por supuesto, la mayoría de las cosas que hemos visto también las podrás aplicar revisando, y algunas de las que veamos en la siguiente sección también las podrás aplicar traduciendo.
