package com.example.demo.business.abstracts;

import com.example.demo.core.utilities.results.Result;
import com.example.demo.entity.concretes.ActivationCode;
import com.example.demo.entity.concretes.User;

public interface ActivationCodeService {
	Result verifyUser(String verifyCode);
	void genarateVerifyCode(User user);
	void sendMail(String email);
	ActivationCode getActivationCode(String verifyCode);

	boolean existByVerifyCode(String verifyCode);

}
