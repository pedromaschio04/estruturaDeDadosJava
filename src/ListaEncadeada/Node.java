package ListaEncadeada;

public class Node {
    private Node proximoNo;
    private int valor;

    public Node getProximoNo(){
       return proximoNo;
    }
    public void setProximoNo(Node proximoNo){
      this.proximoNo = proximoNo;
    }
    public int getValor(){
        return valor;
    }
    public void setValor(int valor){
        this.valor = valor;
    }
}
