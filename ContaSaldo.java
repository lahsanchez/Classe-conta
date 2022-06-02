
public class ContaSaldo
{
    private double saldo = 200;
    
    public void depositar (double valor){
        this.saldo += valor;
        System.out.println (saldo);
    }
    
    public boolean sacar(double valor){
        if (saldo >= valor && valor >0){
            saldo = saldo-valor;
            return true;
            
        } else{
            return false;
        }
    }
    
    
  public boolean transferencia(double valor, ContaSaldo c)  {
      if (saldo > valor){
          saldo = saldo - valor;
          c.depositar(valor);
          return true;
          
      } else{
          return false;
        }
  }
}
