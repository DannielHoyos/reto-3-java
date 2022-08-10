# reto-3-java
Misión Tic 2022 Ciclo #2 Universidad Nacional

Louvre, Prado y Moma, son famosos museos de categorial mundial. Estos museos coleccionan obras de arte y siempre desean tener mas obras en su colección. Para facilitar la renovación de colección los museos intercambian obras. Estos museos luchan para tener "la colección sagrada": Una lista de obras que ha sido definida Google Arts & Culture (https://artsandculture.google.com/)

Cada museo siempre tiene una lista con los números de las obras que les faltan para completar "la Colección Sagrada" y otra lista con los números de las obras que estan dispuestas a intercambiar. 

Adicionalmente, han notado que las obras que coleccionan, pueden ser categorizadas (Arte Moderno, Arte Barroco, Puntillismo, etc) y han decido numerar éstas categorias 1, 2, 3, 4, 5, .., etc.

Usted trabaja en una empresa de desarrollo de software que se ha dado cuenta que estos museos requieren un programa que les haga mas facil la categorización y el intercambio de obras.  Es una gran oportunidad de negocio y la empresa va a construir el software y luego lo va a vender a estos museos.  El software tiene muchas funciones y usted va a trabajar como desarrollador en los módulos iniciales. El arquitecto de Software, le indica a usted, unos requerimientos para construir una clase de Java que hace parte del módulo más importante.  El arquitecto le pide que ésta clase se llame Obra.

1). (Vale 1) El arquitecto solicita que exista un metodo llamado "clases" que dada una lista de enteros, donde cada entero es la categoria de la obra, retorne una lista con las categorias únicas.

Por ejemplo, suponiendo que 10 obras son categorizadas de la siguiente manera:

[1,2,5,5,5,1,2,5,5,5]

la función debe retornar la lista

 [1,2,5]

2).  (Vale 1) El arquitecto solicita que exista un metodo llamado "meFaltanDeLaClase"  el cual recibe tres parámetros. El primero es un lista con las obras que a un museo le hacen falta para completar la Colección Sagrada. El segundo es una lista de las categorias a la que pertenece cada una de las obras de la Colección Sagrada. El tercero es un entero representando una de las categorias. Este método debe retornar una lista con los números de obra que faltan para completar pero que son de la categoria especificada en el tercer parámetro.

Por ejemplo si se ejecuta la función:

meFaltanDeLaClase([1,3,6,8], [1,2,5,5,5,1,2,5,5,5], 5)

debe retornar la lista

[3,8]

Por ejemplo si ejecutan la

función:

meFaltanDeLaClase([1,3,6,8], [1,2,5,5,5,1,2,5,5,5], 2)

 Se debe retornar la lista:

[1,6]

 3). (Vale 1) El arquitecto solicita que exista un metodo llamado "noTengo" que dada una lista con las Obras que tiene el museo A, una lista con las obras que tiene el museo B, retorne la lista con las obras que son de interés para el museo B (Las que tiene A que no tiene B).

Por ejemplo si se llama:

notengo([3,5,7,10,15,16],[4,10,5,8])

Se debe retornar la lista:

[3,7,15,16]

4.  (Vale 1). Algunos museos han desarrollado la capacidad de generar duplicados certificados de las obras. Esto les permite intercambiar obras y así mismo facilitar el proceso para completar la Colección Sagrada. El arquitecto solicita que exista un metodo llamado "puedoCambiar" que reciba la lista de duplicados que tiene el museo A y la lista de duplicados que tiene el museo B y que retorne el número de obras que pueden cambiar.

Por ejemplo, llamar la función:

puedocambiar([3,5,7,10,15,16],[4,10,5,8])

Debe retornar

2

Porque al museo B le interesan las obras [3,7,15,16] del museo A, mientras que al museo A solo le interesan las obras [4,8] del museo B. Para que sea evaluada correctamente, la función debe retornar un Integer.

Entrada:

Este programa no requiere entrada. Ni generará salida. Se requiere que el estudiante genere un archivo con el nombre Obra.java sin main y que se respeten los nombres de las funciones dadas y sus parámetros.

