public class Hello {
    public static void main(String[] args){
        escreverSaudacao();
        Italiaano.escreverSaudacaoItaliano();
    }

    public static void escreverSaudacao(){
        System.out.println("Hello World");
    }
}

class Italiaano{
    public static void escreverSaudacaoItaliano(){
        System.out.println("Ciao Mondo!");
    }
}