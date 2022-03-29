class Comercial :Empleado{
    var comision:Double=0.0
    constructor()

    constructor(nombrep:String,edadp:Int,salariop:Int,comisionp:Double){
        super.nombre=nombrep
        super.edad  =edadp
        super.salario=salariop
        this.comision=comisionp
    }

    override fun plus() {
        if (super.edad>30&&this.comision>200){
            println("Al comercial: "+super.nombre+" si se le aplica la comision")
            super.salario+=super.plus
            println("Su nuevo salario es de: "+super.salario+"\n")

        }
        else{
            println("Al comercial: "+super.nombre+" no se le aplica la comision"+"\n")
        }
    }
}