package clases;

public class CapacidadEndedudamiento {
    Integer ingresosTotales;
    Integer gastosFijos;
    Integer gastoVaribales;
    final double POR_FIJO = 0.35;

    //Metodos getter and setter para la clase

    public Integer getGastosFijos() {
        return gastosFijos;
    }

    public void setGastosFijos(Integer gastosFijos) {
        this.gastosFijos = gastosFijos;
    }

    public Integer getGastoVaribales() {
        return gastoVaribales;
    }

    public void setGastoVaribales(Integer gastoVaribales) {
        this.gastoVaribales = gastoVaribales;
    }

    public Integer getIngresosTotales() {
        return ingresosTotales;
    }

    public void setIngresosTotales(Integer ingresosTotales) {
        this.ingresosTotales = ingresosTotales;
    }

    //Construye un metodo que retorne una cadena con las propiedades de la clase
    public void Data(){
        System.out.println("\n");
        System.out.println("-------//------------//----------------//-------");
        System.out.println("Gastos Fijos = " + getGastosFijos());
        System.out.println("Gastos Variables = " + getGastoVaribales());
        System.out.println("Ingresos Totales = " + getIngresosTotales());
        System.out.println("-------//------------//----------------//-------");
    }

    public void capacidadEndeudamiento(int var1, int var2) {
        double valorFinal = var1 - var2 * POR_FIJO;
        System.out.println("Capacidad de endeudamiento es = " + valorFinal);
        System.out.println("-------//------------//----------------//-------");
        System.out.println("\n");

    }
}