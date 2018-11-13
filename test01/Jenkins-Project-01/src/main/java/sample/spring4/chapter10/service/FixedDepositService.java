package sample.spring4.chapter10.service;

import java.util.List;

import sample.spring4.chapter10.domain.FixedDepositDetails;

public interface FixedDepositService {
	
	public List<FixedDepositDetails> getFixedDeposits();
	public void saveFixedDeposit(FixedDepositDetails fixedDepositDetails);
	public void closeFixedDeposit(int fixedDepositId);
	public FixedDepositDetails getFixedDeposit(int fixedDepositId);
	public void editFixedDeposit(FixedDepositDetails fixedDepositDetails);
}
