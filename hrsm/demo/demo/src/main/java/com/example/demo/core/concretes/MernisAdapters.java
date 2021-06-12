package com.example.demo.core.concretes;

import java.rmi.RemoteException;

import com.example.demo.core.abstracts.MernisService;
import com.example.demo.entity.concretes.Candidate;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapters implements MernisService{

	@Override
	public boolean checkIfRealPerson(Candidate candidate) {
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		boolean result=false;
		try {
			result=client.TCKimlikNoDogrula(
						Long.valueOf(candidate.getNationality_id()), 
						candidate.getFirst_name(), 
						candidate.getLast_name(), 
						candidate.getDateofbirth());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}
