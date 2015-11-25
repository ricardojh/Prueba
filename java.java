/* Ejemplo - aprenderaprogramar.com */
/* Esta clase representa un  dep�sito cil�ndrico donde se almacena aceite  */

public class Deposito {    

    //Campos de la clase
    private float diametro;
    private float altura;
    private String idDeposito;

    //Constructor sin par�metros auxiliar
    public Deposito () { //Lo que hace es llamar al constructor con par�metros pas�ndole valores vac�os
        this(0,0,"");            } //Cierre del constructor


    //Constructor de la clase que pide los par�metros necesarios
    public Deposito (float valor_diametro, float valor_altura, String valor_idDeposito) {
        if (valor_diametro > 0 && valor_altura > 0) {            
            diametro = valor_diametro;
            altura = valor_altura;
            idDeposito = valor_idDeposito;
        } else {
            diametro = 10;
            altura = 5;
            idDeposito = "000";
            System.out.println ("Creado dep�sito con valores por defecto diametro 10 metros altura 5 metros id 000" );
        }   } //Cierre del constructor

    public void setValoresDeposito (String valor_idDeposito, float valor_diametro, float valor_altura) {
        idDeposito = valor_idDeposito;
        diametro = valor_diametro;
        altura = valor_altura;
        if (idDeposito !="" && valor_diametro > 0 && valor_altura > 0) {
        } else {
            System.out.println ("Valores no admisibles. No se han establecido valores para el dep�sito");
            //Deposito (0.0f, 0.0f, ""); Esto no es posible. Un constructor no es un m�todo y por tanto no podemos llamarlo
            idDeposito = "";
            diametro = 0;
            altura = 0;
        }     } //Cierre del m�todo

    public float getDiametro () { return diametro; } //M�todo de acceso
    public float getAltura () { return altura; } //M�todo de acceso
    public String getIdDeposito () { return idDeposito; } //M�todo de acceso
    public float valorCapacidad () { //M�todo tipo funci�n
        float capacidad;
        float pi = 3.1416f; //Si no incluimos la f el compilador considera que 3.1416 es double
        capacidad = pi * (diametro/2) * (diametro/2) * altura;
        return capacidad;
    }    
} //Cierre de la clase