package exercicios;

public class Exercitando {
    public static void main(String[] args) {
        Carro carro = new Carro("", "", 0d);
        Moto moto = new Moto("", "", 0d);
        Caminhao caminhao = new Caminhao("", "", 0d);

        carro.setCor("Branco");
        carro.setModelo("Lancer");
        carro.setTanque(15d);
        carro.tipo = "exercicios.Carro";

        moto.setCor("Amarelo");
        moto.setModelo("Hornet");
        moto.setTanque(8d);
        moto.tipo = "exercicios.Moto";

        caminhao.setCor("Preto");
        caminhao.setModelo("Volvo");
        caminhao.setTanque(30d);
        caminhao.tipo = "exercicios.Caminhao";

        System.out.println("");
        System.out.println("Tipo: " + carro.tipo);
        System.out.println("exercicios.Veiculo: " + carro.getModelo());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Capacidade do tanque: " + carro.getTanque());
        System.out.println("Número de portas: " + carro.portas);

        System.out.println("");
        System.out.println("Tipo: " + moto.tipo);
        System.out.println("exercicios.Veiculo: " + moto.getModelo());
        System.out.println("Cor: " + moto.getCor());
        System.out.println("Capacidade do tanque: " + moto.getTanque());
        System.out.println("Número de portas: " + moto.portas);

        System.out.println("");
        System.out.println("Tipo: " + caminhao.tipo);
        System.out.println("exercicios.Veiculo: " + caminhao.getModelo());
        System.out.println("Cor: " + caminhao.getCor());
        System.out.println("Capacidade do tanque: " + caminhao.getTanque());
        System.out.println("Número de portas: " + caminhao.portas);

        Funcionario a1 = new Gerente();//Upcast
        //exercicios.Gerente a2 = (exercicios.Gerente)new exercicios.Funcionario();//Downcast

        System.out.println(teste.soma);
        System.out.println(teste.subtracao);
        System.out.println(teste.multiplicacao);
        System.out.println(teste.divisao);
    }
}


class Veiculo{
    double valorGasolina = 5.74d;

    String cor;
    String modelo;
    double capacidadeTanque;
    boolean ligado;
    int portas;
    String tipo;

    Veiculo(String cor, String modelo, double cTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = cTanque;
        this.ligado = false;
        this.tipo = "";
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    void setCor(String cor){
        this.cor = cor;
    }

    void setTanque(double cTanque){
        this.capacidadeTanque = cTanque;
    }

    String getModelo(){
        return this.modelo;
    }

    String getCor(){
        return this.cor;
    }

    double getTanque(){
        return this.capacidadeTanque;
    }

    void abastecer(double cTanque){
        this.capacidadeTanque = valorGasolina * cTanque;
    }
}

class Carro extends Veiculo{

    Carro(String cor, String modelo, double cTanque) {
        super(cor, modelo, cTanque);
        this.portas = 4;
    }
}

class Moto extends Veiculo{

    Moto(String cor, String modelo, double cTanque){
        super(cor, modelo, cTanque);
        this.portas = 0;
    }
}

class Caminhao extends Veiculo{

    Caminhao(String cor, String modelo, double cTanque){
        super(cor, modelo, cTanque);
        this.portas = 2;
    }
}

class Funcionario{

}

class Gerente extends Funcionario{

}

class Vendedor extends Funcionario{

}

class Faxineiro extends Funcionario{

}

class Aluno{

}

class Discipline {
    Aluno aluno;
}

class Cupom{

}

class Compra {
    void finalizar(Cupom cupom){};
}

interface OperacaoMatematica{
    int soma = soma(1, 1);
    int subtracao = subtracao(1, 1);
    int multiplicacao = multiplicacao(1, 1);
    int divisao = divisao(1, 1);

    static int soma(int n1, int n2){
        return n1 + n2;
    };

    static int subtracao(int n1, int n2){
        return n1 - n2;
    };

    static int multiplicacao(int n1, int n2){
        return n1 * n2;
    };

    static int divisao(int n1, int n2){
        return n1 / n2;
    };
}

class teste implements OperacaoMatematica{
    static int soma = OperacaoMatematica.soma(5,5);
    static int subtracao = OperacaoMatematica.subtracao(5,5);
    static int multiplicacao = OperacaoMatematica.multiplicacao(5,5);
    static int divisao = OperacaoMatematica.divisao(5,5);
}



