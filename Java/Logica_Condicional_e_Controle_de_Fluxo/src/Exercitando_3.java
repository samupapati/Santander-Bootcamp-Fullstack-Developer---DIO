public class Exercitando_3 {
    public static void main(String[] args) {
        mes(8);
        diaSemana("domingo");
        numero(6);
    }
    
    public static void mes(int num){
        if(num == 1){
            System.out.println("Janeiro, férias!!");
        } else if(num == 2){
            System.out.println("Fevereiro");
        } else if(num == 3){
            System.out.println("Março");
        } else if(num == 4){
            System.out.println("Abril");
        } else if(num == 5){
            System.out.println("Maio");
        } else if(num == 6){
            System.out.println("Junho");
        } else if(num == 7){
            System.out.println("Julho, férias!!");
        } else if(num == 8){
            System.out.println("Agosto");
        } else if(num == 9){
            System.out.println("Setembro");
        } else if(num == 10){
            System.out.println("Outubro");
        } else if(num == 11){
            System.out.println("Novembro");
        } else if(num == 12){
            System.out.println("Dezembro, férias!!");
        } else{
            System.out.println("Digite um número de mês válido!");
        }
    }

    public static void diaSemana(String dia){
        switch (dia) {
            case "domingo":
                System.out.println("dia 1");
                break;
            case "segunda":
                System.out.println("dia 2");
                break;
            case "terça":
                System.out.println("dia 3");
                break;
            case "quarta":
                System.out.println("dia 4");
                break;
            case "quinta":
                System.out.println("dia 5");
                break;
            case "sexta":
                System.out.println("dia 6");
                break;
            case "sabado":
                System.out.println("dia 7");
                break;
            default:
                System.out.println("Dia inválido.");
                break;
        }
    }

    public static void numero(int num){
        switch (num){
            case 1, 2, 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Tá longe");
                break;
        }
    }
}
