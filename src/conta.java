public class conta {
    //Atributos
    public  int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    public void estadoAtual(){
        System.out.println("--------------");
        System.out.println("número da Conta: " + this.getNumConta());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("dono: "+ this.getDono());
        System.out.println("saldo: "+ this.getStatus());
        System.out.println("status: "+this.getSaldo());
    }

    //metodos

    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t.equals("CC")) {
            setSaldo(50);
        } else if (t.equals("CP")) {
            setSaldo(150);
        }
    }


    public void fecharConta(){
        float s =  getSaldo();
        if (s>0){
            System.out.println("Conta tem dinheiro!");
        } else if (s<0) {
            System.out.println("Saldo devedor");
        }else {
            setStatus(false);
        }

    }

    public void depositar(float v) {
        if (getStatus()) {
            setSaldo(getSaldo() + v);
        } else {
            System.out.println("Impossível Depositar");

        }
    }

    public void sacar(float sac){
        if (getStatus()) {
            if (getSaldo()> sac) {
                setSaldo(getSaldo() - sac);
            } else if (getSaldo() < sac) {
                System.out.println("Saldo Insuficiente");
            }
        }
        }

    public void pagarMensal(){
     int v = 0;
     if(getTipo().equals("CC")){
       v=12;
     } else if (getTipo().equals("CP")) {
         v = 20;
     }
     if (getStatus()){
         if(getSaldo() > v){
             setSaldo(getSaldo()- v);
         } else{
             System.out.println("Saldo Insuficiente");

         }
     }else {
         System.out.println("Impossível Pagar");
     }
    }



    //Construtor
    public conta() {
        this.setStatus(false);
        this.setSaldo(0);
    }



    //GETTERS e SETTERS



    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }
}