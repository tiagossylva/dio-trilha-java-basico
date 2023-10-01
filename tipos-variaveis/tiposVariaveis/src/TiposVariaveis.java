public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        boolean condicao1 = true;
boolean condicao2 = false;

if(condicao1 && condicao2){
	System.out.println("as duas condições são verdadeiras");
}
if(condicao1 && (7 > 4)){
    System.out.println("as duas condiçoes sao verdadeiras");
}
if(condicao1 || condicao2){
System.out.println("uma das condições é verdadeira");
}

System.out.println("fim");
    }
}