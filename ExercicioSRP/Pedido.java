package ExercicioSRP;
//Refatorar seguindo SRP

//public class Pedido {
//public double calcularTotalPedido() { /*...*/ }
//public List<Item> getItens() { /*...*/ }
//public long getQtdItens() { /*...*/ }
//public void addItem(Item item) { /*...*/ }
//public void deletarItem(Item item) { /*...*/ }
//
//public void imprimirPedido() { /* Violação do SRP */ }
//public void imprimirItens() { /* Violação do SRP */ }
//
//public void buscarPedido(long id) { /* Violação do SRP */ }
//public void salvar(Pedido pedido) { /* Violação do SRP */ }
//public void atualizar(long id, Pedido pedido) { /* Violação do SRP */ }
//public void deletar(long id) { /* Violação do SRP */ }
//
//public void enviarEmailConfirmacao(String mensagem) { /* Violação do SRP */ }
//
//public void enviarParaTransporte() { /* Violação do SRP */ }
//        }
//
//class Pedido {
//    private long id;
//    private List<Item> itens;
//
//    // getters e setters
//}
//
//class Item {
//    // Detalhes do item
//}
import java.util.List;

public class Pedido {
    private long id;
    private List<Item> itens;

    // getters e setters

    public double calcularTotalPedido(List<Item> itens) {
        /*...*/
    }

    public long getQtdItens(List<Item> itens) {
        /*...*/
    }

    public void adicionarItem(List<Item> itens, Item item) {
        /*...*/
    }

    public void deletarItem(List<Item> itens, Item item) {
        /*...*/
    }
}

