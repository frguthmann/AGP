public class While2 extends Node {

    private Cond c;
    private Bloc b;

    public While2(Cond c, Bloc b) {
        this.c = c;
        this.b = b;
    }
    
   public String toASM(){
    	String output =	newLabel("while"+condCpt+":") +
    					c.toASM() +
    					b.toASM() +  					
    					newLine("jmp while"+condCpt) +
    					newLabel("cond"+condCpt+":");    	
    	condCpt++;
		return output;
    }
   
   @Override
   public String toASMData() {
       String asmData = c.toASMData()+b.toASMData();
       return asmData;
   }
    
}
