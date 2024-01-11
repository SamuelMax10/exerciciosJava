package entities;

import entities.enums.StatusOrdem;

import java.lang.ref.Cleaner;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

public class Ordem {
    private Date momento;
    private StatusOrdem status;
    private Cliente cliente;
    private List<ItemOrdem> itens = new ArrayList<>();

    ItemOrdem itemOrdem = new ItemOrdem();
    Produto produto = new Produto();
    LocalDateTime localDateTime = LocalDateTime.now();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Ordem() {

    }

    public Ordem(Date momento, StatusOrdem status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
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

    public void addItem(ItemOrdem item) {
        itens.add(item);
    }

    public void removeItem(ItemOrdem item) {
        itens.remove(item);
    }

    public Double total() {
        double sum = 0.0;
        for (ItemOrdem item : itens) {
            sum += item.subTotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do pedido: ");
        sb.append(sdf.format(momento) + "\n");
        sb.append("Status da ordem: ");
        sb.append(status + "\n");
        sb.append(cliente + "\n");
        sb.append("Itens de ordem: \n");
        for (ItemOrdem item : itens) {
            sb.append(item + "\n");
        }
        sb.append("Preço total: R$");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }

}
