package entities;

import entities.enums.StatusOrdem;

import java.lang.ref.Cleaner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ordem {
    private Date momento;
    private StatusOrdem status;
    private List<ItemOrdem> itens = new ArrayList<>();

    ItemOrdem itemOrdem = new ItemOrdem();
    Produto produto = new Produto();
    Cliente cliente = new Cliente();
    LocalDateTime localDateTime = LocalDateTime.now();
    DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Ordem(StatusOrdem status){
        this.status=status;

    }

    public Ordem(Date momento, StatusOrdem status) {
        this.momento = momento;
        this.status = status;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusOrdem getStatus() {
        return status;
    }

    public void setStatus(StatusOrdem status) {
        this.status = status;
    }

    public List<ItemOrdem> getItens() {
        return itens;
    }

    public void addItem(ItemOrdem item){
        itens.add(item);
    }
    public void removeItem(ItemOrdem item){
        itens.remove(item);
    }
    /*public Double total(){
        for (ItemOrdem it : itens){


        }

    }*/
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do pedido: "+localDateTime.format(formatado));
        sb.append("Status do pedido: "+ status);
        sb.append("Cliente: "+cliente.getNome()+" "+cliente.getDataAniversario()+" - "+cliente.getEmail());
        sb.append("Itens de ordem: ");
        sb.append(produto+" Quantidade: "+itemOrdem.getQuantidade()+", Subtotal:"+itemOrdem.subTotal());
        sb.append("Preço total: ");
        return sb.toString();
    }

}
