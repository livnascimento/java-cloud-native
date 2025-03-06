import java.util.List;
import java.util.Scanner;

import main.model.Candidate;
import main.model.Enterprise;
import main.model.Oportunity;

public class Main {
    public static void main(String[] args) {
        Enterprise enterprise = new Enterprise();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Adicionar candidato");
            System.out.println("2. Adicionar vaga");
            System.out.println("3. List candidatos aptos a uma vaga");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Nome completo: ");
                    String name = scanner.nextLine();
                    
                    System.out.print("Idade: ");
                    int age = scanner.nextInt();
                    
                    System.out.print("Pretensão salarial (em centavos): ");
                    int salaryExpectation = scanner.nextInt();
                    
                    System.out.print("Nível de carreira: ");
                    int careerLevel = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Departamento: ");
                    String department = scanner.nextLine();
                    
                    Candidate candidate = new Candidate(name, age, salaryExpectation, careerLevel, department);
                    enterprise.addCandidate(candidate);
                    System.out.println("Candidato adicionado com sucesso!");
                    break;
                
                case 2:
                    System.out.print("Orçamento salarial da vaga (em centavos): ");
                    int salaryBudget = scanner.nextInt();
                    
                    System.out.print("Nível de carreira exigido: ");
                    int requiredCareerLevel = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Departamento: ");
                    String vagaDepartment = scanner.nextLine();
                    
                    Oportunity oportunity = new Oportunity(salaryBudget, requiredCareerLevel, vagaDepartment);
                    enterprise.addOportunity(oportunity);
                    System.out.println("Vaga adicionada com sucesso!");
                    break;
                
                case 3:
                    System.out.print("Informe o índice da vaga para comparar candidatos: ");
                    int vagaIndex = scanner.nextInt();
                    scanner.nextLine();
                    
                    List<Candidate> candidates = enterprise.listValidCandidates(vagaIndex);
                    
                    System.out.println("Candidatos aptos:");
                    for (Candidate c : candidates) 
                            System.out.println("- " + c.getFullName());
                    
                    break;
                
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
