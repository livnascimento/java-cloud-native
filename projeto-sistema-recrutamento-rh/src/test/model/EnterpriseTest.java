package test.model;

import main.model.Candidate;
import main.model.Enterprise;
import main.model.Oportunity;

import java.util.List;

public class EnterpriseTest {
    public static void main(String[] args) {
        testAddCandidate();
        testAddOportunity();
        testListValidCandidates();
    }

    public static void testAddCandidate() {
        Enterprise enterprise = new Enterprise();
        Candidate candidate = new Candidate("Maria Silva", 28, 400000, 2, "TI");
        enterprise.addCandidate(candidate);
        
        assert enterprise.getAllCandidates().size() == 1 : "Erro: Candidato não foi adicionado.";
        System.out.println("Teste testAddCandidate passou.");
    }

    public static void testAddOportunity() {
        Enterprise enterprise = new Enterprise();
        Oportunity oportunity = new Oportunity(500000, 2, "TI");
        enterprise.addOportunity(oportunity);
        
        assert enterprise.getAllOportunities().size() == 1 : "Erro: Oportunidade não foi adicionada.";
        System.out.println("Teste testAddOportunity passou.");
    }

    public static void testListValidCandidates() {
        Enterprise enterprise = new Enterprise();
        Candidate candidate1 = new Candidate("João Souza", 30, 450000, 3, "TI");
        Candidate candidate2 = new Candidate("Ana Costa", 27, 300000, 2, "RH");
        Oportunity oportunity = new Oportunity(500000, 3, "TI");

        enterprise.addCandidate(candidate1);
        enterprise.addCandidate(candidate2);
        enterprise.addOportunity(oportunity);
        
        List<Candidate> validCandidates = enterprise.listValidCandidates(0);
        assert validCandidates.size() == 1 : "Erro: Lista de candidatos válidos incorreta.";
        assert validCandidates.get(0).getFullName().equals("João Souza") : "Erro: Candidato inválido na lista.";
        
        System.out.println("Teste testListValidCandidates passou.");
    }
}
