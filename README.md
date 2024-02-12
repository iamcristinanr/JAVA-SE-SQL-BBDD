# API JDBC
## Java Database Connection

Permite a los programas Java conectarse con una base de datos gracias a un conjunto de interfaces y clases. (Enviar consultas y recibir resultados).


### Beneficios

- Creación de consultas y declaraciones SQL personalizadas
- Soporte a múltiples bbdd
- Portabilidad

### Componentes

- JDBC Connection. Establece conexión (URL BBDD, Usuario, Contraseña)
- JDBC Statement. Consultas simples. (Sin parámetros)
- JDBC Prepared Statement. Consultas dinámicas (Con parámetros)
- JDBC ResultSet. Obtiene los resultados de una consulta SQL

### Métodos

- ExecuteQuery(): Ejecuta consulta SQL.
- ExecuteUpdate(): Modifica los datos en la bbdd.
- get(): Obtiene los registros (getInt(), getString(), getDouble(), getDate()...)
- Next(): Avanza hasta el siguiente registro.
- Close(): Cierra la conexión con la bbdd.



