package jantarcanibais;


public class Travessa {
    int porcoes;
    
    Travessa(int M) {
        porcoes = M;
    }
    
    /* Chamada pelos canibais. 
       Retorna true se conseguiu se servir, senão retorna falso. 
    */
    public boolean seserve(){

        //sincronização para se servir.
        return true;
    }
    public int getPorcoes() {
    	return porcoes;
    }

    /* Chamado pelo cozinheiro. */
    public void enchetravessa(int por){
        porcoes = por;
        
        //sincronização para encher a travessa.
        
    }
}
    
    

