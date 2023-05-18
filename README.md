# Encapsulamiento

# Una operación aplicable a una fecha podría ser sumarle o restarle días. Si definimos el metodo addDias en la clase Fecha, quien utilice esta clase podrá sumarle días a sus fechas sin tener que conocer el algoritmo que resuelve el problema. 
# // creamos una fecha Fecha f = new Fecha("23/12/1980"); 
# // Le sumamos 180 dias f.addDias(180); Para facilitar los calculos se considera que todos los meses tienen 30 dias. 
# Por tanto, los años tendrán 360 días. El algoritmo para sumar días a una fecha consistirá en convertir la fecha a días, sumarle los días que corresponda y asignar los nuevos valores del día, mes y año en los atributos. Metodos a programar: 
# - El método addDias será el método que vamos a exponer para que los usuarios de la clase puedan invocar y así sumarle días a sus fechas. - Desarrollaremos también el método fechaToDias que retornará un entero para representar la fecha expresada en días. Este método no lo vamos a exponer. Es decir, no será visible para el usuario: será private.
# - Por último, desarrollaremos el método inverso: diasToFecha que, dado un valor entero que representa una fecha expresad en días, lo separará y asignará los valores que correspondan a los atributos dia, mes y anio. Este metodo tambien será private ya que no nos interesa que el usuario lo pueda invocar.