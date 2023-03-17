/*Amor, eu fazendo as contas aqui, sabe o que percebi, realmente na Bia vai valer muito mais a pena,
porque? Vou dar um exemplo, vamos supor que fiz o mínimo de 4.000 por mês 
(dividir em porcentagem normal das clínicas de 35%) 4.000-35% pra mim,
ficaria 1.400 pra mim, ou seja, tá sendo muito mais válido ela me passar realmente o valor
fixo de 1.500 + 15% da comissão por fora ainda que vou fazer, agora vamos contar de novo, 4.000
(mínimo do mês todo) menos 15%pra mim dar 600,00 + 1500 fixo = 2.100 */

/*  Tenho que desenvolver um programa que leia o valor fixo do profissional +
comissão de 15% sob total de clientes atendidos, sendo o valor de cada atendimento R$ 120,00.
    Depois irá realizar o mesmo calculo levando em consideração outras empresas que não pagam salário fixo
somente a comissão de 35% em cima do total de clientes atendidos.
    Após as duas verificações, irá realizar uma comparação para saber qual das empresas vale mais 
a pena estar trabalhando. Obs: Preciso que me indique os valores também.

 PRIMEIRA PARTE:
 *Leia o nome da primeira empresa
 *Leia o nome da segunda empresa
 *Leia o valor de Salário fixo que a empresa oferece
 *Leia quantos clientes foram atendidos no mês e calcule 15% sob o total para saber
 quanto de comissão será entregue ao profissional e some ao saláro fixo, guarde em uma variavel.
  
 SEGUNDA PARTE:
 *Leia a quantidade de clientes atendidos no mês e calcule 35% sob o total para saber
 quanto de comissão será entregue ao profissional e guarde em uma variavel.
 
 TERCEIRA PARTE:
 *Calcule Var1 + Var2 e informe ao usuário qual das empresas vale mais a pena estar trabalhando
 apresentando os valores.
 
 */

import java.util.Scanner;
public class CalcularComissao {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o nome da primeira empresa");
        String empresa1 = input.nextLine();

        System.out.println("Agora me informe o nome da segunda empresa");        
        String empresa2 = input.nextLine();

        System.out.println("Qual o salário fixo entregue pela empresa "+empresa1+"?");
        double salarioFixo = input.nextDouble();

        System.out.println("Qual foi a quantidade de clientes atendidos esse mês na empresa "+empresa1+" ?");
        int qClientes1 = input.nextInt();

        System.out.println("Muito obrigado pelas informações!\n Agora me informe a quantidade de clientes atendidos na empresa "+empresa2);
        int qClientes2 = input.nextInt();

        double comissao1 = ((qClientes1*120)*0.15)+salarioFixo;
        double comissao2 = (qClientes2*120)*0.35;

        if(comissao1>comissao2){
            System.out.printf("A empresa %s paga o valor mensal de aproximadamente %.2f que é superior a empresa %s que paga aproximadamente %.2f",empresa1,comissao1,empresa2,comissao2);
        }
        else{
            System.out.printf("A empresa %s paga o valor mensal de aproximadamente %.2f que é superior a empresa %s que paga aproximadamente %.2f",empresa2,comissao2,empresa1,comissao1);
        }

    }
    
}
