# UTEC_PF_MOVILES 
 Un comercio de Barrio desea implementar el sorteo de una canasta navideña para sus clientes que hacen compras superiores a 500$. Para esto se requiere
implementar una aplicación en Android que permita ingresar el Boleto para Sorteo de Canasta de cada cliente que cumple con los requerimientos para participar.
Cada registro incluye los datos basicos del cliente y ademas se le asigna un número secuencial que será utilizado para realizar el sorteo.
Los datos de un boleto para el sorteo Proyecto de LTI son:
- Nombre del cliente (String).
- Apellido del cliente (String).
- Cedula Identidad (Integer).
- Telefono del cliente (Integer).
- Numero boleto (Integer). (No se captura)
- Fecha (String yyyy-mm-dd) (No se captura)
** Nota: ** El número de boleto y fecha no se capturan y se asignarán en forma automatica en cada captura de datos
Se pide:
Crear la clase de Java BoletoSorteoCanasta con los atributos mencionados anteriormente con su constructor(es) , getters y setters y toString() que muestre la
totalidad de los valores para cada uno de los campos.
Confeccionar el MainActivity con el formulario que permita capturar los atributos antes mencionados (Excepto el numero de boleto y la fecha).
Todos los atributos son obligatorios, excepto el Nombre del cliente. CI y Apellido son suficientes para identificar al cliente. El teléfono es obligatorio a los efectos de
poder contactar al cliente ganador.
Para la cédula y el teléfono del cliente, el usuario de la Aplicacion solo podrá ingresar dígitos.
El formulario debe tener un botón denominado Ingresar Datos para ingresar los datos al sistema.

El comportamiento del botón debe cumplir lo siguiente:
- Si hay datos faltantes se deberán marcar los campos que requieren contenido (indicando que el campo es obligatorio) a los efectos de que el usuario complete el
formulario.
- Si se ingresaron en forma correcta los datos se hace lo siguiente
- Se genera mensaje de texto “Se ha ingresado el boleto para el sorteo para el cliente <nombre> <apellido> con CI <cedulaIdentidad>” (el mensaje se muestra al
usuario usando “Toast” de Android).
- Se cebe crear el boleto (instancia de la clase de Java BoletoSorteoCanasta) con los cuatro datos ingresados.
- En el LogCat de Android imprimimos el bloeto creado utilizando el metodo toString del objeto BoletoSorteoCanasta.
La impresion en el LogCat se hace utilizando el método Log.i(<tag> , <texto>) .
- Finalmente se borran todos los campos a los efectos de que se ingrese otro registro de proyectos.

# Segunda parte

Continuando con la realidad del Ejercicio P1 se pide agregar en MainActivity todo lo necesario para que cuando se ingresan datos en forma exitosa del nuevo Boleto,
se envíen la informacion de Nombre,Apellido,Telefono y Cedula a otra pantalla de la aplicación denominada EnvioActivity.
- Este nuevo Activity debe ser capaz de recuperar la información enviada y cargada de manera tal que se disponga del objeto BoletoSorteoCanasta con los cuatro
campos capturados.
- Generar el proximo numero de boleto (usando un contador) y cargarlo en el campo numeroBoleto.
- Obtener fecha actual del momento y generar el texto del valor de la fecha y cargarlo en el campo “fecha” del boleto
Mostrar todos los campos en la pantalla de EnvioActivity (incluyendo numeroBoleto y fecha).
Esta pantalla es similar a la del ingreso pero se muestran ahora ademas la fecha y el numero de boleto. Todos los campos no deben ser editables.
- EnvioActivity debe tener un botón que permite volver a la pantalla de ingreso de datos, mostrando el formulario con los campos vacíos, listos para ingresar nuevos
registros.
