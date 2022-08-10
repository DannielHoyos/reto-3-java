import java.util.ArrayList;


public class Obra {
  
    public ArrayList<Integer> clases(ArrayList<Integer> mi_museo){
        ArrayList<Integer> respuesta = new ArrayList<>();
        for (int i=0; i<mi_museo.size();i++){
           int obra=mi_museo.get(i);
           if (!respuesta.contains(obra)){
              respuesta.add(obra);
            }     
        }
        
        return respuesta;
    }
   
    
    
    public ArrayList<Integer> meFaltanDeLaClase(ArrayList<Integer> mi_museo, ArrayList<Integer> otro_museo,int posicion){
        ArrayList <Integer> respuesta = new ArrayList<>();
        int obra;
        for (int i = 0 ; i< mi_museo.size();i++){
            obra = mi_museo.get(i);
            if (otro_museo.get(obra) == posicion){
                respuesta.add(obra);
            }
        }
        return respuesta;
    }
    
    
    
    public ArrayList<Integer> noTengo(ArrayList<Integer> ListaA, ArrayList<Integer> ListaB){
        ArrayList respuesta = new ArrayList<>();
        for(int i=0 ; i<ListaA.size();i++){
        int obra = ListaA.get(i);
        if (!ListaB.contains(obra)){
                respuesta.add(obra);
            }
        }
        return respuesta;
    }
    
    
    
    
    
    
     
    public  Integer puedoCambiar(ArrayList<Integer> ListaDuplicadosA,ArrayList<Integer> ListaDuplicadosB){
        Integer salida = 0;
        if (ListaDuplicadosA.size() > ListaDuplicadosB.size()){
            for(Integer item:ListaDuplicadosB) {
                if(!ListaDuplicadosA.contains(item)){
                    salida++;
                }
            }
        }
        if (ListaDuplicadosB.size()>ListaDuplicadosA.size()){
            for(Integer item:ListaDuplicadosA){
                if(!ListaDuplicadosB.contains(item)){
                    salida++;
                }
      }
   
 } 
        return salida;
    
      
        }
    }
    
