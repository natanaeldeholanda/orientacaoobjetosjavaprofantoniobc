package unidade04;

public class Comissionado extends ServidorPublico {
   private double comissao;
   private double salarioFixo;

   public Comissionado(double salarioFixo, double comissao, int matricula, String nome) {
       super(matricula, nome);
       this.salarioFixo = salarioFixo;
       this.comissao = comissao;
   }
   public double getComissao() {
       return comissao;
   }
   public void setComissao(double comissao) {
       this.comissao = comissao;
   }

    @Override
    public String toString() {
        return "Comissionado{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", salarioFixo=" + salarioFixo +
                ", comissao=" + comissao +
                "} ";
    }
}
