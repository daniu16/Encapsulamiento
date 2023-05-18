package ejecutable;

import modelo.Fecha;

public class Test{
    public static void main(String[] args) 
    {

        Fecha f = new Fecha(23,12,1980);
        System.out.println(f);

        System.out.println("Se le suman 180 dias a la fecha");
        f.addDias(180);
        System.out.println(f);
        System.out.println("\n");

        Fecha f1 = new Fecha(20, 02, 2023);

        Fecha f2 = new Fecha(03, 03, 2022);

        System.out.println("La primera fecha es.");
        System.out.println( f1.getDia()+"/"+f1.getMes()+"/"+ f1.getAnio());
        System.out.println(f1);
        
        System.out.println("");

        System.out.println("La segunta fecha es.");
        System.out.println("el dia es: "+ f2.getDia());
        System.out.println("el mes es: "+f2.getMes());
        System.out.println("el año es: "+ f2.getAnio());
        System.out.println(f2);

        System.out.println("");

        if(f1.equals(f2))
        {
            System.out.println("las dos fechas son iguales");
        }else
        {
            System.out.println("Las fechas no son iguales");
        }
    }
}
