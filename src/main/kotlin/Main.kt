fun main(args: Array<String>) {
    val comercial1=Comercial("Yadir",23,500,199.59)
    val comercial2=Comercial("Carlos",35,450,300.39)
    val repartidor1=Repartidor("Juan",19,300,"3")
    val repartidor2=Repartidor("Eduardo",40,350,"3")

    comercial1.plus()//no aplica
    comercial2.plus()//si aplica
    repartidor1.plus()//Si aplica
    repartidor2.plus()//No aplica

}