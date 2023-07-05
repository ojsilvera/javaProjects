# Projecto entidad financiera Byte Bank

**Modelado de Entidades**
	
    Entidad: cuenta
	Atributos: idCuenta, idSucursal, idTitular, saldo

    Entidad: Cliente
    Atributos: idTitular, nombre, documento, direccion, telefono

    Entidad: empleado
    Atributos: idEmpleado, idSucursal, idCargo, nombre, edad, direccion,. telefono, salario
    
    Entidad: sucursal
    Atributos: idSucursal, direccion, telefono

    Entidad: cargo
    Atributos: idcargo, nombre

    Entidad: contratista(Hereda de la clase padre empleado)
    Atributos: idempresa, idScursal, nombreempresa, idjefedirecto

    Entidad: ControlBonificacion
    Atributos: suma
    
    Entidad: Contatista
    Atributos: N/A
    
    Entidad: Gerente
    Atributos: N/A
    
    Entidad: Secretaria
    Atributos: N/A
    
    Entidad: Contador
    Atributos: N/A



**Aciones por entidad**

    Entidad: cuenta
    Acciones: Crear
              Depositar
              Transferir
              retirar
              Consultar atributos

    Entidad: Cliente
    Acciones: Crear
              Consultar atributos

    Entidad: sucursal
    Acciones: Crear
              Consultar atributos

    Entidad: empleado
    Acciones: Crear
              Consultar atributos

    Entidad: cargo
    Acciones: Crear
              Consultar atributos

    Entidad: contratista(Hereda de la clase padre empleado)
    acciones: crear
              Consultar atributos

    Entidad: ControlBonificacion
    acciones: registrarSalario

    Entidad: Contatista
    acciones: N/A
    
    Entidad: Gerente
    acciones: N/A
    
    Entidad: Secretaria
    acciones: N/A
    
    Entidad: Contador
    acciones: N/A

**Reglas de negocio**

Aumentar salario por bono segun el cargo

    Entidad: cargo
    Accion: Boniificar +10% funcionarios
            Boniificar +100% gerentes

Solucion propuesta:

    El cargo tiene un porcentaje de bonificacion asignado en la entidad cargo, por lo tanto
    atraves del empleado y segun su cardo, puedo obtener el bono propuesto para el con la siguiente
    expesion:

        empleado2.getidCargo().getBono()
    
    donde:
    
     - empleado es la instancia del objeto empleado creado previamente
     - getidCargo() -> es el id asociado al cargo del objeto empleado
     - getBono() -> es el entero que corresponde al cargo consultado ene l paso anterior

Implementar control de cantidad de bonos entregado a los empleados y contratistas

    Entidad: ControlBonificacion
    Acciones: Acumular el neto de los bonos entregado, sumarlos y mostrar total en consola

Solucion propuesta:

    Implementar metodo que reciba el salario
    Obtener el valor del bono a traves del id del bono aplicado al empleado, a traves del campo idbono en la entidad empleado
    Implementar el calculo del neto del bono asignado segun el cargo y almacenar el acumulado en el campo suma
    Mostrar en pantalla el caumulado de los bonos entregados, segun la asignacion de los cargos a los empleados y contratistas




