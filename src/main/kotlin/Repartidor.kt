class Repartidor: Empleado {
    var zona:String=""
    constructor()

    constructor(nombrep:String,edadp:Int,salariop:Int,zonap:String){
        super.nombre=nombrep
        super.edad  =edadp
        super.salario=salariop
        this.zona=zonap

    }
    override fun plus(){
        if (this.edad>25&&this.zona=="3"){
            println("Al repartidor: "+super.nombre+" si se le aplica la comision")
        }
        else{
            println("Al repartidor: "+super.nombre+" no se le aplica la comision")
        }
    }
}