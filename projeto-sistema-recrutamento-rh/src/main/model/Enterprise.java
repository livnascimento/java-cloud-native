package main.model;

import java.util.ArrayList;
import java.util.List;

public class Enterprise {

    private List<Candidate> talentPool = new ArrayList<Candidate>();
    private List<Oportunity> oportunities = new ArrayList<Oportunity>();

    public List<Candidate> getAllCandidates() { return talentPool; }
    public List<Oportunity> getAllOportunities() { return oportunities; }

    public void addCandidate(Candidate candidate){
        talentPool.add(candidate);
        return;
    }

    public void addOportunity(Oportunity oportunity){
        oportunities.add(oportunity);
        return;
    }

    public List<Candidate> listValidCandidates (Integer oportunity) {
        List<Candidate> validCandidates = new ArrayList<>();

        for (Candidate candidate : talentPool) {
            if (candidate.validateCandidate(candidate, oportunities.get(oportunity))) validCandidates.add(candidate);
        }

        return validCandidates;
    }
    
}
