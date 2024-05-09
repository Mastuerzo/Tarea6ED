package tarea_entornos;

public class Tarea6EDClase {
    
    public void imprimirTotal(double total) {
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }

    private static final double RECARGO_CARO = 0.95;
    private static final double RECARGO_BARATO = 0.8;
    double total;
    
    public void aplicarDescuento(double precioProducto, int numeroProductos){     
     
    if(numeroProductos>3)
        precioProducto-=5;
            if (numeroProductos!=0){
            total = precioProducto * RECARGO_BARATO;
            imprimirTotal(total);
        }else {
            total = precioProducto * RECARGO_CARO;
            imprimirTotal(total);
        }   

    }

}
