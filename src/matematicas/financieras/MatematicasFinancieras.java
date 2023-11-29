/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematicas.financieras;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luis_CK
 */
public class MatematicasFinancieras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double capital = 0;

        System.out.println("Selecciona una opción: \n"
                + "1. Calcular Capital\n"
                + "2. Calcular Monto\n"
                + "3. Calcular Tasa\n"
                + "4. Calcular Plazo\n"
                + "5. Calcular Descuento Simple\n"
                + "6. Calcular Valor Comercial\n"
                + "7. Calcular Monto Compuesto\n"
                + "8. Calcular Capital Compuesto\n"
                + "9. Calcular Interes Compuesto\n"
                + "10. Calcular Numero de Periodos Compuesto\n"
                + "11. Calcular Tasa de Interes Desconocida\n"
                + "12. Calcular Tasa Efectiva\n"
                + "13. Calcular Numero de Rentas\n"
                + "14. Calcular Anualidad Vencida\n"
                + "15. Calcular Amortizacion\n"
                + "Opcion: ");

        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                double monto,
                 tasa,
                 plazo;
                System.out.print("Ingresa el monto: ");
                monto = scanner.nextDouble();
                System.out.print("Ingresa la tasa de interés (en porcentaje): ");
                tasa = scanner.nextDouble();
                System.out.print("Ingresa el plazo (en años): ");
                plazo = scanner.nextDouble();
                capital = calcularCapital(monto, tasa, plazo);
                System.out.println("El capital es: " + capital);
                break;
            case 2:
                double 
                 tasaMonto,
                 plazoMonto;
                System.out.print("Ingresa el capital: ");
                capital = scanner.nextDouble();
                System.out.print("Ingresa la tasa de interés (en porcentaje): ");
                tasaMonto = scanner.nextDouble();
                System.out.print("Ingresa el plazo (en años): ");
                plazoMonto = scanner.nextDouble();
                monto = calcularMonto(capital, tasaMonto, plazoMonto);
                System.out.println("El monto es: " + monto);
                break;
            case 3:
                double capitalTasa,
                 montoTasa,
                 plazoTasa;
                System.out.print("Ingresa el capital: ");
                capitalTasa = scanner.nextDouble();
                System.out.print("Ingresa el monto: ");
                montoTasa = scanner.nextDouble();
                System.out.print("Ingresa el plazo (en años): ");
                plazoTasa = scanner.nextDouble();
                double tasaInteres = calcularTasa(capitalTasa, montoTasa, plazoTasa);
                System.out.println("La tasa de interés es: " + tasaInteres + "%");
                break;
            case 4:
                double capitalPlazo,
                 montoPlazo,
                 tasaPlazo;
                System.out.print("Ingresa el capital: ");
                capitalPlazo = scanner.nextDouble();
                System.out.print("Ingresa el monto: ");
                montoPlazo = scanner.nextDouble();
                System.out.print("Ingresa la tasa de interés (en porcentaje): ");
                tasaPlazo = scanner.nextDouble();
                plazo = calcularPlazo(capitalPlazo, montoPlazo, tasaPlazo);
                System.out.println("El plazo es: " + plazo + " años");
                break;
            case 5:
                double precioOriginal,
                 plazoDescuento,
                 porcentajeDescuento;
                System.out.print("Ingresa el precio original del producto: ");
                precioOriginal = scanner.nextDouble();
                System.out.print("Ingresa el plazo en meses: ");
                plazoDescuento = scanner.nextDouble();
                System.out.print("Ingresa el porcentaje de descuento: ");
                porcentajeDescuento = scanner.nextDouble();
                double[] resultadoDescuento = calcularDescuentoYPrecioFinal(plazoDescuento, porcentajeDescuento, precioOriginal);
                System.out.println("El descuento es: " + resultadoDescuento[0]);
                System.out.println("El precio final después del descuento es: " + resultadoDescuento[1]);
                break;
            case 6:
                double valorOriginal,
                 diasTotales,
                 interes,
                 descuento;
                System.out.print("Ingrese la cantidad de pagos a realizar: ");
                int cantidadPagos = scanner.nextInt();

                double sumaDias = 0.0;
                for (int i = 0; i < cantidadPagos; i++) {
                    System.out.print("Ingrese los días del pago " + (i + 1) + ": ");
                    sumaDias += scanner.nextDouble();
                }
                diasTotales = sumaDias;

                System.out.print("Ingrese el valor original del producto: ");
                valorOriginal = scanner.nextDouble();
                System.out.print("Ingrese el porcentaje de interés: ");
                interes = scanner.nextDouble();
                System.out.print("Ingrese el porcentaje de descuento: ");
                descuento = scanner.nextDouble();

                double valorComercial = calcularValorComercial(valorOriginal, diasTotales, interes, descuento);
                System.out.println("El valor comercial después de los días y descuentos es: " + valorComercial);
                break;
            case 7:
                double capitalCompuesto,
                 interesCompuesto,
                 plazoCompuesto,
                 periodoCapitalizacion;
                System.out.print("Ingrese el capital inicial: ");
                capitalCompuesto = scanner.nextDouble();
                System.out.print("Ingrese la tasa de interés anual (en porcentaje): ");
                interesCompuesto = scanner.nextDouble();
                System.out.print("Ingrese el plazo en años: ");
                plazoCompuesto = scanner.nextDouble();
                System.out.print("Ingrese el período de capitalización (en años): ");
                periodoCapitalizacion = scanner.nextDouble();

                double montoCalculado = calcularMontoCompuesto(capitalCompuesto, interesCompuesto, plazoCompuesto, periodoCapitalizacion);
                System.out.println("El monto compuesto al final del período es: " + montoCalculado);
                break;
            case 8:
                double montoCompuesto,
                 interesCapital,
                 plazoCapital,
                 periodoCapitalizacionCompuesto;
                System.out.print("Ingrese el monto al final del período: ");
                montoCompuesto = scanner.nextDouble();
                System.out.print("Ingrese la tasa de interés anual (en porcentaje): ");
                interesCapital = scanner.nextDouble();
                System.out.print("Ingrese el plazo (en años): ");
                plazoCapital = scanner.nextDouble();
                System.out.print("Ingrese el período de capitalización (en años): ");
                periodoCapitalizacionCompuesto = scanner.nextDouble();

                double capitalCalculado = calcularCapitalCompuesto(montoCompuesto, interesCapital, plazoCapital, periodoCapitalizacionCompuesto);
                System.out.println("El capital inicial necesario es: " + capitalCalculado);
                break;
            case 9:
                double montoInteres,
                 capitalInteres,
                 plazoInteres,
                 periodoCapitalizacionInteres;
                System.out.print("Ingrese el monto al final del período: ");
                montoInteres = scanner.nextDouble();
                System.out.print("Ingrese el capital inicial: ");
                capitalInteres = scanner.nextDouble();
                System.out.print("Ingrese el plazo (en años): ");
                plazoInteres = scanner.nextDouble();
                System.out.print("Ingrese el período de capitalización (en años): ");
                periodoCapitalizacionInteres = scanner.nextDouble();

                double interesCalculado = calcularInteresCompuesto(montoInteres, capitalInteres, plazoInteres, periodoCapitalizacionInteres);
                double interesPorcentaje = interesCalculado * 100;
                System.out.println("El interés compuesto es: " + interesCalculado);
                System.out.println("El interés compuesto en porcentaje es: " + String.format("%.2f", interesPorcentaje) + "%");
                break;
            case 10:
                double montoPeriodos,
                 capitalPeriodos,
                 interesPeriodos,
                 periodoCapitalizacionPeriodos,
                 diasTranscurrir;
                System.out.print("Ingrese el monto al final del período: ");
                montoPeriodos = scanner.nextDouble();
                System.out.print("Ingrese el capital inicial: ");
                capitalPeriodos = scanner.nextDouble();
                System.out.print("Ingrese la tasa de interés anual (en porcentaje): ");
                interesPeriodos = scanner.nextDouble();
                System.out.print("Ingrese el período de capitalización (en años): ");
                periodoCapitalizacionPeriodos = scanner.nextDouble();
                System.out.print("Ingrese la cantidad de días a transcurrir: ");
                diasTranscurrir = scanner.nextDouble();

                double numeroPeriodos = calcularNumeroPeriodosCompuesto(montoPeriodos, capitalPeriodos, interesPeriodos, periodoCapitalizacionPeriodos, diasTranscurrir);
                System.out.println("El número de días es: " + numeroPeriodos);
                break;
            case 11:
                double
                 periodoConocido,
                 periodoDesconocido;
                System.out.print("Ingrese la tasa de interés conocida anual: ");
                tasaInteres = scanner.nextDouble();
                System.out.print("Ingrese el periodo de capitalización conocido: ");
                periodoConocido = scanner.nextDouble();
                System.out.print("Ingrese el periodo de capitalización desconocido: ");
                periodoDesconocido = scanner.nextDouble();

                double tasaDesconocida = calcularTasaInteresDesconocida(tasaInteres, periodoConocido, periodoDesconocido);
                double tasaDesconocidaPorcentaje = tasaDesconocida * 100;
                System.out.println("La tasa de interés desconocida es: " + tasaDesconocida + " o " + String.format("%.2f", tasaDesconocidaPorcentaje) + "%");
                break;
            case 12:
                double tasaEfectivaEquivalente,
                 periodoCapitalizacionEfectiva;
                System.out.print("Ingrese la tasa efectiva equivalente (en porcentaje): ");
                tasaEfectivaEquivalente = scanner.nextDouble();
                System.out.print("Ingrese el período de capitalización (en años): ");
                periodoCapitalizacionEfectiva = scanner.nextDouble();

                double tasaEfectivaCalculada = calcularTasaEfectiva(tasaEfectivaEquivalente, periodoCapitalizacionEfectiva);
                double tasaEfectivaCalculadaPorcentaje = tasaEfectivaCalculada * 100;
                System.out.println("La tasa efectiva resultante es: " + tasaEfectivaCalculada + " o " + String.format("%.2f", tasaEfectivaCalculadaPorcentaje) + "%");
                break;
            case 13:
                double montoRenta,
                 renta,
                 tasaCapitalizable,
                 periodoCapitalizacionRenta,
                 diasTranscurrirRenta;
                System.out.print("Ingrese el monto: ");
                montoRenta = scanner.nextDouble();
                System.out.print("Ingrese la renta: ");
                renta = scanner.nextDouble();
                System.out.print("Ingrese la tasa capitalizable (en porcentaje): ");
                tasaCapitalizable = scanner.nextDouble();
                System.out.print("Ingrese el período de capitalización: ");
                periodoCapitalizacionRenta = scanner.nextDouble();
                System.out.print("Ingrese la cantidad de días a transcurrir: ");
                diasTranscurrirRenta = scanner.nextDouble();

                int numeroRentasCalculado = calcularNumeroDeRentas(montoRenta, renta, tasaCapitalizable, periodoCapitalizacionRenta, diasTranscurrirRenta);
                double rentaNuevaCalculada = calcularRentaNueva(montoRenta, tasaCapitalizable, numeroRentasCalculado);
                double nuevoMontoCalculado = calcularNuevoMonto(rentaNuevaCalculada, tasaCapitalizable, numeroRentasCalculado);

                System.out.println("El número de rentas es: " + numeroRentasCalculado);
                System.out.println("La renta nueva es: " + rentaNuevaCalculada);
                System.out.println("El nuevo monto es: " + nuevoMontoCalculado);
                break;
            case 14:
                double capitalAnualidad,
                 rentaAnualidad,
                 tasaCapitalizableAnualidad,
                 periodoCapitalizacionAnualidad;
                System.out.print("Ingrese el capital: ");
                capitalAnualidad = scanner.nextDouble();
                System.out.print("Ingrese la renta: ");
                rentaAnualidad = scanner.nextDouble();
                System.out.print("Ingrese la tasa capitalizable (en porcentaje): ");
                tasaCapitalizableAnualidad = scanner.nextDouble();
                System.out.print("Ingrese el período de capitalización: ");
                periodoCapitalizacionAnualidad = scanner.nextDouble();

                int anualidadVencidaCalculada = calcularAnualidadVencida(capitalAnualidad, rentaAnualidad, tasaCapitalizableAnualidad, periodoCapitalizacionAnualidad);
                double nuevaRentaCalculada = calcularNuevaRenta(capitalAnualidad, tasaCapitalizableAnualidad, anualidadVencidaCalculada);

                System.out.println("La anualidad vencida es: " + anualidadVencidaCalculada + " días");
                System.out.println("La nueva renta es: " + nuevaRentaCalculada);
                break;
            case 15:
                double montoPrestamo,
                 tasaInteresAnual,
                 numeroPagos;
                System.out.print("Ingrese el monto del préstamo: ");
                montoPrestamo = scanner.nextDouble();
                System.out.print("Ingrese la tasa de interés anual (en porcentaje): ");
                tasaInteresAnual = scanner.nextDouble();
                System.out.print("Ingrese el número de pagos: ");
                numeroPagos = scanner.nextDouble();

                ArrayList<ArrayList<Double>> tablaAmortizacion = calcularAmortizacion(montoPrestamo, tasaInteresAnual, numeroPagos);

                System.out.println("Tabla de Amortización:");
                System.out.println("Pago | Renta   | Amortización | Interés  | Saldo Insoluto");
                for (ArrayList<Double> fila : tablaAmortizacion) {
                    System.out.println("   " + fila.get(0).intValue() + " | " + fila.get(1) + " | " + fila.get(2) + " | " + fila.get(3) + " |  " + fila.get(4));
                }
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    public static ArrayList<ArrayList<Double>> calcularAmortizacion(double montoPrestamo, double tasaInteresAnual, double numeroPagos) {
    double tasaInteresMensual = tasaInteresAnual / 12 / 100;
    double cuota = montoPrestamo * (tasaInteresMensual / (1 - Math.pow(1 + tasaInteresMensual, -numeroPagos)));
    double saldoPendiente = montoPrestamo;

    ArrayList<ArrayList<Double>> tablaAmortizacion = new ArrayList<>();
    for (int i = 1; i <= numeroPagos; i++) {
        double interes = saldoPendiente * tasaInteresMensual;
        double amortizacion = cuota - interes;
        saldoPendiente -= amortizacion;

        ArrayList<Double> fila = new ArrayList<>();
        fila.add((double) i);
        fila.add(Math.round(cuota * 100.0) / 100.0);
        fila.add(Math.round(amortizacion * 100.0) / 100.0);
        fila.add(Math.round(interes * 100.0) / 100.0);
        fila.add(Math.round(saldoPendiente * 100.0) / 100.0);
        tablaAmortizacion.add(fila);
    }
    return tablaAmortizacion;
}
public static int calcularAnualidadVencida(double capital, double renta, double tasaCapitalizable, double periodoCapitalizacion) {
    double tasaCap = tasaCapitalizable / 100 / periodoCapitalizacion;
    double anualidadVencida = -Math.log(1 - (capital / renta) * tasaCap) / Math.log(1 + tasaCap);
    return (int) Math.ceil(anualidadVencida);
}

public static double calcularNuevaRenta(double capital, double tasaCapitalizable, int anualidadVencidaCalculada) {
    double tasaCap = tasaCapitalizable / 100;
    double nuevaRenta = capital / ((1 - Math.pow(1 + tasaCap, -anualidadVencidaCalculada)) / anualidadVencidaCalculada);
    return nuevaRenta;
}
public static int calcularNumeroDeRentas(double monto, double renta, double tasaCapitalizable, double periodoCapitalizacion, double diasTranscurrir) {
    double tasaCap = tasaCapitalizable / 100 / periodoCapitalizacion;
    double numeroRentas = Math.log(((monto / renta) * tasaCap) / (1 + tasaCap) + 1) / Math.log(1 + tasaCap);
    return (int) Math.ceil(numeroRentas * diasTranscurrir);
}

public static double calcularRentaNueva(double monto, double tasaCapitalizable, int numeroRentasCalculado) {
    double tasaCap = tasaCapitalizable / 100;
    double rentaNueva = (monto * tasaCap) / (1 + tasaCap) * (1 + Math.pow(tasaCap, numeroRentasCalculado)) - 1;
    return rentaNueva;
}

public static double calcularNuevoMonto(double rentaNuevaCalculada, double tasaCapitalizable, int numeroRentasCalculado) {
    double tasaCap = tasaCapitalizable / 100;
    return rentaNuevaCalculada * (1 + tasaCap) * (1 + Math.pow(tasaCap, numeroRentasCalculado)) - 1 / tasaCap;
}
public static double calcularTasaEfectiva(double tasaEfectivaEquivalente, double periodoCapitalizacion) {
    double tasaEfectiva = Math.pow(1 + tasaEfectivaEquivalente / 100 / periodoCapitalizacion, periodoCapitalizacion) - 1;
    return tasaEfectiva;
}
public static double calcularTasaInteresDesconocida(double tasaInteres, double periodoConocido, double periodoDesconocido) {
    double tasaInteresConocida = tasaInteres / 100;
    double tasaInteresDesconocida = Math.sqrt(Math.pow(1 + tasaInteresConocida / periodoDesconocido, periodoDesconocido) - 1);
    return tasaInteresDesconocida * periodoConocido;
}
public static double calcularNumeroPeriodosCompuesto(double monto, double capital, double interes, double periodoCapitalizacion, double diasTranscurrir) {
    double tasaInteres = interes / 100;
    double numeroPeriodos = Math.log(monto / capital) / Math.log(1 + tasaInteres / periodoCapitalizacion);
    return Math.ceil(numeroPeriodos * diasTranscurrir);
}
public static double calcularInteresCompuesto(double monto, double capital, double plazo, double periodoCapitalizacion) {
    double numeroPeriodos = plazo * periodoCapitalizacion;
    double interesCompuesto = Math.pow(monto / capital, 1.0 / numeroPeriodos) - 1;
    interesCompuesto *= periodoCapitalizacion * 100;
    return interesCompuesto;
}
public static double calcularCapitalCompuesto(double monto, double interes, double plazo, double periodoCapitalizacion) {
    double tasaCapitalizable = (interes / 100) / periodoCapitalizacion;
    double numeroPeriodos = (plazo / 12) * periodoCapitalizacion;
    double capitalCompuesto = monto / Math.pow(1 + tasaCapitalizable, numeroPeriodos);
    return capitalCompuesto;
}
public static double calcularMontoCompuesto(double capital, double interes, double plazo, double periodoCapitalizacion) {
    double tasaCapitalizable = (interes / 100) / periodoCapitalizacion;
    double numeroPeriodos = plazo * periodoCapitalizacion;
    double montoCompuesto = capital * Math.pow(1 + tasaCapitalizable, numeroPeriodos);
    return montoCompuesto;
}
public static int[] convertirAAniosMesesDias(double plazoAnios) {
    int anios = (int) plazoAnios;
    double mesesFlotante = (plazoAnios - anios) * 12;
    int meses = (int) mesesFlotante;
    double diasFlotante = (mesesFlotante - meses) * (365.25 / 12); // Considerando el año como 365.25 días
    int dias = (int) Math.round(diasFlotante);
    return new int[] {anios, meses, dias};
}
public static double calcularValorComercial(double valorOriginal, double diasTotales, double interes, double descuento) {
    double monto = valorOriginal * (1 + (diasTotales / 365) * (interes / 100));
    double valorComercial = monto * (1 - (diasTotales / 365) * (descuento / 100));
    return valorComercial;
}
public static double[] calcularDescuentoYPrecioFinal(double plazo, double porcentajeDescuento, double precioOriginal) {
    double descuento = precioOriginal * (plazo / 12) * (porcentajeDescuento / 100);
    double precioFinal = precioOriginal - descuento;
    return new double[] {descuento, precioFinal};
}
public static double calcularPlazo(double monto, double capital, double tasa) {
    tasa = tasa / 100;
    double plazo = ((monto / capital) - 1) / tasa;
    return plazo;
}
public static double calcularTasa(double capital, double monto, double plazo) {
    plazo = plazo / 12;
    double tasa = ((monto / capital) - 1) / plazo;
    tasa = tasa * 100;
    return tasa;
}
public static double calcularMonto(double capital, double tasa, double plazo) {
    plazo = plazo / 12;
    tasa = tasa / 100;
    double monto = capital * (1 + tasa * plazo);
    return monto;
}
public static double calcularCapital(double monto, double tasa, double plazo) {
    plazo = plazo / 12;
    tasa = tasa / 100;
    double capital = monto / (1 + tasa * plazo);
    return capital;
}
}
