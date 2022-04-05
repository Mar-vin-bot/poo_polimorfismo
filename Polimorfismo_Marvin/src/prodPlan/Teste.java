package prodPlan;

public class Teste {
	
static Parte[ ] criaPartes(){
        
        Parte [] vetor = new Parte[8];      //list de 8p, onde é instanciado como motor ou parafuso
        //armazena memoria para as duas classes Motor e Parafuso
        
        vetor[0] = new Motor(112, "motor m112", "motor de avanco do cabecote", 100.0f, 1.2f, 1.1f, 1250);  //o polimorfismo acontece quando Parte pode ser instanciada tanto como Parafuso quanto Motor
        vetor[1] = new Motor(114, "motor m114", "motor auxiliar", 60.0f, 0.6f, 0.8f, 1250);
        vetor[2] = new Motor(111, "motor m111", "motor de ventilador", 70.0f, 1.0f, 1.0f, 3000);
        vetor[3] = new Motor(110, "motor m110", "motor principal", 120.0f, 1.8f, 1.5f, 1250);
        vetor[4] = new Parafuso(231, "Parafuso p1", "parafuso de fixacao do cabecote", 2.5f, 100.0f, 8.0f);
        vetor[5] = new Parafuso(232, "Parafuso p2", "parafuso de fixacao do motor", 2.5f, 80.0f, 6.0f);
        vetor[6] = new Parafuso(233, "Parafuso p3", "parafuso de fixacao do ventilador", 2.0f, 60.0f, 6.0f);
        vetor[7] = new Parafuso(234, "Parafuso p4", "parafuso de uso geral", 3.0f, 120.0f, 12.0f);

        return vetor;
    }
        
    static void listaPartes( String titulo, Parte[ ] partes){
        System.out.println(titulo);
        
        for(int i=0; i < partes.length; i++){
            System.out.println(partes[i].toString());
        }
        
        System.out.println("");
    }
    
    static Item[ ] criaItens( Parte[ ] partes ){
        
        Item [] vet = new Item[4];
        
        vet[0] = new Item(partes[0], 10);
        vet[1] = new Item(partes[5], 50);
        vet[2] = new Item(partes[7], 30);
        vet[3] = new Item(partes[2], 5);
        
        return vet;
    }
    
    static void listaItens( String titulo, Item[ ] itens ){
        System.out.println(titulo);
        
        float total = 0;
        for(int i=0; i < itens.length; i++){
            System.out.println(itens[i].toString());
            total += itens[i].calculaValor();
        }
        
        System.out.println("Valor total: " + total);
    }
	
	

	public static void main(String[] args) {
        Parte[ ] parte = criaPartes( );
        Item[ ] itens = criaItens( parte );
        listaPartes( "*** Partes utilizadas na producao ****", parte );
        listaItens( "*** Itens solicitados ***", itens );

	}

}
