package modelo;

public class Fecha
{
    //-----------------
    // Atributos
    //-----------------
    private int dia;
    private int mes;
    private int anio;
    

    //-----------------
    // Metodos
    //-----------------

    // Constructor sin parámetros
    public Fecha()
    {
        dia = 0;
        mes = 0;
        anio = 0;
    }

    // constructor con tres parametros enteros
    public Fecha(int d, int m, int a)
    {
        this.dia = d;
        this.mes = m;
        this.anio = a;
    }

    //Constructor con argumento String
    public Fecha(String s)
    {
        //buscamos la primera ocurrencia de '/'
        int pos1 = s.indexOf('/');
        
        //buscamos la ultima ocurrencia de '/'
        int pos2 = s.lastIndexOf('/');
        
        //Procesamos el dia
        String sDia = s.substring(0,pos1);
        dia = Integer.parseInt(sDia);
        
        //Procesamos el mes
        String sMes = s.substring(pos1+1, pos2);
        mes = Integer.parseInt(sMes);
        
        //Procesamos el año
        String sAnio = s.substring(pos2+1);
        anio = Integer.parseInt(sAnio);
    }

    // Metodos de acceso
    public int getDia() 
    {
        return dia;
    }

    public void setDia(int dia) 
    {
        this.dia = dia;
    }

    public int getMes() 
    {
        return mes;
    }

    public void setMes(int mes) 
    {
        this.mes = mes;
    }

    public int getAnio() 
    {
        return anio;
    }

    public void setAnio(int anio) 
    {
        this.anio = anio;
    }

     // Sobreescritura metodo toString
     public String toString()
     {
         return dia + "/" + mes + "/" + anio;
     }
     
     // Sobreescritura metodo equals
     public boolean equals(Object o)
     {
         Fecha otra = (Fecha)o;
         return (dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio);
     }

    //-----------------------
    //Ejemplo Encapsulamiento
    //-----------------------
    
    //Retornar fecha expresada en dias
    private int fechaToDias()
    {
        //considerando que los meses son de 30 dias
        return anio*360 + mes*30 + dia;
    }
    
    //asigna la fecha expresada en dias a los atributos
    private void diasToFecha(int pD)
    {
        //Dividimos por 360 y obtenemos el año
        anio = (int)(pD/360);
        
        //Del residuo de la división anterior
        //obtenemos el mes y el dia
        int residuo = pD%360;
        
        mes = (int)(residuo/30);
        
        dia = residuo%30;
        
        //Ajuste por si el día quedó en cero
        if(dia==0)
        {
            dia = 30;
            mes--;
        }
        
        //Ajuste por si el mes quedó en cero
        if(mes == 0)
        {
            mes = 12;
            anio--;
        }
    }
    
    public void addDias(int pD)
    {
        //convertimos la fecha a dias y le sumamos d
        int sum = fechaToDias() + pD;
        
        //la fecha resultante (sum) separarla en dia, mes y anio
        diasToFecha(sum);
    }
}