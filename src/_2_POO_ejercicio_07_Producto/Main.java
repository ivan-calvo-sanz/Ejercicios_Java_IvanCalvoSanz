package _2_POO_ejercicio_07_Producto;

public class Main {

    public static void main(String[] args) {

        Producto producto1 = new Producto("PRODUCTO_1", 10);
        System.out.println(producto1);
        ProductoFresco productoFresco1 = new ProductoFresco("PRODUCTO_1", 20, 4);
        System.out.println(productoFresco1);
        ProductoRefigerado productoRefigerado1 = new ProductoRefigerado("PRODUCTO_1", 30, 1);
        System.out.println(productoRefigerado1);

        System.out.println(producto1);
        System.out.println(productoFresco1);
        System.out.println(productoRefigerado1);

        System.out.println("Compro 10 unidades del producto1: " + producto1.comprar(10));
        System.out.println("Compro 10 unidades del productoFresco1: " + productoFresco1.comprar(10));
        System.out.println("Compro 10 unidades del productoRefigerado1: " + productoRefigerado1.comprar(10));

    }

}
