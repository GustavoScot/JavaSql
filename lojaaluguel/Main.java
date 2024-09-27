package com.mycompany.lojaaluguel;

import java.sql.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operacoes operacoes = new Operacoes();
        int opcao = 0;

        while (opcao != 20) {
            System.out.println("==== Menu de Operações ====");
            System.out.println("1. Inserir Veículo");
            System.out.println("2. Listar Veículos");
            System.out.println("3. Atualizar Veículo");
            System.out.println("4. Excluir Veículo");
            System.out.println("5. Inserir Locatário");
            System.out.println("6. Listar Locatários");
            System.out.println("7. Inserir Funcionário");
            System.out.println("8. Listar Funcionários");
            System.out.println("9. Atualizar Funcionário");
            System.out.println("10. Excluir Funcionário");
            System.out.println("11. Inserir Locação");
            System.out.println("12. Listar Locações");
            System.out.println("13. Excluir Locação");
            System.out.println("14. Inserir Pagamento");
            System.out.println("15. Listar Pagamentos");
            System.out.println("16. Excluir Pagamento");
            System.out.println("17. Inserir Devolução");
            System.out.println("18. Listar Devoluções");
            System.out.println("19. Excluir Devolução");
            System.out.println("20. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: 
                    System.out.print("Marca: ");
                    String marca = scanner.next();
                    System.out.print("Modelo: ");
                    String modelo = scanner.next();
                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();
                    System.out.print("Placa: ");
                    String placa = scanner.next();
                    System.out.print("Status: ");
                    String status = scanner.next();
                    System.out.print("Preço Diário: ");
                    float precoDiario = scanner.nextFloat();
                    operacoes.inserirVeiculo(marca, modelo, ano, placa, status, precoDiario);
                    break;
                case 2: 
                    operacoes.listarVeiculos();
                    break;
                case 3: 
                    System.out.print("ID do Veículo: ");
                    int idVeiculoAtualizar = scanner.nextInt();
                    System.out.print("Novo Status: ");
                    String novoStatus = scanner.next();
                    operacoes.atualizarVeiculo(idVeiculoAtualizar, novoStatus);
                    break;
                case 4: 
                    System.out.print("ID do Veículo: ");
                    int idVeiculoExcluir = scanner.nextInt();
                    operacoes.excluirVeiculo(idVeiculoExcluir);
                    break;
                case 5: 
                    System.out.print("Nome: ");
                    String nomeLocatario = scanner.next();
                    System.out.print("CPF: ");
                    String cpfLocatario = scanner.next();
                    System.out.print("Telefone: ");
                    String telefoneLocatario = scanner.next();
                    System.out.print("Endereço: ");
                    String endereco = scanner.next();
                    System.out.print("Data de Nascimento (YYYY-MM-DD): ");
                    Date dataNascimento = Date.valueOf(scanner.next());
                    System.out.print("Email: ");
                    String emailLocatario = scanner.next();
                    operacoes.inserirLocatorio(nomeLocatario, cpfLocatario, telefoneLocatario, endereco, dataNascimento, emailLocatario);
                    break;
                case 6: 
                    operacoes.listarLocatorios();
                    break;
                case 7:
                    System.out.print("Nome: ");
                    String nomeFuncionario = scanner.next();
                    System.out.print("CPF: ");
                    String cpfFuncionario = scanner.next();
                    System.out.print("Cargo: ");
                    String cargo = scanner.next();
                    System.out.print("Telefone: ");
                    String telefone = scanner.next();
                    System.out.print("Email: ");
                    String email = scanner.next();
                    operacoes.inserirFuncionario(nomeFuncionario, cpfFuncionario, cargo, telefone, email);
                    break;
                case 8: 
                    operacoes.listarFuncionarios();
                    break;
                case 9: 
                    System.out.print("ID do Funcionário: ");
                    int idFuncionarioAtualizar = scanner.nextInt();
                    System.out.print("Novo Cargo: ");
                    String novoCargo = scanner.next();
                    operacoes.atualizarFuncionario(idFuncionarioAtualizar, novoCargo);
                    break;
                case 10: 
                    System.out.print("ID do Funcionário: ");
                    int idFuncionarioExcluir = scanner.nextInt();
                    operacoes.excluirFuncionario(idFuncionarioExcluir);
                    break;
                case 11: 
                    System.out.print("Data Início (YYYY-MM-DD): ");
                    Date dataInicio = Date.valueOf(scanner.next());
                    System.out.print("Data Fim (YYYY-MM-DD): ");
                    Date dataFim = Date.valueOf(scanner.next());
                    System.out.print("ID Veículo: ");
                    int idVeiculoLocacao = scanner.nextInt();
                    System.out.print("ID Locatário: ");
                    int idLocatarioLocacao = scanner.nextInt();
                    System.out.print("ID Funcionário: ");
                    int idFuncionarioLocacao = scanner.nextInt();
                    System.out.print("Status: ");
                    String statusLocacao = scanner.next();
                    operacoes.inserirLocacao(dataInicio, dataFim, idVeiculoLocacao, idLocatarioLocacao, idFuncionarioLocacao, statusLocacao);
                    break;
                case 12:
                    operacoes.listarLocacoes();
                    break;
                case 13: 
                    System.out.print("ID da Locação: ");
                    int idLocacaoExcluir = scanner.nextInt();
                    operacoes.excluirLocacao(idLocacaoExcluir);
                    break;
                case 14:
                    System.out.print("ID Locação: ");
                    int idLocacaoPagamento = scanner.nextInt();
                    System.out.print("Valor: ");
                    float valor = scanner.nextFloat();
                    System.out.print("Data do Pagamento (YYYY-MM-DD): ");
                    Date dataPagamento = Date.valueOf(scanner.next());
                    System.out.print("Método: ");
                    String metodo = scanner.next();
                    System.out.print("Status: ");
                    String statusPagamento = scanner.next();
                    operacoes.inserirPagamento(idLocacaoPagamento, valor, dataPagamento, metodo, statusPagamento);
                    break;
                case 15:
                    operacoes.listarPagamentos();
                    break;
                case 16: 
                    System.out.print("ID do Pagamento: ");
                    int idPagamentoExcluir = scanner.nextInt();
                    operacoes.excluirPagamento(idPagamentoExcluir);
                    break;
                case 17: 
                    System.out.print("ID Locação: ");
                    int idLocacaoDevolucao = scanner.nextInt();
                    System.out.print("Data Devolução (YYYY-MM-DD): ");
                    Date dataDevolucao = Date.valueOf(scanner.next());
                    System.out.print("Quilometragem: ");
                    int quilometragem = scanner.nextInt();
                    System.out.print("Condição do Veículo: ");
                    String condicaoVeiculo = scanner.next();
                    System.out.print("Multa: ");
                    float multa = scanner.nextFloat();
                    operacoes.inserirDevolucao(idLocacaoDevolucao, dataDevolucao, quilometragem, condicaoVeiculo, multa);
                    break;
                case 18:
                    operacoes.listarDevolucoes();
                    break;
                case 19: 
                    System.out.print("ID da Devolução: ");
                    int idDevolucaoExcluir = scanner.nextInt();
                    operacoes.excluirDevolucao(idDevolucaoExcluir);
                    break;
                case 20: 
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
        scanner.close();
    }
}
