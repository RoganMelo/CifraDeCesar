public class Cifra {
    public static void main(String[] args) {
        String mensagem1 = "Bora bater uma pelada sábado no coliseu. Levem cerveja e carne para o churrasco.";
        String mensagem2 = "Erud#edwhu#xpd#shodgd#väedgr#qr#frolvhx1#Ohyhp#fhuyhmd#h#fduqh#sdud#r#fkxuudvfr1";
 
        System.out.println(cifra(mensagem1, 3));
        System.out.println(decifra(mensagem2, 3));
    }
 
    public static String cifra(String mensagem, int chave){
        StringBuilder builder = new StringBuilder();
 
        for (int i = 0; i < mensagem.length(); i++) {
            char c = (char)(mensagem.charAt(i) + chave);
            builder.append(c);
        }
 
        return builder.toString();
    }
 
    public static String decifra(String mensagem, int chave){
        return cifra(mensagem, -chave);
    }
}