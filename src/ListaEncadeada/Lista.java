package ListaEncadeada;
import java.util.Scanner;

public class Lista {
    private Node primeiroNo;
    private Node ultimoNo;
    public Lista(){}
    public Node getPrimeiroNo(){
        return primeiroNo;
    }
    public void setPrimeiroNo(Node primeiroNo){
        this.primeiroNo = primeiroNo;
    }
    public Node getUltimoNo(){
        return ultimoNo;
    }
    public void setUltimoNo(Node ultimoNo){
        this.ultimoNo = ultimoNo;
    }

    public void insereNovoNo(int valor){
        Node novoNo = new Node();
        novoNo.setValor(valor);
        if(primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        }
        else{
            ultimoNo.setProximoNo(novoNo);
            ultimoNo = novoNo;
        }
    }
    public void listarItens(){
       Node noAtual = new Node();
       noAtual = primeiroNo;
       while (1==1){
           if(noAtual.getProximoNo()== null){
               System.out.print("["+noAtual.getValor()+"]\n");
               break;
           }
           else{
               System.out.print("["+noAtual.getValor()+"] ");
               noAtual = noAtual.getProximoNo();
           }
       }
    }
    public static void  main(String[] args){
        int op =0;
        int valor;
        Lista lista = new Lista();
        Scanner sc = new Scanner(System.in);
        while(op != 3){
            System.out.println("1-Inserir um numero\n2-Exibir itens da lista\n3-Sair");
            op = sc.nextInt();
            switch(op){
                case 1:
                    System.out.println("Insira o valor do item: ");
                    valor = sc.nextInt();
                    lista.insereNovoNo(valor);
                    break;
                case 2:
                    lista.listarItens();
                    break;
            }
        }
    }
}
