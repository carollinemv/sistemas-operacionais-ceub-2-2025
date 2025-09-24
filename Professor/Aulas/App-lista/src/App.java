

public class App {
    public static void main(String[] args) throws Exception {
       
        // List<String> lista = new ArrayList<>();
        //  List<String> lista = Collections.synchronizedList(new ArrayList<>());
        MinhaLista lista = new MinhaLista();

        for (int i = 0; i < 100; i++) {
            new Thread(new TarefaAdicional(lista, i)).start();
        }

        Thread.sleep(2000);

        for (int i = 0; i < lista.tamanho(); i++) {
            System.out.println(i + " - " + lista.getElemento(i));
        }
    }
}
