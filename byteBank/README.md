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

**Reglas de negocio**

Aumento del salario por bono segun el cargo

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




