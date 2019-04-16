/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exprecion.es.regulares;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExprecionEsRegulares {

    
    public static void main(String[] args) {
       
       
        
        
  /* boolean validar=false;
        String nombre="";
        String patron="[^A-Za-z]";
        String frase="aleixis1perezgomez ";
        String  frase2="";
        for(int i=0;i<frase.length();i++){
           if(frase.charAt(i)!=' '){
              frase2=frase2+frase.charAt(i);
            }
        }
        System.out.println("frase 2 "+frase2);
        
        Pattern p=Pattern.compile(patron);
        Matcher m=p.matcher(frase2);
        String nuevo="";
        
   while(m.find()){
    //  nuevo+=m.group();
      validar=true;
      System.out.println("nombre "+m.group());
      break;
      
      }
   if(nombre.equals("")){
       System.out.println("funciona ");
     }
        
        
        
    System.out.println("new "+nuevo +" validar "+validar);
    System.out.println("-----------------------");
    
   
    /* p = Pattern.compile("([^ ]*) ([^ ]*) (.*)");
        m = p.matcher("uno dos tres cuatro cinco");
        String resultado = m.replaceFirst("$3 - $2 - $1");
        System.out.println("Resultado: " + resultado);
     
     
     
       */    
      //System.out.println("el patron fue "+mi);   
      
      //System.out.println("palabra "+palabra);
 


/*String frase1="1344alexis perez perez gomez";
Pattern p1 = Pattern.compile("[alexis]");
Matcher m1 = p.matcher(frase1);
String dato="";

while (m1.find()) {
   
dato+=m1.group();
    
        }
System.out.println("dato "+dato);
 */

/*String cadena = "Hola, tengo 1 cosa que decir después de 5 años de mentir y es que tengo 33 años de edad";

//Compilamos el regex y el matcher al texto, ignorando mayúsculas/minúsculas (esto es estándar)
Pattern pattern = Pattern.compile("tengo ([0-9]+)años", Pattern.CASE_INSENSITIVE);
Matcher matcher = pattern.matcher(cadena);

//Ahora sí, vemos si coincide el patrón con el texto
if (matcher.find()) {
    //Coincidió => obtener el valor del grupo 1
    String edad = matcher.group();
    System.out.println("Tu edad es: " + edad);
} else {
    //No coincidió
    System.out.println("No me dijiste tu edad");
}


//////////////////777
String cadenas = "trancicionpatronlexemaholamundo";

// Obtenemos un Pattern con la expresión regular, y de él
// un Matcher, para extraer los trozos de interés.
Pattern patrons = Pattern.compile("(\\d+)\\+(\\d+)=(\\d+)");
Pattern patrons=Pattern.compile("(rancicion)(patron)(lexema)",Pattern.CASE_INSENSITIVE);


Matcher matchers = patrons.matcher(cadenas);

// Hace que Matcher busque los trozos.
matchers.find();

// Va devolviendo los trozos. El primer paréntesis es el 1,
// el segundo el 2 y el tercero el 3
System.out.println(matchers.group(1));
System.out.println(matchers.group(2));
System.out.println(matchers.group(3));

// La salida de este programa es
// 23
// 12
// 35
*/
//String PReservadas[]={"Automata","finito","alexis"};
/*String cadena = "Hola,alexis finito automata 12345 &&$$ 6";
String loco="r";
String loco1="r";
for(int i=0;i<PReservadas.length;i++){
    Pattern pattern = Pattern.compile(PReservadas[i], Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(cadena);

   //  if(matcher.find()){
     //   loco=loco+matcher.group()+" ";
       //  }
    
       if(matcher.find()){
          cadena=cadena.replace(loco, loco1);
          cadena.replaceAll("a","xxx");
          }
       
      System.out.println("lokin at "+matcher.lookingAt());
     System.out.println("matchers "+matcher.matches());
  }
        System.out.println("cadena 1 "+loco);
        
        
        System.out.println("cadena "+cadena);

        */

//REMPLAZAR PALABRAS
        
//String PReservadas[]={"automata","finito","alexis"};       
String PReservadas[]={"automata","estado","alfabeto","inicio","aceptacion"+"inicial","tranciciones","paintAutomata","paintTabla","tipoAutomata","aceptacionCadena","terminal","fin"};  
//String cadena="automatafiniodetermfinitoinistainicioalfabetopainttabla123456789alexis&&&&&";
String cadena="automata()estadoalfabetoinicioaceptacioninicial�trancicionespaintAutomatapaintTablatipoAutomataaceptacionCadenaterminalfinautomataestadoalfabetoinicioaceptacioninicial�trancicionespaintAutomatapaintTablatipoAutomataaceptacionCadenaterminalfin";

String resultado="";
System.out.println("HOLA PINCHE MUNDO ");
String perros="";

for(int i=0;i<PReservadas.length;i++){
    Pattern patron1 = Pattern.compile(PReservadas[i]);
    Matcher encaja = patron1.matcher(cadena);
  if(encaja.find()){
    perros+=encaja.group();
    }
resultado = encaja.replaceAll("@");
//System.out.println("resultado "+resultado);
cadena=resultado;
//System.out.println("cadena "+cadena);
}

System.out.println("perros "+perros);

//  System.out.println("RENPLANSANDO");
//  System.out.println("resultado "+resultado);      
  System.out.println("cadena "+cadena);
       
  //FIN REMPLZAR PALABRAS
     //   System.out.println("prueva 2");
       //error  { ? + ( )
       
//String llavesA[]={">",">","@"};
 
 
/*String llavesA[] ={"<","¿","}",">","-",";",",",":","#","$","!"};

 String cadenax="-aut,o@mata<estado{incio>de,rteminist;a?aut¿}amlejeijeije-";
 int cont=0;
 String llaves="",llave="",llave1="";
String aux="",aux1="",aux2="";
        System.out.println("iteracion ");
 for(int i=0;i<llavesA.length;i++){
    
    Pattern patronx = Pattern.compile(llavesA[i]);
    Matcher encajax = patronx.matcher(cadenax);
 
    if(encajax.find()){
       cont++;
       System.out.println("contador entra uno "+cont);
       llaves=encajax.group();
       aux=aux+llaves; 
      }
    if(encajax.find()){
       cont++;
       System.out.println("contador "+cont);
      llave=encajax.group();
       aux1=aux1+llave; 
       }
    
     if(encajax.find()){
       cont++;
       System.out.println("contador "+cont);
      llave1=encajax.group();
      aux2=aux2+llave1;
       }
    
    
     }
        
        System.out.println("llaves "+aux);
        System.out.println("llave "+aux1);
        System.out.println("llave "+aux2);
 
*/
/*

int[] arreglo={18,20,22,18,25};
		
		
 
 
  for(int i = 0; i < arreglo.length - 1; i++){
      for(int j = 0; j < arreglo.length - 1; j++){
          if (arreglo[j] < arreglo[j + 1]){
              int tmp = arreglo[j+1];
              arreglo[j+1] = arreglo[j];
              arreglo[j] = tmp;
              }
        }
    }
    
    for(int i = 0;i < arreglo.length; i++){
        System.out.println(arreglo[i]);
        }
    }
 */



 }
    
}
