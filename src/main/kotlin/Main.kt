fun main(args: Array<String>) {
    val comercial1=Comercial("Yadir",23,500000,400.59)
    val comercial2=Comercial("Carlos",35,450000,300.39)
    val repartidor1=Repartidor("Juan",19,300000,"2")
    val repartidor2=Repartidor("Eduardo",40,350000,"3")

    comercial1.plus()
    comercial2.plus()
    repartidor1.plus()
    repartidor2.plus()

}