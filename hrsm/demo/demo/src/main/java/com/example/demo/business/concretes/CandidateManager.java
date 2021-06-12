package com.example.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.CandidateService;
import com.example.demo.core.utilities.results.DataResult;
import com.example.demo.core.utilities.results.Result;
import com.example.demo.core.utilities.results.SuccessDataResult;
import com.example.demo.core.utilities.results.SuccessResult;
import com.example.demo.dataAccess.abstracts.CandidateDao;
import com.example.demo.entity.concretes.Candidate;
@Service
public class CandidateManager implements CandidateService {
	private CandidateDao candidateDao;

	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}

	@Override
	public DataResult<List<Candidate>> getall() {

		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(), "Candidate's data listed");
	}

	@Override
	public Result add(Candidate candidate) {

		this.candidateDao.save(candidate);
		return new SuccessResult("Candidate's data added");
	}

//	@Override
//	public DataResult<Candidate> candidateNationalityId(String nationalityNumber) {
//		
//		return new SuccessDataResult<Candidate>(this.candidateDao.findByNationalityId(nationalityNumber));
//	}

	
}
